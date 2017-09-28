package com.example.demo.interceptor;

import com.example.demo.utils.SessionContainer;
import com.example.demo.utils.SpringContextUtil;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.*;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

/**
 * Created  at 2017/8/28.
 */

@Intercepts({
        @Signature(type = Executor.class, method = "update", args = {
                MappedStatement.class, Object.class})})
public class MyBatisInterceptor implements Interceptor {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyBatisInterceptor.class);

    private static final String CREATEDUSERID = "createdUserId";
    private static final String CREATEDTIME = "createdTime";
    private static final String CREATEDUSERNAME = "createdUserName";
    private static final String UPDATEDUSERNAME = "updatedUserName";
    private static final String UPDATEDUSERID = "updatedUserId";
    private static final String UPDATEDTIME = "updatedTime";
//    private static final String LOWER_CASE_PRIMARY_KEY = "id";
//    private static final String UPPER_CASE_PRIMARY_KEY = "ID";

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        LOGGER.info("mybatis 自定义拦截器拦截到请求  MyBatisInterceptor .......................");
        MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];
        SqlCommandType sqlCommandType = mappedStatement.getSqlCommandType();
        if (isEmptyArgs(invocation) || notInsertOrUpdate(sqlCommandType) || isNullParameter(invocation)) {
            return invocation.proceed();
        }
        Object parameter = invocation.getArgs()[1];
        if (HashMap.class.isAssignableFrom(parameter.getClass())) {
            Map paramMap = (HashMap) parameter;
            if (paramMap.containsKey("record")) {
                Object record = paramMap.get("record");
                fillSpecifiedField(record, sqlCommandType);
            } else if (paramMap.containsKey("list")) {
                List listParam = (List) paramMap.get("list");
                for (Object param : listParam) {
                    fillSpecifiedField(param, sqlCommandType);
                }
            }
        } else {
            fillSpecifiedField(parameter, sqlCommandType);
        }
        return invocation.proceed();

    }

    private void fillSpecifiedField(Object record, SqlCommandType sqlCommandType) {
        String userId = getUserId();
        String userName = getUserName();
        Field[] fields = record.getClass().getDeclaredFields();
        for (Field field : fields) {
            try {
                initField(sqlCommandType, userId, userName, field, record);
            } catch (IllegalAccessException e) {
                LOGGER.warn("set class= {}-{} field fail", record.getClass().getName(), field.getName());
            }
        }
    }

    private boolean isNullParameter(Invocation invocation) {
        Object parameter = invocation.getArgs()[1];
        return parameter == null;
    }

    private boolean notInsertOrUpdate(SqlCommandType sqlCommandType) {
        return sqlCommandType == null || SqlCommandType.DELETE == sqlCommandType;
    }

    private boolean isEmptyArgs(Invocation invocation) {
        return invocation.getArgs() == null || invocation.getArgs().length <= 1;
    }

    @Override
    public Object plugin(Object o) {
        return Plugin.wrap(o, this);
    }

    @Override
    public void setProperties(Properties properties) {
    }

    /**
     * 填充字段
     *
     * @param sqlCommandType sql类型
     * @param userId         当前登录人id
     * @param userName       当前登录人姓名
     * @param field          字段对象
     * @param parameter      赋值对象
     */
    private void initField(SqlCommandType sqlCommandType, String userId, String userName, Field field, Object parameter) throws IllegalAccessException {
        if (UPDATEDTIME.equals(field.getName())) {
            field.setAccessible(true);
            field.set(parameter, DateTime.now().toDate());
            field.setAccessible(false);
        } else if (UPDATEDUSERID.equals(field.getName()) && null == getFieldValue(field, parameter)) {
            field.setAccessible(true);
            field.set(parameter, userId);
            field.setAccessible(false);
        } else if (UPDATEDUSERNAME.equals(field.getName()) && null == getFieldValue(field, parameter)) {
            field.setAccessible(true);
            field.set(parameter, userName);
            field.setAccessible(false);
        }
        if (SqlCommandType.INSERT == sqlCommandType) {
            if (CREATEDTIME.equals(field.getName()) && null == getFieldValue(field, parameter)) {
                field.setAccessible(true);
                field.set(parameter, DateTime.now().toDate());
                field.setAccessible(false);
            } else if (CREATEDUSERID.equals(field.getName()) && null == getFieldValue(field, parameter)) {
                field.setAccessible(true);
                field.set(parameter, userId);
                field.setAccessible(false);
            } else if (CREATEDUSERNAME.equals(field.getName()) && null == getFieldValue(field, parameter)) {
                field.setAccessible(true);
                field.set(parameter, userName);
                field.setAccessible(false);
            }
//            else if ((LOWER_CASE_PRIMARY_KEY.equals(field.getName()) || UPPER_CASE_PRIMARY_KEY.equals(field.getName()))
//                    && null == getFieldValue(field, parameter)) {
//                field.setAccessible(true);
//                field.set(parameter, UUID.randomUUID().toString().replaceAll("-", "").toUpperCase());
//                field.setAccessible(false);
//            }
        }
    }

    private Object getFieldValue(Field field, Object object) {
        try {
            // 如果类型是Date
            if (field.getGenericType().toString().equals(
                    "class java.util.Date")) {
                Method m = object.getClass().getMethod(
                        "get" + getMethodName(field.getName()));
                return m.invoke(object);
            }
            // 如果类型是String
            if (field.getGenericType().toString().equals(
                    "class java.lang.String")) {
                Method m = object.getClass().getMethod(
                        "get" + getMethodName(field.getName()));
                return m.invoke(object);
            }
        } catch (Exception e) {
            LOGGER.error("get field value error");
        }
        return null;
    }

    // 把一个字符串的第一个字母大写、效率是最高的、
    private String getMethodName(String fildeName) {
        byte[] items = fildeName.getBytes();
        items[0] = (byte) ((char) items[0] - 'a' + 'A');
        return new String(items);
    }

    public String getUserId() {
        String userId = "";
        try {
            SessionContainer sessionContainer = (SessionContainer) SpringContextUtil.getBean("sessionContainer");
            // userId = sessionContainer.getCurrentUser().getUsername();
        } catch (Exception e) {
            LOGGER.debug("myBatisInterceptor did not get currentUser !");
            userId = "admin";
        }
        return userId;
    }

    public String getUserName() {
        String userName = "";
        try {
            SessionContainer sessionContainer = (SessionContainer) SpringContextUtil.getBean("sessionContainer");
            //userName = sessionContainer.getCurrentUser().getChinesename();
        } catch (Exception e) {
            LOGGER.debug("myBatisInterceptor did not get currentUser !");
            userName = "系统管理员";
        }
        return userName;
    }
}
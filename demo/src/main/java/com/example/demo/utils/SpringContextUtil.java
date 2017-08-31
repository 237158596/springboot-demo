package com.example.demo.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created  at 2017/8/28.
 */
@Component
public class SpringContextUtil implements ApplicationContextAware {

    // Spring应用上下文环境
    private static ApplicationContext applicationContext;

    /**
     * 实现ApplicationContextAware接口的回调方法，设置上下文环境
     *
     * @param applicationContext
     */
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    /**
     * @return ApplicationContext
     */
    public  ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    /**
     * 获取对象
     *
     * @param name
     * @return Object
     * @throws BeansException
     */
    public static  Object getBean(String name) throws BeansException {
        return applicationContext.getBean(name);
    }

    /**
     *
     * @Method: getBean
     * @Description: TODO
     * @param @param name
     * @param @param requiredType
     * @param @return
     * @param @throws BeansException
     * @return Object
     * @throws
     */

    public static  Object getBean(String name, Class<?> requiredType)
            throws BeansException {
        return applicationContext.getBean(name, requiredType);
    }

    /**
     *
     * @Method: containsBean
     * @Description: TODO
     * @param @param name
     * @param @return
     * @return boolean
     * @throws
     */
    public static boolean containsBean(String name) {
        return applicationContext.containsBean(name);
    }

    /**
     *
     * @Method: isSingleton
     * @Description: TODO
     * @param @param name
     * @param @return
     * @param @throws NoSuchBeanDefinitionException
     * @return boolean
     * @throws
     */
    public static  boolean isSingleton(String name)
            throws NoSuchBeanDefinitionException {
        return applicationContext.isSingleton(name);
    }

    /**
     *
     * @Method: getType
     * @Description: TODO
     * @param @param name
     * @param @return
     * @param @throws NoSuchBeanDefinitionException
     * @return Class
     * @throws
     */

    public  Class<?> getType(String name)
            throws NoSuchBeanDefinitionException {
        return applicationContext.getType(name);
    }

    /**
     *
     * @Method: getAliases
     * @Description: TODO
     * @param @param name
     * @param @return
     * @param @throws NoSuchBeanDefinitionException
     * @return String[]
     * @throws
     */

    public  String[] getAliases(String name)
            throws NoSuchBeanDefinitionException {
        return applicationContext.getAliases(name);
    }
}

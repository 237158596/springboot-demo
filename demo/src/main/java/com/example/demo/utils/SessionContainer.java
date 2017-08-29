package com.example.demo.utils;

import com.example.demo.Constant.Constants;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created  at 2017/8/28.
 */
@Component
public class SessionContainer {

  //  @Autowired
//    private RedisUtil redisUtil;

    private HttpServletRequest getRequest() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return request;
    }

    public String getSsoToken() {
        HttpServletRequest request = getRequest();
        String ssoToken = StringUtils.isNotBlank(request.getHeader(Constants.X_SSO_TOKEN)) ? request.getHeader(Constants.X_SSO_TOKEN) : request.getParameter(Constants.X_SSO_TOKEN_GET);
        return ssoToken;
    }

//    public UserInfoCache getCurrentUser() {
//        try {
//            HttpServletRequest request = getRequest();
//            String ssoToken = StringUtils.isNotBlank(request.getHeader(Constants.X_SSO_TOKEN)) ? request.getHeader(Constants.X_SSO_TOKEN) : request.getParameter(Constants.X_SSO_TOKEN_GET);
//            if (ssoToken == null) {
//                throw new TipException(ErrorEnum.SSO_TOKEN_ERROR);
//            }
//            //根据token从cache里面取值
//            UserInfoCache userInfoCache = (UserInfoCache) redisUtil.get(ssoToken);
//            if (userInfoCache == null) {
//                throw new TipException(ErrorEnum.LOGIN_OVERDUE);
//            }
//            return userInfoCache;
//        } catch (Exception e) {
//            throw new BizException(e.getMessage(), e, ErrorEnum.LOAD_USER_INFO_ERROR);
//        }
//    }
}

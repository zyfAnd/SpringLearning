package com.zhangyanfu.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author Zhang Yanfu
 * @Date 2018/1/3.
 * @Email 1105564280@qq.com
 */
public class LoginInterceptor implements HandlerInterceptor {
    private Logger logger = LoggerFactory.getLogger(getClass());
    /**
     * 在controller 之前调用
     * 返回值为false 的时候整个请求就结束了
     * 多个interceptor 会根据配置的先后顺序调用
     * 其中这些
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @return
     * @throws Exception
     */
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        HttpSession session = httpServletRequest.getSession();
        Object user = session.getAttribute("user");
        if(user==null){
            logger.info("user===null");
            httpServletResponse.sendRedirect("/login");
            return false;
        }
        return true;

    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        logger.info("postHandle------------");
    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        logger.info("afterCompletion------------");
    }
}

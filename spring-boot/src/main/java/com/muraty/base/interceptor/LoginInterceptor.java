package com.muraty.base.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 使用spring拦截器验证登录信息
 */
public class LoginInterceptor implements HandlerInterceptor {

    private Logger log = LoggerFactory.getLogger(getClass());

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        HttpSession session = request.getSession();

        if (session.getAttribute("version") == null) {
            log.debug("session is {}", session.getId());
            log.debug(" [ 登录验证 ] ");
        }
        return true;
    }

    public void postHandle(HttpServletRequest rq, HttpServletResponse rp, Object o, ModelAndView mv) throws Exception {
    }

    public void afterCompletion(HttpServletRequest rq, HttpServletResponse rp, Object o, Exception e) throws Exception {
    }

}

package com.muraty.navigation.controller;

import com.muraty.base.ILog;
import com.muraty.navigation.service.NavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * spring-boot 登录
 * /home/** 下的请求不需要进入拦截器
 * {@link com.muraty.base.config.InterceptorConfigurer}
 *
 * @author muraty
 */
@Controller
@RequestMapping("home")
public class LoginController extends ILog {

    @Autowired private NavService navService;

    /**
     * 访问任何html
     */
    @RequestMapping("/")
    String home() {
        return "login/login";
    }

    /**
     * 验证成功调至首页
     */
    @RequestMapping("login")
    String login(HttpSession session) {
        // 将版本信息放入session (模拟登录)
        session.setAttribute("version",navService.version());
        log.debug(" [ 用户信息验证成功,登录系统,进入首页 ] ");
        return "redirect:/";
    }

    /**
     * 退出成功回登录页
     */
    @RequestMapping("logout")
    String logout(HttpSession session) {
        session.invalidate();
        log.debug(" [ 用户信息清除,进入登录页 ] ");
        return "redirect:/";
    }

}

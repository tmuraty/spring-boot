package com.muraty.navigation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * spring-boot 首页
 *
 * @author muraty
 */
@Controller
public class HomeController {

    /**
     * 访问根目录
     */
    @RequestMapping("/")
    String home() {
        return "home";
    }

    /**
     * 访问根目录
     */
    @RequestMapping("/{page}")
    String tests(@PathVariable("page") String page) {
        return "tests/" + page;
    }

    /**
     * 错误页面跳转
     */
    @RequestMapping("/error/{code}")
    String error(@PathVariable("code") String code) {
        return "error/" + code;
    }

}

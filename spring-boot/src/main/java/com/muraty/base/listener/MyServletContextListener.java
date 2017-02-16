package com.muraty.base.listener;

import com.muraty.base.ILog;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 使用@WebListener注解，实现ServletContextListener接口
 *
 * @author  muraty
 */
@WebListener
public class MyServletContextListener extends ILog implements ServletContextListener {

    public void contextInitialized(ServletContextEvent event) {
        log.debug("init listener");
        log.debug(event.getServletContext().getServerInfo());
    }

    public void contextDestroyed(ServletContextEvent event) {
        log.debug("destroy listener");
    }

}
package com.muraty.base.filter;

import com.muraty.base.ILog;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 模拟字符过滤器
 *
 * @author muraty
 */
@WebFilter(filterName = "iEncodingFilter", urlPatterns = "/*")
public class EncodingFilter extends ILog implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
//        log.debug("init filter");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        log.debug("do filter");
        chain.doFilter(request, response);
    }

    public void destroy() {
//        log.debug("destroy filter");
    }
}

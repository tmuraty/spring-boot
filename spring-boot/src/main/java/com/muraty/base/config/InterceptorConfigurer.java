package com.muraty.base.config;

import com.muraty.base.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 拦截器初始化
 *
 * @author muraty
 */
@Configuration
public class InterceptorConfigurer extends WebMvcConfigurerAdapter {

    @Value("${i.upload.path}")
    private String uploadPath;

    /**
     * 多个拦截器组成一个拦截器链
     * addPathPatterns 用于添加拦截规则
     * excludePathPatterns 用户排除拦截
     */
    public void addInterceptors(InterceptorRegistry registry) {
        registry
                .addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/home/**");
        super.addInterceptors(registry);
    }

    /**
     * 增加静态资源访问路径
     */
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler(uploadPath + "/**")
                .addResourceLocations("classpath:" + uploadPath + "/");
        super.addResourceHandlers(registry);
    }

}

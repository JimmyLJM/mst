package com.prc_springboot.mst.config;

import com.prc_springboot.mst.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    public LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截路径，表示此路径下的所有地址都会先执行此拦截器，通过之后才能访问Controller
        String[] addPathPatterns = {
                "/demo/*"
        };
        registry.addInterceptor(loginInterceptor).addPathPatterns(addPathPatterns)
                .excludePathPatterns("/swagger-resources/**", "/webjars/**", "/v2/**", "/swagger-ui.html/**");

    }
}

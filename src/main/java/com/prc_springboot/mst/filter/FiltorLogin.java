package com.prc_springboot.mst.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * Spring Boot 自定义过滤器
 *
 *  1、实现javax.servlet下的Filter重写相应方法
 *  2、在启动类中增加 bean  FilterRegistrationBean
 */
public class FiltorLogin implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("FiltorLogin实现Filter方式过滤器执行");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("FiltorLogin实现Filter方式过滤器初始化");
    }

    @Override
    public void destroy() {
        System.out.println("FiltorLogin实现Filter方式代码注册过滤器销毁");
    }
}

package com.prc_springboot.mst.filter;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 注解方式实现自定义过滤器
 *  1、实现Filter
 *  2、使用注解@webFilter来注入filter  设置filterName 和 urlPatterns
 *  3、使用@Order注解设置过滤器执行顺序
 *  4、@ServletComponentScan修饰启动配置类启动自动扫描
 */
@Order(1)
@WebFilter(filterName = "TagFilter",urlPatterns = {"/tagapi/*"})
public class FilterTag implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("注解方式注入Filter：FilterTag执行");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("注解方式注入Filter：FilterTag初始化");
    }

    @Override
    public void destroy() {
        System.out.println("注解方式注入Filter：FilterTag销毁");
    }
}

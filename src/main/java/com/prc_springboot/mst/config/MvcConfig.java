package com.prc_springboot.mst.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurationSupport {

    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        /**重写addResourceHandlers来实现静态资源的映射,
         * 不要使用application.properties中添加配置来实现映射，
         * 不然资源会映射不成功导致打开页面资源一直加载不到
         */
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");

        /**
         * SpringBoot自动配置本身并不会把/swagger-ui.html
         * 这个路径映射到对应的目录META-INF/resources/下面
         * 采用WebMvcConfigurerAdapter将swagger的静态文件进行发布;
         */
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");


        super.addResourceHandlers(registry);
    }

}
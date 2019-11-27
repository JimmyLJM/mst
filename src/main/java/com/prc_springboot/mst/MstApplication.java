package com.prc_springboot.mst;

import com.prc_springboot.mst.filter.FiltorLogin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = {"com"})
@ServletComponentScan
@EnableAutoConfiguration()
@EnableCaching
@EnableSwagger2
public class MstApplication {

	public static void main(String[] args) {
		SpringApplication.run(MstApplication.class, args);
	}

	/**
	 * 代码方式注入自定义过滤器第2步
	 * @return
	 */
	@Bean
	public FilterRegistrationBean MyFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new FiltorLogin());
		// 设置过滤url路径
		registration.addUrlPatterns("/demo/*");
		registration.addInitParameter("paramName", "paramValue");
		registration.setName("MyFilter");
		registration.setOrder(1);
		return registration;
	}
}

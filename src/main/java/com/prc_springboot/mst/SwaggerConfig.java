package com.prc_springboot.mst;


import com.prc_springboot.mst.swagger.Swagger2MetaConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 待修复
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

   /* @Value("${swagger2.path}")
    private String swagger2SCanPath;

    @Autowired
    private Swagger2MetaConfig metaConfig;*/

    @Bean
    public Docket createRestApi() {// 创建API基本信息
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.prc_springboot.mst.contoller"))// 扫描该包下的所有需要在Swagger中展示的API，@ApiIgnore注解标注的除外
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {// 创建API的基本信息，这些信息会在Swagger UI中进行显示
        /*return new ApiInfoBuilder()
                .title(metaConfig.getTitle())
                .description(metaConfig.getDescription())// API描述
                .version(metaConfig.getVersion())// 版本号
                .build();*/

        return new ApiInfoBuilder()
                .title("xx")
                .description("xx")// API描述
                .version("xx")// 版本号
                .build();
    }
}

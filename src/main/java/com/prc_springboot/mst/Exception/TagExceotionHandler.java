package com.prc_springboot.mst.Exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.boot.web.reactive.error.ErrorAttributes;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.List;
import java.util.Map;


/**
 * 全局异常处理
 *
 * 自定义全局处理controller
 *  可以继承 BasicErrorController 也可以继承AbstractErrorController
 *  重写相应方法
 *
 *  然后在配置类中将这个类的bean注入。这样即可完成
 *
 *  原因 BasicErrorController注入的位置是 ErrorMvcAutoConfiguration
 *  注入的注解中 ConditionalOnMissingBean
 *
 *  本次代码并没有写成功.以后应用中如果需要会在这里补充进去
 */
public class TagExceotionHandler/* extends BasicErrorController */{

   /* private final ErrorProperties errorProperties;
    private static final Logger LOGGER = LoggerFactory.getLogger(TagExceotionHandler.class);

    @Autowired
    private ApplicationContext applicationContext;

    public TagExceotionHandler(ErrorAttributes errorAttributes,
                                ErrorProperties errorProperties) {
        this(errorAttributes, errorProperties,
                Collections.<ErrorViewResolver>emptyList());
    }

    public TagExceotionHandler(ErrorAttributes errorAttributes,
                                ErrorProperties errorProperties, List<ErrorViewResolver> errorViewResolvers) {
        super(errorAttributes, errorViewResolvers);
        Assert.notNull(errorProperties, "ErrorProperties must not be null");
        this.errorProperties = errorProperties;
    }

    @Override
    public String getErrorPath() {
        return this.errorProperties.getPath();
    }

    @RequestMapping(produces = "text/html")
    public ModelAndView errorHtml(HttpServletRequest request,
                                  HttpServletResponse response) {
        HttpStatus status = getStatus(request);
        Map<String, Object> model = Collections.unmodifiableMap(getErrorAttributes(
                request, isIncludeStackTrace(request, MediaType.TEXT_HTML)));
        response.setStatus(status.value());
        ModelAndView modelAndView = resolveErrorView(request, response, status, model);
        insertError(request);
        return modelAndView == null ? new ModelAndView("error", model) : modelAndView;
    }



    @RequestMapping
    @ResponseBody
    public ResponseEntity<Map<String, Object>> error(HttpServletRequest request) {
        Map<String, Object> body = getErrorAttributes(request,
                isIncludeStackTrace(request, MediaType.ALL));
        HttpStatus status = getStatus(request);
        insertError(request);
        return new ResponseEntity(body, status);
    }

    *//**
     * Determine if the stacktrace attribute should be included.
     *
     * @param request  the source request
     * @param produces the media type produced (or {@code MediaType.ALL})
     * @return if the stacktrace attribute should be included
     *//*
    protected boolean isIncludeStackTrace(HttpServletRequest request,
                                          MediaType produces) {
        ErrorProperties.IncludeStacktrace include = getErrorProperties().getIncludeStacktrace();
        if (include == ErrorProperties.IncludeStacktrace.ALWAYS) {
            return true;
        }
        if (include == ErrorProperties.IncludeStacktrace.ON_TRACE_PARAM) {
            return getTraceParameter(request);
        }
        return false;
    }

    *//**
     * Provide access to the error properties.
     *
     * @return the error properties
     *//*
    protected ErrorProperties getErrorProperties() {
        return this.errorProperties;
    }*/

}

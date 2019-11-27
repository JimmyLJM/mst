package com.prc_springboot.mst.util;

import java.lang.annotation.*;

/**
 * 自定义注解用来AOP打印日志
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TagLog {

    /** 要执行的操作类型比如：add操作 **/
    public String operationType() default "";

    /** 要执行的具体操作比如：添加用户 **/
    public String operationName() default "";
}

package com.prc_springboot.mst.Exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 使用 @ControllerAdvice + @ExceptionHandler方式进行统一异常管理
 * basePackages 指定拦截包当然还有其他参数  此类中仅对controller包进行处理
 * 呃..忽略字母错误,
 */
@ControllerAdvice(basePackages = "com.prc_springboot.mst.contoller")
public class GlobalExceptionHandler {

    public static final String DEFAULT_ERROR_VIEW = "error";

    @ExceptionHandler(value = GlobalException.class)
    @ResponseBody
    public ResponseEntity defaultErrorHandler(HttpServletRequest req, GlobalException e) throws Exception {
        return ResponseEntity.ok("全局异常捕捉");
    }

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;
    }

}

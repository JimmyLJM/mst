package com.prc_springboot.mst.Exception;


/**
 * 自定义全局异常类
 *  继承RuntimeException，
 *  若继承Exception，Spring可能不会回滚事务
 */
public class GlobalException extends  RuntimeException{

    private int code; //因为我需要将异常信息也返回给接口中，所以添加code区分

    public GlobalException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

package com.prc_springboot.mst.response;

/**
 * 自定义返回值枚举类
 */
public enum ResultEnum {

    SUCCESS(200,"成功"),
    FAIL(100,"失败"),
    EXCEPTION(300,"系统异常"),
    UNLOGIN(201,"未登录");

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

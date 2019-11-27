package com.prc_springboot.mst.response;

/**
 * 统一返回值类型
 */
public class DataResult<T> {

    private T data;
    private Integer code;
    private String msg;

    public T getData() {
        return data;
    }

    private void setData(T data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    private void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    private void setMsg(String msg) {
        this.msg = msg;
    }

    /**默认成功返回**/
    public static DataResult ok(){
        DataResult result = new DataResult();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        return result;
    }

    /**默认失败返回**/
    public static DataResult fail(){
        DataResult result = new DataResult();
        result.setCode(ResultEnum.FAIL.getCode());
        result.setMsg(ResultEnum.FAIL.getMsg());
        return result;
    }

    /**失败：自定义返回信息**/
    public static DataResult fail(String msg){
        DataResult result = new DataResult();
        result.setCode(ResultEnum.FAIL.getCode());
        result.setMsg(msg);
        return result;
    }
}

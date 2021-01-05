package com.rft.spring.base;

/**
 * 封装统一返回结果统一处理结果
 * @param <T>
 */
public class Response<T> {

    private Integer code;

    private String msg;

    private T  param;

    public static <T> Response<T> create(){
        Response response=new Response();
        response.setCode(100);
        response.setMsg("OK");
        return response;
    }

    public static <T> Response<T> create(T t){
        Response response=new Response();
        response.setCode(100);
        response.setMsg("OK");
        response.setParam(t);
        return response;
    }

    public static  Response Ok(){
        return create();
    }

    public static  <T> Response<T> Ok(T t){
        return create(t);
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

    public T getParam() {
        return param;
    }

    public void setParam(T param) {
        this.param = param;
    }
}

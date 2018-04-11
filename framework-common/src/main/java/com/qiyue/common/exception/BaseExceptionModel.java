package com.qiyue.common.exception;

/**
 * Created with Intellij IDEA.
 * User : Yebinghuan
 * Created on 2018/2/10.
 * Description :
 *   错误信息模型 用于封装错误信息
 */
public class BaseExceptionModel {
    private  String message;
    private  int code;


    public BaseExceptionModel(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

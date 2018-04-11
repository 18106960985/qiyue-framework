package com.qiyue.vo;

/**
 * Created by y747718944 on 2018/2/6
 * 基本的response 返回集
 */
public class BaseResult {

    //状态
    private int status= 200;
    //返回消息
    private String message;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

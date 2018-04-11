package com.qiyue.common.exception;

/**
 * Created by y747718944 on 2018/1/25
 * 自定义运行异常基类
 */
public class BaseException extends  RuntimeException {

    /**
     * 错误编码
     */
    private int errorCode;

    /**
     * 构建一个基本异常
     * @param message 异常描述
     */
    public BaseException(String message){
        super(message);
    }

    /**
     * 构建一个基本异常
     * @param message 异常描述
     * @param errorCode 异常编码
     */
    public BaseException(String message,int errorCode){
        super(message);
        this.errorCode=errorCode;

    }

    /**
     * 构建一个基本异常
     * @param message 异常描述
     * @param cause   根异常类（可以存入任何异常）
     */
    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * 构建一个基本异常
     * @param cause 根异常类（可以存入任何异常）
     */
    public BaseException(Throwable cause) {
        super(cause);
    }

    /**
     * 构建一个基本异常
     * @param message 异常描述
     * @param cause  根异常类（可以存入任何异常）
     * @param enableSuppression
     * @param writableStackTrace
     */
    public BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}

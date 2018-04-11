package com.qiyue.common.model;

/**
 * 作为 biz层
 */
public class BizResultModel {

    /**
     * 消息
     * 用于自定义异常处理
     */
    private String msg;

    /**
     * 是否成功
     * 用于自定义异常处理 默认为true
     */
    private boolean flag = true;

    /**
     * 新对象
     */
    private Object obj;
    /**
     * 旧对象
     */
    private Object oldObj;

    /**
     * 是否是数组
     */
    private boolean isList;


    public BizResultModel() {
    }


    public BizResultModel(Object oldObj, Object obj,  boolean isList) {
        this.obj = obj;
        this.oldObj = oldObj;
        this.isList = isList;
    }

    public BizResultModel(Object obj, boolean isList) {
        this.obj = obj;
        this.isList = isList;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Object getOldObj() {
        return oldObj;
    }

    public void setOldObj(Object oldObj) {
        this.oldObj = oldObj;
    }

    public boolean isList() {
        return isList;
    }

    public void setList(boolean list) {
        isList = list;
    }
}

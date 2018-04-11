package com.qiyue.model;

import com.qiyue.common.model.BaseEntity;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Table(name = "SystemLog")
@DynamicInsert
@DynamicUpdate
public class SystemLogEntity extends BaseEntity{
    private String method;
    private String params;
    private String ip;
    private String exception;
    private String description;


    @Column(name = "method",length = 60)
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Column(name = "params",length = 255)
    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }
    @Column(name = "ip",length = 32)
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    @Column(name = "exception",length = 255)
    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }
    @Column(name = "description",length = 255)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

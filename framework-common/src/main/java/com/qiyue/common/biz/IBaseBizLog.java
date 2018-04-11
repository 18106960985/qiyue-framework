package com.qiyue.common.biz;

import com.qiyue.common.model.BizResultModel;
import com.qiyue.orm.jpa.dao.BaseService;

import java.io.Serializable;
import java.util.List;

/**
 * created by yebinghuan on 2018/3/29
 *  作为 业务日志 的接口命名
 */
public interface IBaseBizLog<T, ID extends Serializable> extends BaseService<T,ID> {

    public BizResultModel created(T entity);

    public BizResultModel created(List<T>  list);

    public BizResultModel update(ID id,T entity);

    public BizResultModel deleteLog(ID id);

    public BizResultModel deleteLog(List<ID> ids);

}

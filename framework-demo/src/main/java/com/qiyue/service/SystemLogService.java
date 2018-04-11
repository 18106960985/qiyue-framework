package com.qiyue.service;

import com.qiyue.model.SystemLogEntity;

import java.util.List;

/**
 *
 */
public interface SystemLogService {

    public void saveLog(SystemLogEntity log) throws Exception;

    public List<SystemLogEntity> queryAll();
}

package com.qiyue.service.impl;

import com.qiyue.annotation.SystemServiceLog;
import com.qiyue.model.SystemLogEntity;
import com.qiyue.orm.jpa.dao.impl.BaseServiceImpl;
import com.qiyue.repository.SystemLogRepository;
import com.qiyue.service.SystemLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by y747718944 on 2018/1/22
 */
@Service
@Transactional
public class SystemLogServiceImpl extends BaseServiceImpl<SystemLogEntity,Long> implements SystemLogService {

    @Autowired
    private SystemLogRepository systemLogRepository;
    @Override

    @SystemServiceLog(description = "日志记录")
    public void saveLog(SystemLogEntity log) throws Exception {
        systemLogRepository.save(log);

    }

    @Override
    @SystemServiceLog(description = "日志记录")
    public List<SystemLogEntity> queryAll() {

        return systemLogRepository.findAll();
    }
}

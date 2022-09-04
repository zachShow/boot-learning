package com.example.mysqltest.db1.service.impl;

import com.example.mysqltest.db1.dao.WorkingSheetDao;
import com.example.mysqltest.db1.entity.WorkingSheetEntity;
import com.example.mysqltest.db1.service.WorkingSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkingSheetServiceImpl implements WorkingSheetService {

    @Autowired
    WorkingSheetDao workingSheetDao;

    @Override
    public List<WorkingSheetEntity> queryAll() {
        return workingSheetDao.queryAll();
    }
}

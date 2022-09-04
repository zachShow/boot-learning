package com.example.mysqltest.db1.service;

import com.example.mysqltest.db1.entity.WorkingSheetEntity;

import java.util.List;

public interface WorkingSheetService {
    /**
     * 查询全部
     * @return
     */
    List<WorkingSheetEntity> queryAll();
}

package com.example.mysqltest.db1.dao;

import com.example.mysqltest.db1.entity.WorkingSheetEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WorkingSheetDao {
    /**
     * 查询全部
     * @return
     */
    List<WorkingSheetEntity> queryAll();
}

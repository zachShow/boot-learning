package com.example.mysqltest.db1.controller;

import com.example.mysqltest.db1.service.WorkingSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/db1")
public class TestController {

    @Autowired
    WorkingSheetService workingSheetService;

    @GetMapping("test")
    public Object test(){
        return workingSheetService.queryAll();
    }

}

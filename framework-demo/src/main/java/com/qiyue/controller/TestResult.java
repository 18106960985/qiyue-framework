package com.qiyue.controller;

import com.qiyue.annotation.SystemControllerLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by y747718944 on 2018/1/22
 * 测试
 */
@RestController
public class TestResult  {


    @GetMapping("/test")
    @SystemControllerLog(description="登录测试")//该注解是控制层日志注解详细看 AOP包
    public   String test(String param){

        return  param;
    }
}

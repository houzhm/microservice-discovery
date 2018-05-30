package com.example.learnjenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: TestController
 * @Package: com.example.learnjenkins.controller
 * @Description:
 * @Author houzhm
 * @Date 2018/5/30 11:47
 */
@RestController
public class TestController {

    @RequestMapping(value = "hi")
    public String test(){
        return "This is a Jenkins test....";
    }
}

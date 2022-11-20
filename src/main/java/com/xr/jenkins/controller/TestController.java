package com.xr.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author richard
 * @date 2022/11/19 11:11
 **/
@RestController
public class TestController {

    @GetMapping("/test")
    public  String test(){
        return  "你好，我是小荣呀,2222";
    }
}

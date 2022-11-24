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
        return  "我知道你还是爱着我，虽然分开的理由，我们都已接受。";
    }
}

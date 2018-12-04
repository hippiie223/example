package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by reckywangbowen_i on 2018/12/04
 */

@RestController
public class Controller {

    @RequestMapping("/test")
    public String test(){
        return "hello";
    }

}

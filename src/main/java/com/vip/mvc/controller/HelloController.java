package com.vip.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author zhangwei
 */
@RestController
public class HelloController {
    @RequestMapping("/index")
    public String index() {
        return "Hello World";
    }
}

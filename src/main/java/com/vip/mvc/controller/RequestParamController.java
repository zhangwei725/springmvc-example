package com.vip.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangwei
 */
@RestController
@RequestMapping("/params")
public class RequestParamController {
    @RequestMapping("/test1")
    public String method1(@RequestParam(value = "name") String username) {
        System.out.println(username);
        return "参数匹配";
    }

    @RequestMapping("/test2")
    public String method2(@RequestParam(value = "page", defaultValue = "1") int page ,
                          @RequestParam(value = "size",required = false,defaultValue = "10") int size) {
        System.out.println(page);
        System.out.println(size);
        return "使用默认值参数+可选参数";
    }




}

package com.vip.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhangwei
 */
@Controller
@RequestMapping("/body")
public class RequestBodyController {

    @RequestMapping(value = "/test1", method = RequestMethod.POST)
    public String method1(@RequestBody String name) {
        System.out.println(name);
        return "请求体参数";
    }

    @RequestMapping("/test2")
    public String method2(@RequestParam(value = "page", defaultValue = "1") int page,
                          @RequestParam(value = "size", required = false, defaultValue = "10") int size) {
        System.out.println(page);
        System.out.println(size);
        return "使用默认值参数+可选参数";
    }

}

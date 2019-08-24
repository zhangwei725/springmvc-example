package com.vip.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangwei
 */
@Controller
public class PathController {
    @RequestMapping("/path/{page}/{size}")
    public String pathTest(@PathVariable(value = "page") int page, @PathVariable String size) {
        System.out.println(page);
        System.out.println(size);
        return "动态路径匹配";
    }
}

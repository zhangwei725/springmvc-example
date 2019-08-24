package com.vip.mvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhangwei
 */
@RestController
@Slf4j
@RequestMapping("/params")
public class ArrayParamsController {
    @RequestMapping("/base")
    public String baseArray(String[] arr) {
        for (String name : arr) {
            log.debug("数组参数{}", name);
        }
        return "数组类型参数绑定";
    }

    /**
     * @param arr
     * @return
     */
    @RequestMapping("/list")
    public String baseList(@RequestParam("arr") List<String> arr) {
        for (String name : arr) {
            log.debug("数组参数{}", name);
        }
        return "集合类型参数绑定";
    }

}

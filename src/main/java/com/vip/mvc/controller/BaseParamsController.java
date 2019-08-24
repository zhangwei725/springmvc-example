package com.vip.mvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangwei
 */
@RestController
@Slf4j
public class BaseParamsController {

    @RequestMapping("/base")
    public String base(String username, int age, boolean flag) {
        log.debug("基本类型参数{}", username);
        log.debug("基本类型参数{}", age);
        log.debug("基本类型参数{}", flag);
        return "基本类型参数绑定";
    }

}

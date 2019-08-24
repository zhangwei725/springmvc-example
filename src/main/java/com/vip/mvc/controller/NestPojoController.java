package com.vip.mvc.controller;

import com.vip.mvc.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangwei
 */
@RestController
@Slf4j
@RequestMapping("/nest")
public class NestPojoController {
    @RequestMapping("/pojo")
    public String nestPojoParams(User user) {
        log.debug(user.getName());
        log.debug(user.getAddress().getCity());
        return "对象嵌套对象";
    }
}

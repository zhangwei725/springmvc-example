package com.vip.mvc.controller;

import com.vip.mvc.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangwei
 */
@RestController
@RequestMapping("/pojo")
@Slf4j
public class PojoListController {
    @RequestMapping("/list")
    public String nestListParams(User user) {
        log.debug(user.getName());
        log.debug(user.getAddressList().toString());
        return "pojo对象嵌套list";
    }

    @RequestMapping("/map")
    public String nestMapParams(User user) {
        log.debug(user.getMap().get("1").toString());
        return "pojo对象嵌套Map";
    }

}

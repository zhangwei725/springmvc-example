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
public class PojoParamsController {

    @RequestMapping("/pojo")
    public String pojoParams(User user) {
        log.debug(user.getUid()+"");
        log.debug(user.getName());
        return "简单对象参数";
    }

}

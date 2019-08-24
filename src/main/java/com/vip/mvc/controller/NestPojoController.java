package com.vip.mvc.controller;

import com.vip.mvc.entity.User;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangwei
 */
@RestController
public class NestPojoController {

    public String nestPojoParams(User user) {


        return "对象嵌套对象";
    }
}

package com.vip.mvc.controller;

import com.vip.mvc.entity.User;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangwei
 */
@RestController
public class ModelAttributeController {
    @ModelAttribute
    public void showModel(User user) {
        System.out.println("执行了 showModel 方法"+user.getName());
    }

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(User user) {
        System.out.println("执行了控制器的方法"+user.getName());
        return "模型属性控制";
    }
}

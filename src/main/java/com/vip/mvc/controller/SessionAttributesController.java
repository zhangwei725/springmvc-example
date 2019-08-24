package com.vip.mvc.controller;

import com.vip.mvc.entity.SessionTypesTest;
import com.vip.mvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author zhangwei
 */
@Controller
@SessionAttributes(value = {"hello", "user"})
public class SessionAttributesController {
    @RequestMapping("/session")
    public String add(Model model) {
        // 基本类型
        model.addAttribute("hello", "world");
        // 对象
        User user = new User();
        user.setUid(1);
        user.setName("admin");
        model.addAttribute(user);
        return "在session添加值";
    }

    @RequestMapping("/session/attributes")
    @ResponseBody
    public String sessionAttributesMsg(HttpSession session) {
        User user = (User) session.getAttribute("user");
        System.out.println(user.getUid());
        System.out.println(user.getUid());
        return "从session中获取值";
    }

    @RequestMapping("/session/attributes/types")
    @ResponseBody
    public String sessionAttributesTypes() {
        SessionTypesTest types = new SessionTypesTest("k1","k2");
        return "从session中获取值";
    }


}


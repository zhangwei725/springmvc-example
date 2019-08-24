package com.vip.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhangwei
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @RequestMapping("/login")
    public String login(HttpServletRequest request) {
        request.getSession().setAttribute("name", "admin");
        return   "redirect:/";
    }

    @RequestMapping(value = "/register", method = {RequestMethod.POST, RequestMethod.PUT})
    public String register() {
        return "注册";
    }


    @RequestMapping(value = "/register", method = {RequestMethod.GET, RequestMethod.PUT})
    public String register1() {
        return "注册";
    }

    // 参数中必须包含 id 并且  money>0.00
    @RequestMapping(value = "/update", method = RequestMethod.POST, params = {"id", "money>0.00"})
    public String update() {
        return "修改成功";
    }
}

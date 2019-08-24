package com.vip.mvc.controller;

import com.vip.mvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


/**
 * @author zhangwei
 */
@Controller
public class ModelViewController {

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();

        List<User> users = new ArrayList<>();
        User user = new User();
        // 添加集合
        mv.addObject(users);
        // 添加 pojo
        mv.addObject(user);
        mv.addObject("name", "admin");
        // 也可以通过 ModelMap
        // ModelMap modelMap = new ModelMap();
        // modelMap.addAttribute(users);
        // modelMap.addAttribute(user);
        //modelMap.addAttribute("name", "admin");
        // mv.addAllObjects(modelMap);
        return mv;
    }

    @RequestMapping("/model")
    public String modelAndString(Model model) {
        model.addAttribute("name", "hello");
        return "hello";
    }

    @RequestMapping("/redirect")
    public String redirect() {
        // 站内重定向
        return "redirect:/model";
        // 站内重定向带参数
        // return "redirect:/user/change/?uid=1"
        // 站外重定
        // return "redirect:https://www.baidu.com";
        // 站外带参数 后面用户名
        // return "redirect:https://api.github.com/users/zhangwei725"
        //站外跳转带参数2
        // return "https://api.github.com/users/zhangwei725/repos?page=1&per_page=10"
    }

    @RequestMapping("/forward")
    public String testForward(Model model) {
        model.addAttribute("key", "转发");
        return "forward:index";
    }
}
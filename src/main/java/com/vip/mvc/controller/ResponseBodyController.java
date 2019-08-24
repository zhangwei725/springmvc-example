package com.vip.mvc.controller;

import com.vip.mvc.entity.Shop;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangwei
 */
@Controller
public class ResponseBodyController {
    @RequestMapping("/body")
    @ResponseBody
    public Shop testResponseBody() {
        Shop shop = new Shop();
        shop.setName("娃娃");
        shop.setTitle("白天么么哒,晚上怕怕怕");
        return shop;
    }

}

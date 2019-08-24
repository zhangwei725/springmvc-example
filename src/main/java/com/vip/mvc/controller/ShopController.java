package com.vip.mvc.controller;

import com.vip.mvc.entity.Shop;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangwei
 */
@RestController
@RequestMapping("/shop")
@Slf4j
public class ShopController {
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Shop add(@RequestBody Shop shop) {
        log.error(shop.toString());
        return shop;
    }
}

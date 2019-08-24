package com.vip.mvc.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zhangwei
 */
@RestController
public class RequestHeaderController {

    @RequestMapping(value="/getHeader",method= RequestMethod.GET)
    public String getHeader(
            @RequestHeader("Host") String host,
            @RequestHeader("User-Agent") String userAgent,
            @RequestHeader("Accept") String accept,
            @RequestHeader("Accept-Language") String acceptLanguage,
            @RequestHeader("Accept-Encoding") String acceptEncoding,
            @RequestHeader("Cookie") String cookie,
            @RequestHeader("Connection") String conn,
            @CookieValue("JSESSIONID") String cookie2){



        return "请求头参数";
    }
}

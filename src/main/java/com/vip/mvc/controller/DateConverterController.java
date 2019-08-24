package com.vip.mvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author zhangwei
 */
@RestController
@RequestMapping("/converter")
@Slf4j
public class DateConverterController {
    @RequestMapping("/date")
    public String testDateConverter(Date joinDate) {
        log.debug(joinDate.getClass().getTypeName());
        return "自定义转化器";
    }

}

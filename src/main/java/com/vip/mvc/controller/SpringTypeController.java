package com.vip.mvc.controller;

import com.sun.org.apache.regexp.internal.RE;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.rmi.runtime.Log;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.security.PublicKey;
import java.util.Map;

/**
 * @author zhangwei
 */
@RestController
@Slf4j
public class SpringTypeController {
    @RequestMapping("/type")
    private String testSpringType(HttpServletRequest request,
                                  HttpServletResponse response,
                                  HttpSession session,
                                  Model model,
                                  ModelMap modelMap,
                                  Map map) {
        log.debug(request.toString(),
                response.toString(),
                session.toString(),
                model.toString(),
                modelMap.toString(),
                map.toString()

        );
        return "内置类型";
    }

}

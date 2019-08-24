package com.vip.mvc.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class TestAop {
    @Pointcut("execution(* com.vip.mvc.controller.HelloController.index())")
    public void pointCutMethod(){}


    @After("pointCutMethod()")
    public void afterMethod(){
        System.out.println("==========>>>1111");
    }

}

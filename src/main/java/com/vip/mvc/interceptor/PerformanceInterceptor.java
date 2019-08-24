package com.vip.mvc.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhangwei
 */
@Component
@Slf4j
public class PerformanceInterceptor extends HandlerInterceptorAdapter {
    ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //1、开始时间
        long beginTime = System.currentTimeMillis();
        threadLocal.set(beginTime);
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        //2、结束时间
        long endTime = System.currentTimeMillis();
        //3、消耗的时间
        long consumeTime = endTime - threadLocal.get();
        // 此处认为处理时间超过500毫秒的请求为慢请求
        if (consumeTime > 500) {
            log.error(request.getRequestURI());
        }
    }
}

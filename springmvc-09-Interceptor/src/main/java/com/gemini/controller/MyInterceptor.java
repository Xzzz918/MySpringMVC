package com.gemini.controller;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author gemini
 * Created in  2021/5/11 23:03
 * 拦截器是AOP思想的具体应用。
 * 拦截器只会拦截访问的控制器方法， 如果访问的是jsp/html/css/image/js是不会进行拦截的
 */
public class MyInterceptor implements HandlerInterceptor {
    //在请求处理的方法之前执行
    //若返回true，则执行下一个拦截器；若返回false，就不执行下一个拦截器
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        System.out.println("=============处理前============");
        return true;
//        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
    //在请求处理的方法之后执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
//        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
        System.out.println("=============处理后============");
    }
    //在dispatcherServlet处理后执行,做清理工作.
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
//        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
        System.out.println("=============清理============");
    }
}

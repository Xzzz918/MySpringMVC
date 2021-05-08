package com.gemini.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author gemini
 * Created in  2021/5/8 14:51
 * 两个请求都可以指向一个视图，
 * 但是页面结果的结果是不一样的，
 * 可以看出视图是被复用的，
 * 而控制器与视图之间是弱耦合关系。
 */
public class ControllerTest1 implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "Test1Controller");
        modelAndView.setViewName("test");
        return modelAndView;
    }
}

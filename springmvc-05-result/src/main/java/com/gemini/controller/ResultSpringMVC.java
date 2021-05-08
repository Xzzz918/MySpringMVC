package com.gemini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gemini
 * Created in  2021/5/8 15:43
 * 通过SpringMVC来实现转发和重定向 - 无需视图解析器；
 */
@Controller
public class ResultSpringMVC {
    @RequestMapping("/rsm/t1")
    public String test1(){
        //转发：在有视图解析器的情况下会报错404，因为找不到 /WEB-INF/jsp//index.jsp.jsp
        return "/index.jsp";
    }

    @RequestMapping("/rsm/t2")
    public String test2(){
        //转发二：在有视图解析器的情况下也会正常转发
        return "forward:/index.jsp";
    }

    @RequestMapping("/rsm/t3")
    public String test3(){
        //重定向   在有视图解析器的情况下也会正常重定向
        return "redirect:/index.jsp";
    }
}

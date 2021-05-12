package com.gemini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author gemini
 * Created in  2021/5/11 23:37
 */
@Controller
public class InterceptorController {
    @RequestMapping("/interceptor")
    @ResponseBody
    public String testInterceptor(){
        System.out.println("控制器中的方法执行了");
        return "hello";
    }
}

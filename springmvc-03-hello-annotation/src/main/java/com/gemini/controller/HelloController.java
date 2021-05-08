package com.gemini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gemini
 * Created in  2021/5/8 11:14
 */
class A{
    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
@Controller
@RequestMapping("HelloController")
public class HelloController {
    //真实访问地址 : 项目名/HelloController/hello
    @RequestMapping("/hello")
    public String sayHello(Model model){
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg", new A());
        //web-inf/jsp/hello.jsp
        return "hello";
    }
}

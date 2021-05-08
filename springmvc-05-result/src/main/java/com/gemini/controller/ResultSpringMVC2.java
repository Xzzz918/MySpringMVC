package com.gemini.controller;

import com.gemini.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author gemini
 * Created in  2021/5/8 16:06
 * 重定向 , 不需要视图解析器 , 本质就是重新请求一个新地方
 */
@Controller
public class ResultSpringMVC2 {
    @RequestMapping("/rsm2/t1")
    public String test1(Model model){
        model.addAttribute("msg", "AG!");
        //转发
        return "test";
    }

    @RequestMapping("/rsm2/t2")
    public String test2(){
        //重定向
//        return "redirect:/index.jsp";
//        可以重定向到另外一个请求实现
        return "redirect:/rsm2/t1"; //  /rsm2/t1为另一个请求
    }

    //@RequestParam("username") : username提交的域的名称
    @RequestMapping("/hello")
    public String hello(@RequestParam("username") String name, Model model){
        model.addAttribute("msg",name);
        System.out.println(name);
        return "hello";
    }

    //提交对象
    //如果使用对象的话，前端传递的参数名和对象名必须一致，否则就是null。
    @RequestMapping("/user")
    public String user(User user){
        System.out.println(user);
        return "hello";
    }

}

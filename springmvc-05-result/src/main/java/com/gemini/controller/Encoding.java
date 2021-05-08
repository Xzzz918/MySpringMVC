package com.gemini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gemini
 * Created in  2021/5/8 17:12
 */
@Controller
public class Encoding {
    @RequestMapping("/e/t")
    public String test(Model model, String name){
        model.addAttribute("msg",name); //获取表单提交的值
        return "hello"; //跳转到hello页面显示输入的值
    }
}

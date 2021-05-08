package com.gemini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gemini
 * Created in  2021/5/8 15:11
 */
@Controller
public class RestFulController {
//    @PathVariable 注解，让方法参数的值对应绑定到一个URI模板变量上。
    @RequestMapping("/commit/{p1}/{p2}")
    public String index(@PathVariable int p1, @PathVariable int p2, Model model){
        int result = p1 + p2;
//        SpringMVC 会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "result: " + result);
        return "test";
    }
//    @GetMapping("/hello") == @RequestMapping(value = "/hello", method = {RequestMethod.GET})
    @GetMapping("/hello")
    public String index2(Model model){
        model.addAttribute("msg", "hello");
        return "test";
    }
}

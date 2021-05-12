package com.gemini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

/**
 * @author gemini
 * Created in  2021/5/8 14:57
 */
@Controller
public class ControllerTest2 {
    @RequestMapping("/t2")
    public String index(Model model){
        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "Test2Controller");
        return "test";
    }
    @RequestMapping("/requestHeader")
    @ResponseBody
    public void testRequestHeader(@RequestHeader(value="User-Agent",required=false) String user_agent) {
        System.out.println(user_agent);
    }
}

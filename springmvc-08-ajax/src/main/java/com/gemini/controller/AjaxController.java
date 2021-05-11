package com.gemini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author gemini
 * Created in  2021/5/11 16:53
 */
@Controller
public class AjaxController {
    @RequestMapping("/t1")
    @ResponseBody
    public String test(){
        return "hello";
    }

    @RequestMapping("/a1")
    public void ajax1(String name , HttpServletResponse response) throws IOException {
        if ("admin".equals(name)){
            response.getWriter().print("true");
        }else{
            response.getWriter().print("false");
        }
    }
}

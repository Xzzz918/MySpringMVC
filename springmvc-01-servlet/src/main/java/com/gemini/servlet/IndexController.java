package com.gemini.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author gemini
 * Created in  2021/5/12 23:13
 */
@Controller
public class IndexController {
    @GetMapping("/request")
    @ResponseBody
    public String index(HttpServletRequest request){
        return request.getMethod() + "<br>" +
                request.getQueryString() + "<br>" +
                request.getRequestURI() + "<br>" +
                request.getRequestURL() + "<br>";

    }
}

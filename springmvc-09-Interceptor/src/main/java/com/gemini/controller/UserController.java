package com.gemini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author gemini
 * Created in  2021/5/12 19:35
 */
@Controller
@RequestMapping("/user")
public class UserController {
    //jump to login page
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }
    //jump to success page
    @RequestMapping("/toSuccess")
    public String toSuccess() {
        return "success";
    }
    //login and propose
    //登陆提交
    @RequestMapping("/login")
    public String login(HttpSession httpSession, String username, String pwd) throws Exception {
        // 向session记录用户身份信息
        System.out.println("接收前端==="+username);
        httpSession.setAttribute("user", username);
        return "success";
    }
    //exit login
    @RequestMapping("logout")
    public String logOut(HttpSession session){
        session.invalidate();
        return "login";
    }

}

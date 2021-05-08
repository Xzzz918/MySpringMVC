package com.gemini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author gemini
 * Created in  2021/5/8 15:34
 * 通过设置ServletAPI , 不需要视图解析器 .
 *
 * 1、通过HttpServletResponse进行输出
 * 2、通过HttpServletResponse实现重定向
 * 3、通过HttpServletResponse实现转发
 */

@Controller
public class ResultGo {
//    通过HttpServletResponse进行输出
    @RequestMapping("/result/t1")
    public void test1(HttpServletResponse rsp) throws IOException {
        rsp.getWriter().println("Hello,Spring BY servlet API");
    }

//    通过HttpServletResponse实现重定向
    @RequestMapping("/result/t2")
    public void test2(HttpServletResponse rsp) throws IOException {
        rsp.sendRedirect("/index.jsp");
    }

//    通过HttpServletResponse实现转发
@RequestMapping("/result/t3")
public void test3(HttpServletRequest req, HttpServletResponse rsp) throws IOException, ServletException {
    req.setAttribute("msg", "/result/t3");
    req.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req, rsp);
}
}

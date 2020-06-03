package com.study.javaWeb.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/member")
public class MemberServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("init 메서드!!");
    }
}

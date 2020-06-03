package com.study.servletDir;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// Get , Post 둘다 처리
public class LoginServlet extends HttpServlet {

    public void init(ServletConfig config) throws ServletException {
        System.out.println("init 메서드 호출");
    }

    protected void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {
        System.out.println("doGet 메서드 호출");
        doHandle(request, response);
    }

    protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {
        System.out.println("doPost 메서드 호출");
        doHandle(request, response);
    }

    private void doHandle(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {
        request.setCharacterEncoding("utf-8");
        String user_id = request.getParameter("user_id");
        System.out.println("do handle 메서드 호출");
        String user_pw = request.getParameter("user_pw");
        System.out.println("아이디:" + user_id);
        System.out.println("패스워드:" + user_pw);
    }

    public void destroy() {
        System.out.println("destroy 메서드 호출");
    }
}

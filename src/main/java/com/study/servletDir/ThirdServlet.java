package com.study.servletDir;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

//어노테이션을 사용한 서블릿 매핑
@WebServlet
public class ThirdServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void init(ServletConfig config) throws ServletException {
        System.out.println("ThirdServlet init 메서드 호출");
    }

    protected void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {
        System.out.println("ThirdServlet doGet 메서드 호출");
    }

    protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {
        System.out.println("ThirdServlet destroy 메서드 호출");
    }

}

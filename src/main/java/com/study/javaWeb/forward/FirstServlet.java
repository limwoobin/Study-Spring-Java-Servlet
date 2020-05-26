package com.study.javaWeb.forward;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {
    public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        response.sendRedirect("second");  // 1. sendRedirect 를 이용한 포워딩

//        response.addHeader("Refresh" , "1;url=second"); // 2. Refresh 를 이용한 포워딩 , 1 초 후 서블릿 second로 재요청

        /*out.print("<script type='text/javascript'>"); // 3. location 을 이용한 포워딩
        out.prnt("location.href='second';");
        out.print("</script>");*/

//        RequestDispatcher dispatch = request.getRequestDispatcher("second"); 4. dispatch 를 이용해 second로 전달
//        dispatch.forward(request , response);
    }
}

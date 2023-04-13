package com.yqc.Response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/res1")
public class ResponseDemo1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //相应重定向访问外部资源可以重定向到任意资源
       resp.sendRedirect("/demo_war/res2");
       //动态获取虚拟目录(减少耦合性)
        String contextPath = req.getContextPath();
        resp.sendRedirect(contextPath + "/res2");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}

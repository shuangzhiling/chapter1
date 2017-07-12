package org.smart4j.chapter1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by shuan on 2017/7/12.
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowStr = df.format(new Date());
        req.setAttribute("currentTime",nowStr);
        req.getRequestDispatcher("WEB-INF/jsp/hello.jsp").forward(req,resp);
    }

}

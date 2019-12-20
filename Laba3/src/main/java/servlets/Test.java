package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/test")
public class Test extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=utf-8");

        if(req.getParameter("t")!=null){
            String t = req.getParameter("t");
            resp.getWriter().write("Привет, " + t + "!");
        }
        else
            resp.getWriter().write("Привет!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=utf-8");

        if(req.getParameter("t")!=null){
            String t = req.getParameter("t");
            resp.getWriter().write("Привет, " + t + "!");
        }
        else
            resp.getWriter().write("Привет!");
    }
}

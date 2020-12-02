package web;

import service.Userservice;
import service.impl.Userserviceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deluser")
public class deluser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Userservice u = new Userserviceimpl();
        int id_i = Integer.parseInt(id);
        System.out.println(id);
        u.del(id_i);
        resp.sendRedirect(req.getContextPath()+"/userlist");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}

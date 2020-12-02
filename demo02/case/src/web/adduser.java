package web;

import domain.User;
import org.apache.commons.beanutils.BeanUtils;
import service.Userservice;
import service.impl.Userserviceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;


@WebServlet("/adduser")
public class adduser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        Map<String, String[]> pm = req.getParameterMap();
        User user = new User();
        try {
            BeanUtils.populate(user,pm);

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        Userserviceimpl u = new Userserviceimpl();
        u.DML(user);
        resp.sendRedirect(req.getContextPath()+"/userlist");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}

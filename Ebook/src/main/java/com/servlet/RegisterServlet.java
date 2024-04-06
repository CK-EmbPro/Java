package com.servlet;

import com.DAO.UserDAOimple;
import com.DB.DBconnect;
import com.entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "Register", value = "/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("fname");
        String email = req.getParameter("email");
        String phono = req.getParameter("phono");
        String password = req.getParameter("password");
        String check = req.getParameter("check");

//        System.out.println(name+" "+email+" "+phono+" "+password+" "+check);
        User user = new User();

        user.setName(name);
        user.setEmail(email);
        user.setPhono(phono);
        user.setPassword(password);

        HttpSession userSession = req.getSession();
        if(check != null){
            UserDAOimple userDAO = new UserDAOimple(DBconnect.getConn());
            boolean userRegistered = userDAO.userRegister(user);

            if(userRegistered){
                userSession.setAttribute("successMsg", "user registered successfully");

                resp.sendRedirect("register.jsp");
            }else{
                userSession.setAttribute("failedMsg", "Failed to register the user");
                resp.sendRedirect("/register.jsp");
            }

        }else{
            System.out.println("please agreee the terms and conditions");
        }


    }
}

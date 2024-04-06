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
import java.sql.SQLException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            UserDAOimple loginDAO = new UserDAOimple(DBconnect.getConn());
            HttpSession loginSession = req.getSession();

            String email = req.getParameter("email");
            String password = req.getParameter("password");
            String adminEmail = "admin123@gmail.com";
            String adminPassword = "admin";
            if(adminEmail.equals(email) && adminPassword.equals(password)){
                User us = loginDAO.login(adminEmail, adminPassword);
                loginSession.setAttribute("userObj", us);
                resp.sendRedirect("admin/home.jsp");
            }else{
                User us = loginDAO.login(email, password);
                if(us != null){
                    loginSession.setAttribute("userObj", us);
                    resp.sendRedirect("home.jsp");
                }else{
                    loginSession.setAttribute("failedMsg", "Invalid email or/and password");
                    resp.sendRedirect("login.jsp");
                }

            }
        }catch (RuntimeException e){
            e.printStackTrace();
        }



    }
}

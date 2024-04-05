package com.example.simplebanksystem;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import jakarta.servlet.*;
import org.jboss.weld.context.http.Http;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.sql.*;

@WebServlet(name = "signUp", value = "/signup")
public class SignUp extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");



    }

    private String insertData(String firstName,String lastName, String email, String password) {
        final String DBURL = "jdbc:mysql://localhost/EXAMBANKINGSYSTEM";
        final String USER = "root";
        final String PWORD = "1234";
        String sql = "INSERT INTO users (firstName, lastName, email, password) VALUES (?, ?, ?, ?)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DBURL, USER, PWORD);
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, firstName);
            st.setString(2, lastName);
            st.setString(3, email);
           st.setString(4, password);
            int res = st.executeUpdate();
            if (res == 1) {
                return "user has been created successfully";
            } else {
                return "user has not been created";
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

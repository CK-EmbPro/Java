package com.example.simplebanksystem;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import jakarta.servlet.*;
import org.jboss.weld.context.http.Http;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "Servlet1" ,value="/servlet1")
public class Servlet1 extends HttpServlet {
    PrintWriter out = null;
    Connection conn;
    PreparedStatement pstmt;
    ResultSet rs;
    final String DBURL = "jdbc:mysql://localhost/ServletsStudentManagement";
    final String USER = "root";
    final String PWORD = "1234";
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        try {
            String result;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DBURL, USER, PWORD);

            ServletContext context = getServletContext();
            context.setAttribute("accno", "");

            String accno = request.getParameter("accno");
            String pinno = request.getParameter("pinno");

            pstmt = conn.prepareStatement("select * from login where accno= ? and pinno=?");
            pstmt.setString(1, accno);
            pstmt.setString(2, pinno);
            rs = pstmt.executeQuery();

            boolean row = false;
            row = rs.next();

            if(row){
                result = rs.getString(2);
                context.setAttribute("accno", result);

                RequestDispatcher reqDispatcher = request.getRequestDispatcher("/secondServlet");
                if(reqDispatcher == null){

                }

                reqDispatcher.forward(request, response);
                conn.close();
            }else{
                out = response.getWriter();
                out.println("<html>");
                out.println("<body bgcolor=pink>");
                out.println("Please check the accno and balance");
                out.println("</body>");
                out.println("</html>");

                out.close();

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

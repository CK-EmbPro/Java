package com.example.advancedservlets;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.*;
import java.util.*;
import java.lang.*;

@WebServlet(name = "SessionTracking", value="/sessionTracking")
public class SessionTracking extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException{
        HttpSession session = request.getSession(true);

        Date createTime  = new Date(session.getCreationTime());
        Date lastAccessTime  = new Date(session.getLastAccessedTime());

        String title = "welcome back to my website";
        String visitCountKey = new String("visitCount");
        String userIDKey = new String("userID");
        String userID = new String("ABCD");
        int visitCount = 1;

       
        if(session.isNew()){
            title = "Welcome to my website";
            session.setAttribute(userIDKey, userID);
        }else{
            visitCount = (Integer) session.getAttribute(visitCountKey);
            visitCount = visitCount +1;
            userID = (String)session.getAttribute(userIDKey);

        }

        session.setAttribute(visitCountKey,visitCount);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " +
                        "transitional//en\">\n";

//        out.println("visitCount: "+session.getAttribute("visitCount"));
//        while (visits.hasMoreElements()){
//            out.println("Attribute :" + visits.nextElement());
//        }
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +

                "<body bgcolor = \"#f0f0f0\">\n" +
                "<h1 align = \"center\">" + title + "</h1>\n" +
                "<h2 align = \"center\">Session Infomation</h2>\n" +
                "<table border = \"1\" align = \"center\">\n" +

                "<tr bgcolor = \"#949494\">\n" +
                "  <th>Session info</th><th>value</th> </tr>\n" +

        "<tr>\n" +
                "  <td>id</td>\n" +
                "  <td>" + session.getId() + "</td> </tr>\n" +

        "<tr>\n" +
                "  <td>Creation Time</td>\n" +
                "  <td>" + createTime + "  </td> </tr>\n" +

        "<tr>\n" +
                "  <td>Time of Last Access</td>\n" +
                "  <td>" + lastAccessTime + "  </td> </tr>\n" +

        "<tr>\n" +
                "  <td>User ID</td>\n" +
                "  <td>" + userID + "  </td> </tr>\n" +

        "<tr>\n" +
                "  <td>Number of visits</td>\n" +
                "  <td>" + visitCount + "</td> </tr>\n" +
        "</table>\n" +
                "</body> </html>"
      );
    }
}

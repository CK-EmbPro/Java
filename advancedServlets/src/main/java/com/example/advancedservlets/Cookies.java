package com.example.advancedservlets;
import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet(name = "Cookies", value="/settingCookies")
public class Cookies extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        Cookie firstName = new Cookie("first_name", request.getParameter("first_name"));
        Cookie lastName = new Cookie("last_name", request.getParameter("last_name"));

//      MaxAge property has the precedence over the expiry date
        firstName.setMaxAge(60*60*24);
        lastName.setMaxAge(60*60*24);

//        Add both cookies to the response
        response.addCookie(firstName);
        response.addCookie(lastName);

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String title = "Setting cookies example";

        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

//        out.println("hello cookies");
        out.println(docType +
                "<html>\n"+
                "<head>"+
                "<title>"+title+"</title>"+
                "</head>\n"+

                "<body bgcolor = \"#f0f0f0\">\n"+
                "<h1 align = \"center\">"+title+"</h1>\n"+
                "<ul>\n"+
                "<li><b>FirstName<b>: "+request.getParameter("first_name")+"\n"+
                "<li><b>LastName<b>: "+request.getParameter("last_name")+"\n"+
                "</ul>\n"+
                "</body>"+
                "</html>"
      );


    }
}

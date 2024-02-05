package com.servletdemo.tomcat10servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.*;

@WebServlet(name = "Studying", value = "/studying")
public class Studying extends HttpServlet {
    private String message;



    public void doGet(HttpServletRequest request, HttpServletResponse response, String titles) throws  ServletException, IOException{
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String title = titles.length()>0 ? titles : "Using GET";
        String docType = "<!doctype html public \"-//w3c//dtd html 4.0"+"transitional//en\">\n";

        out.println(docType+
                        "<html>\n" +
                        "<head><title>" + title + "</title></head>\n" +
                        "<body bgcolor = \"#f0f0f0\">\n" +
                        "<h1 align = \"center\">" + title + "</h1>\n" +
                        "<ul>\n" +
                        "  <li><b>First Name</b>: "
                        + request.getParameter("first_name") + "\n" +
                        "  <li><b>Last Name</b>: "
                        + request.getParameter("last_name") + "\n" +
                        "<p>Which courses do you attend</p>"+
                        "  <li><b>Maths</b>: "
                        + request.getParameter("maths") + "\n" +

                        "  <li><b>Physics</b>: "
                        + request.getParameter("physics") + "\n" +

                        "  <li><b>Chemistry</b>: "
                        + request.getParameter("chemistry") + "\n" +
                        "</ul>\n" +
                        "</body>" +
                        "</html>"
                );
    }

    public void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException{
        doGet(request, response, "");
    }



}
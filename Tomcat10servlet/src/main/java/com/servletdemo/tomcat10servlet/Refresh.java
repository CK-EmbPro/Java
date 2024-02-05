package com.servletdemo.tomcat10servlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.*;

@WebServlet(name = "Refresh", value= "/refresh")
public class Refresh extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setIntHeader("Refresh", 5);
        response.setContentType("text/html");

        Calendar calendar = new GregorianCalendar();
        String am_pm;
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        if(calendar.get(Calendar.AM_PM) == 0)
            am_pm = "AM";
        else
            am_pm = "PM";

        String CT = hour+":"+minute+":"+second+" "+am_pm;

        PrintWriter out = response.getWriter();
        String title = "Auto Refresh Header Setting";
        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

        out.println(docType+
                "<html>\n"+
                "<head><title>"+title+"</head></title>\n"+
                "<body bgColor = \"f0f0f0\">\n"+
                "<h1 align= \"center\">"+title+"</h1>\n"+
                "<p>Current Time is: "+CT+"</p>\n"
                );
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        doGet(request, response);
    }
}

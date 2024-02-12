package com.example.advancedservlets;

import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet(name = "ErrorHandling", value = "/errorhandling")
public class ErrorHandling extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{

//        Firstly get the error, servlet and url info
        Throwable throwable = (Throwable) request.getAttribute("jakarta.servlet.error.exception");
        Integer statusCode = (Integer) request.getAttribute("jakarta.servlet.error.status_code");
        String servletName = (String) request.getAttribute("jakarta.servlet.error.servlet_name");
        String request_uri = (String) request.getAttribute("jakarta.servlet.error.request_uri");

//        Check if servlet to handle is available & if the request generating the error is present

        if(servletName ==null){
            servletName = "unknown";
        }

        if(request_uri ==null){
            request_uri= "unknown";
        }

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String title = "Error/Exception information";
        String docType =  "<!doctype html public \"-//w3c//dtd html 4.0 " +
                "transitional//en\">\n";

        out.println(docType+
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor = \"#f0f0f0\">\n");


        if(throwable == null && statusCode == null){
            out.println("<h2>Error information is missing</h2>");
            out.println("Please return to the <a href = \""+response.encodeURL("http://localhost:8080/")+"\">Home Page</a>.");
        }else if(statusCode !=null){
            out.println("Status code: "+statusCode);
        }else{
            out.println("<h2>Error information</h2>");
            out.println("Servlet name "+ servletName+"</br></br>");
            out.println("Exception type "+throwable.getClass().getName()+"</br></br>");
            out.println("The request URI: "+request_uri+"</br></br>");
            out.println("The Exception msg: "+throwable.getMessage());


        }


        out.println("</body>");
        out.println("</html>");




    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        doGet(request, response);
    }
}

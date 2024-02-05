package com.servletdemo.tomcat10servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.*;
import java.util.Enumeration;
@WebServlet(name = "DisplayHeadersServlet", value= "/displayHeaders")
public class DisplayHeaders extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String title = "HTTP Header Request Example";
        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

        out.println(docType +
                "<html>\n"+
                "<head><title>"+title+"</title></head>\n"+
                "<body bgColor= \"#f0f0f0\">\n"+
                "<h1 align = \"center\">"+title+"</h1>\n"+
                "<table width=\"100%\" border = \"1\" align= \"center\">\n"+
                "<tr bgColor = \"949494\">\n"+
                "<th>Header Name</th><th>Header Value(s)</th>\n"+
                "</tr>\n"
                );

        Enumeration headerNames = request.getHeaderNames();

        while(headerNames.hasMoreElements()){
            String headerName = (String)headerNames.nextElement();
            out.print("<tr><td>"+headerName+"</td>\n");
            String headerValue = request.getHeader(headerName);
            out.println("<td>"+headerValue+"</td></tr>\n");
        }

        out.println("</table>\n</body></html>");

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException{
        doGet(request, response);
    }

}

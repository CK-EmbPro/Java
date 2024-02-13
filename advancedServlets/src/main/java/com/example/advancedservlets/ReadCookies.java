package com.example.advancedservlets;
import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import org.jboss.weld.context.http.Http;

@WebServlet(name ="ReadCookies", value = "/readCookies")
public class ReadCookies extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = null;
        Cookie[] cookies = null;

        cookies = request.getCookies();

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String title = "Reading cookies example";
        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " +
                        "transitional//en\">\n";

        out.println(docType+
                "<html>\n"+
                "<head><title>"+title+"</title>\n"+
                "<body bgcolor=\"#f0f0f0\">\n"
                );

        if(cookies !=null){
            out.println("<h2> Cookies names and values</h2>");

            for(int i = 0;i< cookies.length;i++){
                cookie= cookies[i];
                if(cookie.getName().compareTo("first_name") ==0){
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                    out.println("Deleted cookie "+cookie.getName()+"<br />");
                }

                out.println("<p>Name: "+cookie.getName()+" Value: "+cookie.getValue()+"</p>");


            }
        }else{
            out.println("<h2>No cookies found<h2>");
        }

        out.println("</body>");
        out.println("</html>");

    }
}

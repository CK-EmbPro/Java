package com.servletdemo.tomcat10servlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.Enumeration;

@WebServlet(name = "CheckBox", value = "/checkbox")
public class CheckBox extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String title = "Reading Checkbox Data";
        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

        out.println(docType+
                        "<html>\n" +
                        "<head><title>" + title + "</title></head>\n" +
                        "<body bgcolor = \"#f0f0f0\">\n" +
                        "<h1 align = \"center\">" + title + "</h1>\n" +
                        "<table width = \"100%\" border = \"1\" align = \"center\">\n" +
                        "<tr bgcolor = \"#949494\">\n" +
                        "<th>Param Name</th>"+
                "<th>Param Value(s)</th>\n"+
                        "</tr>\n"
                );

        Enumeration paramNames = request.getParameterNames();

        while(paramNames.hasMoreElements()){
            String paramName = (String)paramNames.nextElement();
            out.println("<tr><td>"+paramName+"</td>"+"<td>");

            String[] paramValues = request.getParameterValues(paramName);

            if(paramValues.length ==1){
                String paramValue = paramValues[0];
                if(paramValue.length() == 0)
                    out.println("<i>No values</i>");
                else
                    out.println(paramValue);
            }else{ //for the case of paramValues.length >1
                out.println("<ul>");

                for(int i = 0; i<paramValues.length; i++){
                    out.println("<li>"+paramValues[i]+"</li>");
                }

                out.println("</ul>");
            }
        }

        out.println("</td></tr>\n</table>\n</body></html>");
    };

}

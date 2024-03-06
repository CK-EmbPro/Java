package com.example.advancedservlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "GoogleSearch", value = "/search")
public class GoogleSearch extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String qString = request.getParameter("down");
        response.setStatus(response.SC_MOVED_PERMANENTLY);
        response.sendRedirect("https://www.google.com/search?q="+qString);
    }
}

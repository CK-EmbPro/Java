package com.example.advancedservlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "PageRedirect", value = "/redirect")
public class PageRedirection extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String site = "https://www.tutorialspoint.com/servlets/servlets-page-redirect.htm";
        response.sendRedirect(site);

    }

}

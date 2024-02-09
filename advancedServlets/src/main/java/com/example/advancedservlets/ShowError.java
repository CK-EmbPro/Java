package com.example.advancedservlets;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.*;
import java.util.*;
@WebServlet(name = "showError", value = "/showerror")
public class ShowError extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException{
        response.sendError(407, "Need proxy auth");

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        doGet(request, response);
    }

}

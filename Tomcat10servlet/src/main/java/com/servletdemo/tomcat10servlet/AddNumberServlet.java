package com.servletdemo.tomcat10servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import  jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "addTwoNumberServlet", value = "/addNumbers")
public class AddNumberServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            int num1 = Integer.parseInt(request.getParameter("num1"));
            int num2 = Integer.parseInt(request.getParameter("num2"));

            int sum = num1 + num2;

            // Set the result as an attribute to be accessed by the destination resource
            request.setAttribute("sumResult", "Sum: " + sum);

            // Forward the request to the "result.jsp" (or any other resource you want to handle the result)
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/result.jsp");
            requestDispatcher.forward(request, response);
        } catch (NumberFormatException e) {
            // Handle the case where the parameters are not valid numbers
            response.getWriter().println("Invalid input. Please enter valid numbers.");
        }
    }
}

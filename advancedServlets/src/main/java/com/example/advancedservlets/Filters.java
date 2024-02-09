package com.example.advancedservlets;

import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.*;
import java.util.*;
public class Filters implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
//        Get init parameter
        String testParam = filterConfig.getInitParameter("test-param");

//        Print the init parameter
        System.out.println("Test param: "+testParam);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String ipAdress = request.getRemoteAddr();

//        LOg the IP address
        System.out.println("IP" +ipAdress +", Time"+new Date().toString());

//        Pass request back down the filter chain
        chain.doFilter(request, response);
    }

    public void destroy(){

    }
}

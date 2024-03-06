package com.example.advancedservlets;
import java.sql.*;
import java.util.*;
public class DataTypesMapping {
    public static void main(String[] args){
        java.util.Date javaDate = new java.util.Date();
        long javaTime = javaDate.getTime();

        System.out.println("The java date is: "+
                javaDate.toString());

        java.sql.Date sqlDate = new java.sql.Date(javaTime);
        System.out.println("The sql date is: "+sqlDate.toString());

        java.sql.Time sqlTime = new java.sql.Time(javaTime);
        System.out.println("The sql time is: "+sqlTime.toString());

        java.sql.Timestamp sqlTstamp=new java.sql.Timestamp(javaTime);
        System.out.println("The sql timestamp is: "+sqlTstamp.toString());
    }

}

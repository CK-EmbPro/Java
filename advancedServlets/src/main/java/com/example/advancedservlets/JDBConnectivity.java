package com.example.advancedservlets;

import java.sql.*;
public class JDBConnectivity {
    static final String DB_URL = "jdbc:mysql://localhost/TUTORIALPOINT";
    static final String USER = "root";
    static final String PWORD = "1234";
    static final String QUERY = "SELECT * FROM employees";

    public static void main(String[] args){
//        Open connection
        try {
            Connection conn = DriverManager.getConnection(DB_URL,USER, PWORD);
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(QUERY);

            while(result.next()){
                System.out.println("Id :" + result.getInt("id") );
                System.out.println("Age :" + result.getInt("age") );
                System.out.println("First :" + result.getString("first") );
                System.out.println("Last :" + result.getString("last") );

            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}

package com.example.advancedservlets;

import java.sql.*;
public class Exception extends Throwable {
    static final String DB_URL = "jdbc:mysql://localhost/TUTORIALPOINT";
    static final String USER = "root";
    static  final  String PWORD = "1234";
    static  final String QUERY = "{call getEmpName(?,?)}";

    public static void main(String[] args){
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PWORD);
            CallableStatement stmt= conn.prepareCall(QUERY);
        ) {
            stmt.setInt(1,1);
            stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
            System.out.println("Executing stored procedure");
            stmt.execute();

            String empName = stmt.getString(2);
            System.out.println("Emp Name with ID is: "+empName);
        }catch (SQLException e){
            e.printStackTrace();
        }
        
    }

}

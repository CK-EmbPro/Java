package com.example.advancedservlets;
import java.sql.*;
import java.util.*;
public class BatchProccWithPreparedStmt {
    static final String DB_URL = "jdbc:mysql://localhost/TUTORIALPOINT";
    static final String USER = "root";
    static  final  String PWORD = "1234";

    public static void main(){
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PWORD);){
            String SQL1 = "Insert into Employees(id, first, last, age) VALUES(?,?,?,?)";

            PreparedStatement pstmt = conn.prepareStatement(SQL1);
            conn.setAutoCommit(false);

            pstmt.setInt(1, 400);
            pstmt.setString(2, "jean");
            pstmt.setString(3, "deDieu");
            pstmt.setInt(4, 30);

            pstmt.addBatch();

            pstmt.setInt(1, 401);
            pstmt.setString(2, "kenny");
            pstmt.setString(3, "debrice");
            pstmt.setInt(4, 36);

            pstmt.addBatch();

            int[] count = pstmt.executeBatch();

            conn.commit();


        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}

package com.example.advancedservlets;
import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.*;

public class BatchProcessing {
    static final String DB_URL = "jdbc:mysql://localhost/TUTORIALPOINT";
    static final String USER = "root";
    static  final  String PWORD = "1234";
    public static void main(String[] args){

        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PWORD)){
            Statement stmt = conn.createStatement();
            conn.setAutoCommit(false);

//            Savepoint savepoint1 = conn.setSavepoint("SavePoint1");

            String SQL = "INSERT INTO employees (id, first, last, age) " +
                    "VALUES(200,'Zia', 'Ali', 30)";

            stmt.addBatch(SQL);
            String SQL2 = "INSERT INTO employees (id, first, last, age) " +
                    "VALUES(201,'Raj', 'Kumar', 35)";

            stmt.addBatch(SQL2);

            String SQL3 = "UPDATE employees SET age = 35 " +
                    "WHERE id = 100";

            stmt.addBatch(SQL3);

            int[] count = stmt.executeBatch();

            conn.commit();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}

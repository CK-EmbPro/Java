package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {
    static Connection conn;
    final static String DBURL = "jdbc:mysql://localhost/Ebook";
    final static String USER = "root";
    final static String PWORD = "1234";
    public static Connection getConn(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DBURL, USER, PWORD);


        }catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            return conn;
        }

    }
}

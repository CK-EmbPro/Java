package com.example.advancedservlets;
import javax.swing.plaf.nimbus.State;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StreamingDbData {
    static final String DBURL = "jdbc:mysql://localhost/TUTORIALPOINT";
    static final String USER = "root";
    static final  String PWORD = "1234";
    static final  String QUERY = "SELECT Data FROM XML_Data WHERE id=100";
    static final String INSERT_QUERY = "INSERT INTO XML_Data VALUES(?,?)";
    static final String CREATE_TABLE_QUERY = "CREATE TABLE XML_Data(id INTEGER, Data LONG)";
    static final  String DROP_TABLE_QUERY = "DROP TABLE XML_Data";
    static  final String XML_Data = "<Employee><id>100</id><first>Zara</first><last>Ali</last><Salary>1000</Salary><Dob>18-08-1978</Dob></Employee>";

    public static void createXMLTable(Statement stmt)throws SQLException{
        System.out.println("CReating the XML table...");
        try {
            stmt.executeUpdate(DROP_TABLE_QUERY);
        }catch (SQLException se){

        }

        stmt.executeUpdate(CREATE_TABLE_QUERY);
    }

    public static void main(String[] args){
        try(Connection conn = DriverManager.getConnection(DBURL, USER, PWORD);) {
            Statement stmt = conn.createStatement();
            PreparedStatement pstmt = conn.prepareStatement(INSERT_QUERY);

            createXMLTable(stmt);

            ByteArrayInputStream bis = new ByteArrayInputStream(XML_Data.getBytes());

            pstmt.setInt(1, 100);
            pstmt.setAsciiStream(2, bis, XML_Data.getBytes().length);
            pstmt.execute();

            bis.close();

            ResultSet rs = stmt.executeQuery(QUERY);
            if(rs.next()){
                InputStream xmlInputStream = rs.getAsciiStream(1);
                int c;

                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                while ((c = xmlInputStream.read()) != -1){
                    bos.write(c);
                }

                System.out.println(bos.toString());
            }

            rs.close();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}

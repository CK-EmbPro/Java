package com.DAO;

import com.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAOimple implements UserDAO {
    private Connection conn;
    public UserDAOimple(Connection conn){
        super();
        this.conn = conn;
    }


    @Override
    public boolean userRegister(User us) {
        boolean f = false;
        String sql = "insert into user(name, email, phon, password) values(?,?,?,?)";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, us.getName());
            pstmt.setString(2, us.getEmail());
            pstmt.setString(3, us.getPhono());
            pstmt.setString(4, us.getPassword());

            int affectedRows = pstmt.executeUpdate();

            if(affectedRows ==1 ){
                f = true;
            }

        }catch (SQLException e){
            e.printStackTrace();
        }

        return f;
    }

    @Override
    public User login(String email, String password){
        User us = null;
        try {
            String sql = "select * from user where email = ? and password =?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, email);
            pstmt.setString(2, password);

            ResultSet rs = pstmt.executeQuery();
            us = new User();
            while(rs.next()){
                us.setId(rs.getInt(1));
                us.setName(rs.getString(2));
                us.setEmail(rs.getString(3));
                us.setPhono(rs.getString(4));
                us.setPassword(rs.getString(5));
                us.setAddress(rs.getString(6));
                us.setLandmark(rs.getString(7));
                us.setCity(rs.getString(8));
                us.setState(rs.getString(9));
                us.setPincode(rs.getString(10));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return us;
    }
}

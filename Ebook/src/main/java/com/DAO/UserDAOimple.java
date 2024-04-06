package com.DAO;

import com.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
}

package com.demo1.utilstest;

import com.demo1.utils.JDBCutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class test {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        try{
            conn = JDBCutils.getconn();
            String sql = "insert into test1(name,age,gender,qq,email) values(?,?,?,?,?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1,"莉莉安");
            stmt.setInt(2,23);
            stmt.setString(3,"非二元");
            stmt.setString(4,"123142124");
            stmt.setString(5,"12312412@qq.com");
            int count = stmt.executeUpdate();
            System.out.println(count);
        }catch(SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCutils.close(stmt, conn);
        }


    }

}

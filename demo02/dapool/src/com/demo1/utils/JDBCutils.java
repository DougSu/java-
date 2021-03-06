package com.demo1.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCutils {
    private static DataSource ds;

    static {

        try {
            Properties pro = new Properties();
            pro.load(JDBCutils.class.getClassLoader().getResourceAsStream("druid.properties"));
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getconn() throws SQLException {
        return ds.getConnection();
    }

    public static void close(ResultSet rs, Statement stmt, Connection conn) throws SQLException {
        if (stmt != null){
            stmt.close();
        }

        if (conn != null){
            conn.close();
        }

        if (rs != null){
            rs.close();
        }
    }
    public static void close(Statement stmt, Connection conn) throws SQLException {

        close(null,stmt,conn);
    }

    public static DataSource getdatasource(){
        return ds;
    }
}

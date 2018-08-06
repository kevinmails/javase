package com.test.optimisticlocking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author 陈彬
 *         Date 2017/11/26
 *         Time 16:00
 */
public class JdbcConn {

    public static final String URL = "jdbc:oracle:thin:@116.228.151.161:21521:TEST";
    public static final String DRIVER = "oracle.jdbc.OracleDriver";
    public static final String USER = "btupayprod";
    public static final String PASSWORD = "1234";

    public PreparedStatement pst = null;


    public static Connection getConn() {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}

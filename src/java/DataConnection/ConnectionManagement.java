/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author OS
 */
public class ConnectionManagement {

    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Properties connectionProps = new Properties();
            connectionProps.put("user", "root");
            connectionProps.put("password", "");
            String ConnectionString = "jdbc:mysql://localhost:3306/qldact";
            conn = DriverManager.getConnection(ConnectionString,
                    connectionProps);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}

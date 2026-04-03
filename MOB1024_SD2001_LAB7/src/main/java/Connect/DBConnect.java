/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author acer
 */
public class DBConnect {
    private static final String HOSTNAME = "localhost";
    private static final String PORT = "1433";
    private static final String DATABASENAME = "lab06_jdbc";
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "Mint1234";

    public static Connection getConnection() {
        String url = "jdbc:sqlserver://" + HOSTNAME + ":" + PORT + ";databaseName=" + DATABASENAME + ";encrypt=true;trustServerCertificate=true;";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(url, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

package com.mycompany.college.app;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DatabaseConnection {
    private static Connection con = null;

    public static Connection getConnection() {
        try {
            if (con == null || con.isClosed()) {
                // 1. Create a Properties object to hold the data
                Properties props = new Properties();
                
                // 2. Load the file
                try (FileInputStream fis = new FileInputStream("db.properties")) {
                    props.load(fis);
                }

                // 3. Get values from the file
                String url = props.getProperty("db.url");
                String user = props.getProperty("db.user");
                String pass = props.getProperty("db.password");

                // 4. Establish connection
                con = DriverManager.getConnection(url, user, pass);
            }
        } catch (Exception e) {
            System.err.println("Database Connection Failed! Check if db.properties exists.");
            e.printStackTrace();
        }
        return con;
    }
}
package org.example.firstappfx.service;


import java.sql.*;


public class DatabaseConnexionService
{

    private static final String url = "jdbc:sqlite:C:/path/to/your/database.db";
    private static DatabaseConnexionService instance;
    private Connection conn;


    private DatabaseConnexionService() {
        try
        {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e)
        {
            e.printStackTrace();

        }
    }

    public static synchronized DatabaseConnexionService getInstance() {
        if (instance == null) {
            instance = new DatabaseConnexionService();
        }
        return instance;
    }

    public Connection getConnection() {
        return conn;
    }

    public void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

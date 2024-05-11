package com.sanje.cafe_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {
    public static final String DB_URL = "jdbc:sqlite:db.sqlite";

    Connection conn = null;

    public DBConnection() {
        try {
            conn = DriverManager.getConnection(DB_URL);
            System.out.println("Database connected.");
        } catch (final SQLException ex) {
            System.out.println("DB Connection error: " + ex.getMessage());
        } finally {
            // close connection
            if (conn != null) {
                try {
                    conn.close();
                } catch (final SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    // Run sql queries
    public void execQuery(final String query) throws SQLException {
        final PreparedStatement statement = conn.prepareStatement(query);
        statement.execute();
        statement.close();
    }

    public void createTable() throws SQLException {
        execQuery("CREATE TABLE IF NOT EXISTS user (id INTEGER PRIMARY KEY AUTOINCREMENT, email TEXT NOT NULL, password TEXT NOT NULL, name TEXT NOT NULL)");
    }
}

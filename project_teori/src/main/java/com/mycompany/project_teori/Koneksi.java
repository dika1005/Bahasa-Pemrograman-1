package com.mycompany.project_teori;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private Connection connection;

    public Koneksi() {
        try {
            // Replace with your database URL, username, and password
            String url = "jdbc:mysql://localhost:3306/db_osis";
            String user = "root";
            String password = "";
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static void main(String[] args) {
        Koneksi koneksi = new Koneksi();
        if (koneksi.getConnection() != null) {
            System.out.println("Koneksi Berhasil");
        } else {
            System.out.println("Koneksi Gagal");
        }
    }
}

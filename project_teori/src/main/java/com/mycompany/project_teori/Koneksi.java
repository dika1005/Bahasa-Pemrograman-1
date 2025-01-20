package com.mycompany.project_teori;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {
    private static final String URL = "jdbc:mysql://localhost:3306/db_osis"; // Ganti dengan nama database Anda
    private static final String USER = "root"; // Ganti dengan username MySQL Anda
    private static final String PASSWORD = ""; // Ganti dengan password MySQL Anda

    private static Connection connection;

    // Constructor public untuk memungkinkan inisialisasi langsung
    public Koneksi() {}
    

    // Method untuk mendapatkan koneksi
    public static Connection getConnection() {
        if (connection == null) { // Membuat koneksi hanya jika belum ada
            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Koneksi berhasil!");
            } catch (SQLException e) {
                System.err.println("Koneksi gagal: " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Koneksi ke database gagal: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return connection;
    }

    // Method untuk pengujian koneksi
    public static void main(String[] args) {
        Connection con = Koneksi.getConnection();
        if (con != null) {
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        } else {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
        }
    }
}

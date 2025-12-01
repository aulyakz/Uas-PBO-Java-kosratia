/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksidatabase {
    
    private static Connection conn;

    public static Connection getKoneksi() {
        if (conn == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/kosratia";
                String user = "root";
                String pass = "";

                conn = DriverManager.getConnection(url, user, pass);
                System.out.println("Koneksi ke database berhasil!");
            } catch (SQLException ex) {
                System.out.println("Koneksi gagal: " + ex.getMessage());
            }
        }
        return conn;
    }

    public static com.sun.jdi.connect.spi.Connection getConnection(String jdbcmysqllocalhostkosratia, String root, String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

package com.example.signum;

import android.database.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;

public class BancoDeDados2 {
    private static String url = "jdbc:mysql://192.168.0.21:3306/Signum";
    private static String user = "matheus";
    private static String pass = "teste123";
    protected static Connection conexao = null;
    public BancoDeDados2() {
        if (conexao == null) conecta();
    }
    private static boolean conecta() {
        try {

            conexao = DriverManager.getConnection(url, user, pass);
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static boolean desconecta() {
        try {
            conexao.close();
            return true;
        } catch (SQLException e) {
            return false;
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}

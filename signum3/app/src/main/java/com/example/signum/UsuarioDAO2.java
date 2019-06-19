package com.example.signum;

import android.content.Context;
import android.database.SQLException;
import android.util.Log;

import java.sql.ResultSet;
import java.sql.Statement;

public class UsuarioDAO2 extends BancoDeDados2 {

    public Usuario2 getUsuario(String email, String senha) {
        try{
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM bdsignum WHERE " + "email='" + email + "' AND senha='" + senha + "'");
            if(rs.next())
            {
                return new Usuario2(rs.getString(0),rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
            }
            else return null;
        }  catch(java.sql.SQLException e) {
            return null;
        }

    }

    public boolean addUsuario(Usuario2 u) {
        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("INSERT INTO bdsignum VALUES(NULL, '" +
                    u.getName() + "'," + " '" + u.getEmail() + "', '" +
                    u.getSenha() + "', '" + u.getNEscolaridade() + "', '" + u.getNAlfabetizacaolibras() + "')");
            return true;
        }
        catch (SQLException e) {
            Log.e("HelloAppBD", e.getMessage());
            return false;
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}

package com.example.signum;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class UsuarioDAO {
    private SQLiteDatabase bancoDeDados;
    public UsuarioDAO(Context context) {
        this.bancoDeDados = (new BancoDeDados(context)).getWritableDatabase();
    }
    public Usuario getUsuario(String email, String senha) {
        Usuario usuario = null;
        String sqlQuery = "SELECT * FROM Usuarios WHERE " +
                "email='" + email + "' AND senha='" + senha + "'";
        Cursor cursor = this.bancoDeDados.rawQuery(sqlQuery, null);
        if (cursor.moveToNext()) {
            usuario = new Usuario(cursor.getString(0), cursor.getString(1),
                    cursor.getString(2), cursor.getString(3),cursor.getString(4));
        }
        cursor.close();
        return usuario;

    }

    public boolean addUsuario(Usuario u) {
        try {
            String sqlCmd = "INSERT INTO Usuarios VALUES ('" +
                    u.getName() + "'," + " '" + u.getEmail() + "', '" +
                    u.getSenha() + "', '" + u.getNEscolaridade() + "', '" + u.getNAlfabetizacaolibras() + "')";
            this.bancoDeDados.execSQL(sqlCmd);
            return true;
        }
        catch (SQLException e) {
            Log.e("HelloAppBD", e.getMessage());
            return false;
        }
    }
    /*public Cursor getUsuarios() {
        return this.bancoDeDados.rawQuery("SELECT rowid AS _id, " +
                "nome, email, " +
                "FROM Usuarios ORDER BY nome", null);
    }*/
}

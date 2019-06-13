package com.example.signum;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BancoDeDados extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 2;
    public static final String DATABASE_NAME = "LibrasApp.db";
    private static final String SQL_CREATE_TABLES = "CREATE TABLE Usuarios(" +
            "nome TEXT,email TEXT PRIMARY KEY, senha TEXT, nescolaridade TEXT, nalfabetizacaolibras TEXT)";
    private static final String SQL_POPULATE_TABLES = "INSERT INTO Usuarios " +
            "VALUES ('Fulano de Tal','fulano@icomp.ufam.edu.br', 'teste123', 'ensino medio','basico')";
    private static final String SQL_DELETE_TABLES = "DROP TABLE IF EXISTS Usuarios";
    public BancoDeDados(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_TABLES);
        db.execSQL(SQL_POPULATE_TABLES);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_TABLES);
        onCreate(db);
    }
}

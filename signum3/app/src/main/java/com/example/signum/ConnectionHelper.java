package com.example.signum;

import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionHelper {

    String IP,DB,DBUserName,DBPassword;

    public Connection connections()
    {
        // from your local or website
        IP="192.168.0.21";
        DB="dbsignum";
        DBUserName="matheus";
        DBPassword="teste123";

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        java.sql.Connection connection=null;
        String ConncetionURL=null;

        try{
           Class.forName("net.sourceforge.jtds.jdbc.Driver");
           ConncetionURL = "jdbc:jtds:sqlserver://" + IP + ";databaseName=" + DB + ";user=" + DBUserName + "password=" + DBPassword;


        } catch(ClassNotFoundException e){
            Log.e("Error from class",e.getMessage());
        }
        catch(Exception ex) {
            Log.e("Error from Exception",ex.getMessage());

        }

        return connection;
    }
}

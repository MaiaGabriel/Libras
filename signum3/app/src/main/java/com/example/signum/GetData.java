package com.example.signum;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetData {
    Connection connect;
    String ConnectionResult="";
    Boolean isSucess = false;

    public List<Map<String,String>> getData() {
        List<Map<String,String>> data = null;
        data = new ArrayList<Map<String,String>>();

        try
        {
            ConnectionHelper connectionHelper = new ConnectionHelper();
            connect = connectionHelper.connections();

            if(connect==null)
            {
                ConnectionResult="Check your internet access!";
            }
            else
            {
                String query = "select * from matheus.signum";
                Statement stmt = connect.createStatement();
                ResultSet rs=stmt.executeQuery(query);

                while(rs.next())
                {
                    Map<String,String> datanum = new HashMap<String,String>();
                    datanum.put("nome",rs.getString("nome"));
                    datanum.put("email",rs.getString("email"));
                    datanum.put("senha",rs.getString("senha"));
                    datanum.put("nescolaridade",rs.getString("nescolaridade"));
                    datanum.put("nalfabetizacaolibras",rs.getString("nalfabetizacaolibras"));
                    datanum.get("nome");
                    data.add(datanum);
                }

                ConnectionResult = "Successsful";
                isSucess = true;
                connect.close();

            }
        }catch (Exception ex){
            isSucess=false;
            ConnectionResult= ex.getMessage();

        }
        return data;
    }
}

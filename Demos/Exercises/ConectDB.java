package Demos.Exercises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConectDB {

    public static void main(String[] args) {

        String url="url";
        String user="user";
        String paswword="password";

        try{
            Connection c=DriverManager.getConnection(url, user, paswword);
            System.out.println("Conexion exitosa");
            c.close();
        String sql= "INSERT INTO users (id,name) VALUES (?,?)";
        PreparedStatement insert= c.prepareStatement(sql);
        insert.setString(1, "Salva");
        }catch(SQLException e){
            System.out.println("Error");
        }

       
        
    }

    
}

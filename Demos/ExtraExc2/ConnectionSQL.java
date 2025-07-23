//Importar Connection ( descarga JDBC y añade el .jar a classpath)
//Importar DriverManager
//Importar SQL Exception

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionSQL {

    public static void main(String[] args) {
    String url="enlace de la URL";
    String user="usuario";
    String password="password";

    try{
        Connection c=DriverManager.getConnection(url, user, password);
            System.out.println("Exito en conexion");
            
            String insertSQL= "INSERT INTO tabla (id,name) VALUES(?,?)";
    PreparedStatement insert=c.prepareStatement(insertSQL);
    insert.setString(1, "Salva");
    insert.executeUpdate();
    
    }catch (SQLException e){
        System.out.println("Error");
    }
    
    }

   
    }


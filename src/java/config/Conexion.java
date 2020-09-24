
package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion 
{
    
    Connection con;
    String url = "jdbc:mysql://localhost:3306/asistencia";
    String user = "root";
    //String pass = "12345678";
    String pass="1234";

    public Connection Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.err.println("error"+e);
        }
        return con;
    }
}

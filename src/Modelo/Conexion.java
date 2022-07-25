package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    Connection connection;
    String driver = "com.mysql.cj.jdbc.Driver";
    String cadenaConexion = "jdbc:mysql://localhost:3306/db_reto1";
    String usuario = "root";
    String password = "";

    public Conexion() {
        try {
        Class.forName(driver);
        connection = DriverManager.getConnection(cadenaConexion, usuario, password);
        if(connection != null){
            System.out.println("Conexión exitosa con la BD");
        }
    }catch (ClassNotFoundException | SQLException e){
        System.out.println("No se pudo establecer conexión");
}
}
    public Connection getConnection(){
        return connection;
   } 

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
 




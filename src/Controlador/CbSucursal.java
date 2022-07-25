package Controlador;

import Modelo.Conexion;
import Modelo.Sucursal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class CbSucursal {
    Connection connection;
    Conexion conexion = new Conexion();
    Statement st;
    ResultSet rs;

    public CbSucursal() {
    }
    
    public ArrayList getListaSucursales(){
        ArrayList mListaSucursales = new ArrayList();
        Sucursal sucursal = null;
        String querySucursales = "SELECT idSucursal, nombreSucursal FROM sucursal;";
        try{
            connection = conexion.getConnection();
            st = connection.createStatement();
            rs = st.executeQuery(querySucursales);
            while(rs.next()){
                sucursal = new Sucursal();
                //Consultamos lo que nos devuelve la consulta a la BD
                int idSucursal = rs.getInt("idSucursal");
                String nombreSucursal = rs.getString("nombreSucursal");
                //Asignamos los valores que nos devuelve la BD a los atributos de la clase sucursal
                sucursal.setIdSucursal(idSucursal);
                sucursal.setNombreSucursal(nombreSucursal);
                mListaSucursales.add(sucursal);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        System.out.println(mListaSucursales);
        return mListaSucursales;
    }
}

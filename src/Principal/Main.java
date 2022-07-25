package Principal;
import Vistas.*;
import Modelo.*;


public class Main {

    public static void main(String[] args) {
      //1. Crear instancia de la clase conexión
      Conexion conexion = new Conexion();
        conexion.getConnection();
      //2. Crear instancia del JFrame Login
      Login login = new Login();
      login.setVisible(true);
      
      
    }
    
}

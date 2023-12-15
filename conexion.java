import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexion {
   Connection cn;
   PreparedStatement ps;
   ResultSet res;

   public conexion() {
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/oradores", "root", "");
           System.out.println("Conexion a mibase satisfacoria");
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           System.out.println("Error al conectar BD");
           if (cn != null) {
               try {
                  cn.close();
               } catch (SQLException e) {
                  System.out.println("Error al cerrar la conexión");
               }
           }
       }
       
   }
public Connection getConnetion() {
   return cn;
}

   public int Reoradores(String nombre, String apellido, String tema) {
       int respuesta = 0;
       try {
           ps = cn.prepareStatement("insert into oradores_tp(nombre, apellido, tema) values(?,?,?)");
           ps.setString(1, nombre);
           ps.setString(2, apellido);
           ps.setString(3, tema);
           respuesta = ps.executeUpdate();
       } catch (SQLException ex) {
           try {
               System.out.println("Error al cargar");
               throw ex;
           } catch (SQLException ex1) {
               Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex1);
           }
       } finally {
           if (ps != null) {
               try {
                  ps.close();
               } catch (SQLException ex) {
                  System.out.println("Error al cerrar el PreparedStatement");
               }
           }
       }
       return respuesta;
   }

    com.sun.jdi.connect.spi.Connection getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

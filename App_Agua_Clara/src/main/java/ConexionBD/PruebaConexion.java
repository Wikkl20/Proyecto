package ConexionBD;

import java.sql.Connection;

public class PruebaConexion {
public static void main(String[] args) {
    Connection con = ConexionBD.conectar();
    if (con != null) {
        System.out.println("Conexión OK. Prueba terminada.");
        ConexionBD.cerrar(con, null, null); // Cierra después de probar
    }
}}

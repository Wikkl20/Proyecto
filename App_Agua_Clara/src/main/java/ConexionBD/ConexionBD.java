
package ConexionBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/agua_clara_bd";
    private static final String USER = "root";
    private static final String PASSWORD = ""; // deja vacío si no tienes clave
    
    public static void cerrar(Connection con, PreparedStatement ps, ResultSet rs) {
    try {
        if (rs != null) rs.close();
        if (ps != null) ps.close();
        if (con != null) con.close();
    } catch (SQLException e) {
        System.out.println("Error al cerrar recursos: " + e.getMessage());
    }
}

    public static Connection conectar() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println(" Conexión exitosa a la base de datos");
        } catch (SQLException e) {
            System.out.println(" Error de conexión: " + e.getMessage());
        }
        return con;
    }
    
}


package Modelo;

import ConexionBD.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    // Objetos para la conexión
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    // ✅ Método para registrar un nuevo usuario
    public boolean registrarConsumo(Consumo c) {
    String sql = "INSERT INTO consumos (dni, nombre, direccion, consumo, totalPagar) VALUES (?, ?, ?, ?, ?)";
    try {
        con = ConexionBD.conectar();
        ps = con.prepareStatement(sql);
        ps.setString(1, c.getDni());
        ps.setString(2, c.getNombre());
        ps.setString(3, c.getDireccion());
        ps.setDouble(4, c.getConsumo());
        ps.setDouble(5, c.getTotalPagar());
        ps.executeUpdate();
        return true;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al registrar consumo: " + e.getMessage());
        return false;
    } finally {
        ConexionBD.cerrar(con, ps, null); // No hay ResultSet aquí
    }
}
    public List<Consumo> listarConsumos() {
    List<Consumo> lista = new ArrayList<>();
    String sql = "SELECT * FROM consumos";
    try {
        con = ConexionBD.conectar();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            Consumo c = new Consumo();
            c.setDni(rs.getString("dni"));
            c.setNombre(rs.getString("nombre"));
            c.setDireccion(rs.getString("direccion"));
            c.setConsumo(rs.getDouble("consumo"));
            c.setTotalPagar(rs.getDouble("totalPagar"));
            lista.add(c);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al listar consumos: " + e.getMessage());
    } finally {
        ConexionBD.cerrar(con, ps, rs);
    }
    return lista;
}
    
    // ✅ Método para verificar login (admin o usuario)
    public Usuario login(String dni, String contrasena) {
    String sql = "SELECT * FROM usuarios WHERE dni = ? AND contraseña = ?";
    Usuario u = null;
    try {
        con = ConexionBD.conectar();
        ps = con.prepareStatement(sql);
        ps.setString(1, dni);
        ps.setString(2, contrasena);
        rs = ps.executeQuery();

        if (rs.next()) {
            u = new Usuario();
           
            u.setDni(rs.getString("dni"));
            u.setNombre(rs.getString("nombre"));
            u.setDireccion(rs.getString("direccion"));
            u.setContraseña(rs.getString("contraseña"));
            u.setRol(rs.getString("rol"));
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error en el login ❌: " + e.getMessage());
    }
    return u;
}


    // ✅ Método para listar todos los usuarios y devolver una lista (no ResultSet)
    public List<Usuario> listarUsuarios() {
    List<Usuario> lista = new ArrayList<>();
    String sql = "SELECT * FROM usuarios";

    try {
        con = ConexionBD.conectar();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();

        while (rs.next()) {
            Usuario u = new Usuario();
            
            u.setDni(rs.getString("dni"));
            u.setNombre(rs.getString("nombre"));
            u.setDireccion(rs.getString("direccion"));
            u.setContraseña(rs.getString("contraseña"));
            u.setRol(rs.getString("rol"));
            lista.add(u);
        }

        rs.close();
        ps.close();
        con.close();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al listar usuarios ❌: " + e.getMessage());
    }

    return lista;
}

    // ✅ Método para eliminar usuario (solo admin)
    public boolean eliminarUsuario(String dni) {
    String sql = "DELETE FROM usuarios WHERE dni = ?";
    try {
        con = ConexionBD.conectar();
        ps = con.prepareStatement(sql);
        ps.setString(1, dni);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente ✅");
        return true;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar usuario ❌: " + e.getMessage());
        return false;
    } finally {
        ConexionBD.cerrar(con, ps, null);
    }

}
    public boolean registrarUsuario(Usuario u) {
    String sql = "INSERT INTO usuarios (dni, nombre, direccion, contraseña, rol) VALUES (?, ?, ?, ?, ?)";
    try {
        con = ConexionBD.conectar();
        ps = con.prepareStatement(sql);
        ps.setString(1, u.getDni());
        ps.setString(2, u.getNombre());
        ps.setString(3, u.getDireccion());
        ps.setString(4, u.getContraseña());
        ps.setString(5, u.getRol());
        ps.executeUpdate();
        return true;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al registrar usuario: " + e.getMessage());
        return false;
    } finally {
        ConexionBD.cerrar(con, ps, null);
    }
}
}




package Modelo;

import ConexionBD.ConexionBD;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class ConsumoDAO {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    // Registrar nuevo consumo
    public boolean registrarConsumo(Consumo c) {
        String sql = "INSERT INTO consumos (dni, nombre, direccion, consumo, total_pagar) VALUES (?, ?, ?, ?, ?)";
        try {
            con = ConexionBD.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getDni());
            ps.setString(2, c.getNombre());
            ps.setString(3, c.getDireccion());
            ps.setDouble(4, c.getConsumo());
            ps.setDouble(5, c.getTotalPagar());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Consumo registrado correctamente ✅");
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar consumo ❌: " + e.getMessage());
            return false;
        }
    }

    // Listar consumos
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
                c.setTotalPagar(rs.getDouble("total_pagar"));
                lista.add(c);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al listar consumos ❌: " + e.getMessage());
        }
        return lista;
    }
}


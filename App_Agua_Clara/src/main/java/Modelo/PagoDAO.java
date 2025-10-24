
package Modelo;

import ConexionBD.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Modelo.Pago;


public class PagoDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    ConexionBD cn = new ConexionBD(); // tu clase de conexión

    public List<Pago> listarPagos() {
    List<Pago> lista = new ArrayList<>();
    String sql = "SELECT * FROM pagos";
    try {
        con = ConexionBD.conectar();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            Pago p = new Pago();
            p.setIdPago(rs.getInt("idPago"));
            p.setDniCliente(rs.getString("dniCliente"));
            p.setFechaPago(rs.getString("fechaPago"));
            p.setMontoPagado(rs.getDouble("montoPagado"));
            p.setEstado(rs.getString("estado"));
            lista.add(p);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al listar pagos: " + e.getMessage());
    } finally {
        ConexionBD.cerrar(con, ps, rs);
    }
    return lista;
}

   public boolean insertarPago(Pago p) {
    String sql = "INSERT INTO pagos (dniCliente, fechaPago, montoPagado, estado) VALUES (?, ?, ?, ?)";
    try {
        con = ConexionBD.conectar();
        ps = con.prepareStatement(sql);
        ps.setString(1, p.getDniCliente());
        ps.setString(2, p.getFechaPago());
        ps.setDouble(3, p.getMontoPagado());
        ps.setString(4, p.getEstado());
        ps.executeUpdate();
        return true;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al registrar el pago: " + e.getMessage()); // Esto muestra el error real
        return false;
    } finally {
        ConexionBD.cerrar(con, ps, null);
    }
}
}
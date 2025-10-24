
package Vista;

import Modelo.Consumo;
import Modelo.ConsumoDAO;
import Modelo.Usuario;
import Modelo.UsuarioDAO;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmConsumo extends javax.swing.JPanel {
public FrmConsumo() {
    initComponents();
    actualizarTabla();
    if (!esAdmin()) {
        btnRegistar1.setVisible(false);
    }
    txtDniP.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(KeyEvent evt) {
            validarDNI(evt);
        }
    });
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsumo = new javax.swing.JTable();
        btnActualizarTabla = new javax.swing.JButton();
        lblTitulo1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        papelFormulario1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        lblDNI4 = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();
        txtDniP = new javax.swing.JTextField();
        lblDNI6 = new javax.swing.JLabel();
        txtConsumo = new javax.swing.JPasswordField();
        btnRegistar1 = new javax.swing.JButton();
        lblDNI7 = new javax.swing.JLabel();
        btnLimpiar1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(230, 247, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        lblTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Registro de Consumo del Servicio de Agua");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 60));

        jPanel3.setBackground(new java.awt.Color(230, 247, 255));

        tablaConsumo.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        tablaConsumo.setForeground(new java.awt.Color(0, 0, 0));
        tablaConsumo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DIN", "Nombre", "Direccion", "Consumo", "Total a pagar"
            }
        ));
        jScrollPane1.setViewportView(tablaConsumo);

        btnActualizarTabla.setBackground(new java.awt.Color(0, 102, 153));
        btnActualizarTabla.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnActualizarTabla.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarTabla.setText("Actualizar Tabla");
        btnActualizarTabla.setBorderPainted(false);
        btnActualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTablaActionPerformed(evt);
            }
        });

        lblTitulo1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo1.setText("Lista de Usuarios");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnActualizarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnActualizarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 430, 440));

        jPanel4.setBackground(new java.awt.Color(230, 247, 255));

        papelFormulario1.setBackground(new java.awt.Color(230, 247, 255));
        papelFormulario1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextField2.setUI(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        papelFormulario1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 6, 227, -1));

        lblDNI4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblDNI4.setForeground(new java.awt.Color(0, 0, 0));
        lblDNI4.setText("DNI:");
        papelFormulario1.add(lblDNI4, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 180, 153, 25));

        txtTotalPagar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtTotalPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPagarActionPerformed(evt);
            }
        });
        papelFormulario1.add(txtTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 227, -1));

        txtDniP.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtDniP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniPActionPerformed(evt);
            }
        });
        papelFormulario1.add(txtDniP, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 182, 227, -1));

        lblDNI6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblDNI6.setForeground(new java.awt.Color(0, 0, 0));
        lblDNI6.setText("Consumo:");
        papelFormulario1.add(lblDNI6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 153, 20));
        papelFormulario1.add(txtConsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 227, -1));

        btnRegistar1.setBackground(new java.awt.Color(0, 102, 153));
        btnRegistar1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnRegistar1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistar1.setText("Registrar");
        btnRegistar1.setBorderPainted(false);
        btnRegistar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistar1ActionPerformed(evt);
            }
        });
        papelFormulario1.add(btnRegistar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 115, 31));

        lblDNI7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblDNI7.setForeground(new java.awt.Color(0, 0, 0));
        lblDNI7.setText("Total  a Pagar:");
        papelFormulario1.add(lblDNI7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 153, 22));

        btnLimpiar1.setBackground(new java.awt.Color(0, 102, 153));
        btnLimpiar1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnLimpiar1.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar1.setText("Limpiar");
        btnLimpiar1.setBorderPainted(false);
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });
        papelFormulario1.add(btnLimpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 111, 31));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(papelFormulario1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(papelFormulario1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 420, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTablaActionPerformed
        actualizarTabla();

    }//GEN-LAST:event_btnActualizarTablaActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void txtTotalPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPagarActionPerformed

    private void txtDniPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniPActionPerformed

    private void btnRegistar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistar1ActionPerformed
                                                
    String dni = txtDniP.getText().trim();
    String consumoStr = txtConsumo.getText().trim();

    if (dni.isEmpty() || consumoStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Completa DNI y Consumo.");
        return;
    }
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    if (usuarioDAO.login(dni, "") == null) {
        JOptionPane.showMessageDialog(this, "DNI no registrado.");
        return;
    }
    try {
        double consumo = Double.parseDouble(consumoStr);
        double total = consumo * 1.5; // $1.5 por m³
        txtTotalPagar.setText(String.valueOf(total));

        Consumo c = new Consumo();
        c.setDni(dni);
        c.setConsumo(consumo);
        c.setTotalPagar(total);

        ConsumoDAO dao = new ConsumoDAO();
        if (dao.registrarConsumo(c)) {
            JOptionPane.showMessageDialog(this, "Consumo registrado.");
            actualizarTabla();
            txtDniP.setText("");
            txtConsumo.setText("");
            txtTotalPagar.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar consumo.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Consumo debe ser numérico.");
    }


    }//GEN-LAST:event_btnRegistar1ActionPerformed

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        txtDniP.setText("");
    txtConsumo.setText("");
    txtTotalPagar.setText("");
    }//GEN-LAST:event_btnLimpiar1ActionPerformed
private void mostrarConsumos() {
    DefaultTableModel modelo = (DefaultTableModel) tablaConsumo.getModel();
    modelo.setRowCount(0); // limpiar
    ConsumoDAO dao = new ConsumoDAO();
    List<Consumo> lista = dao.listarConsumos();

    for (Consumo c : lista) {
        Object[] fila = {
            c.getDni(),
            c.getNombre(),
            c.getDireccion(),
            c.getConsumo(),
            c.getTotalPagar()
        };
        modelo.addRow(fila);
    }
}
private void actualizarTabla() {
    DefaultTableModel modelo = (DefaultTableModel) tablaConsumo.getModel();
    modelo.setRowCount(0);
    ConsumoDAO dao = new ConsumoDAO();
    List<Consumo> lista = dao.listarConsumos();
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    
    for (Consumo c : lista) {
        String nombre = "N/A";
        String direccion = "N/A";
        Usuario u = usuarioDAO.login(c.getDni(), "");
        if (u != null) {
            nombre = u.getNombre();
            direccion = u.getDireccion();
        }
        modelo.addRow(new Object[]{
            c.getDni(),
            nombre,
            direccion,
            c.getConsumo(),
            c.getTotalPagar()
        });
    }
    if (lista.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No hay consumos registrados.");
    }


}
private boolean esAdmin() {
    // Simula verificación (ajústalo según tu login)
    return true; // Cambia a lógica real (ej: usuario.getRol().equals("Administrador"))
}
private void validarDNI(KeyEvent evt) {
    String dni = txtDniP.getText().trim();
    if (!dni.matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "DNI debe ser numérico.");
        txtDniP.setText(dni.replaceAll("[^\\d]", ""));
        return;
    }
    if (dni.length() > 8) {
        txtDniP.setText(dni.substring(0, 8));
        return;
    }
    UsuarioDAO dao = new UsuarioDAO();
    if (!dni.isEmpty()) {
        if (dao.login(dni, "") == null) {
            JOptionPane.showMessageDialog(this, "DNI no registrado.");
            txtDniP.setText("");
        }
    }
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnActualizarTabla;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnRegistar;
    private javax.swing.JButton btnRegistar1;
    private javax.swing.JComboBox<String> cbxRol;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblDNI1;
    private javax.swing.JLabel lblDNI2;
    private javax.swing.JLabel lblDNI3;
    private javax.swing.JLabel lblDNI4;
    private javax.swing.JLabel lblDNI6;
    private javax.swing.JLabel lblDNI7;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JPanel papelFormulario;
    private javax.swing.JPanel papelFormulario1;
    private javax.swing.JTable tablaConsumo;
    private javax.swing.JPasswordField txtConsumo;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDniP;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTotalPagar;
    // End of variables declaration//GEN-END:variables
}


package Vista;



import Modelo.Pago;
import Modelo.PagoDAO;
import Modelo.Usuario;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class FromRealizarPagos extends javax.swing.JPanel {
PagoDAO dao = new PagoDAO();
        DefaultTableModel modelo = new DefaultTableModel();
   
    public FromRealizarPagos() {
        System.out.println("FromRealizarPagos: constructor ejecutado");
    initComponents();
    actualizarTabla();
    tablaPagos.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {},
    new String [] {
        "ID", "DNI", "Fecha", "Monto", "Estado"
    }
));
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPagos = new javax.swing.JTable();
        btnActualizarTabla = new javax.swing.JButton();
        lblTitulo1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        papelFormulario1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        lblDNI4 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        lblDNI5 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        btnPagar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(230, 247, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        lblTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Realizar Pago del Servicio del Agua");

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

        tablaPagos.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        tablaPagos.setForeground(new java.awt.Color(0, 0, 0));
        tablaPagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DNI", "Monto", "Direccion", "Consumo", "Total a pagar"
            }
        ));
        jScrollPane1.setViewportView(tablaPagos);

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
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(btnActualizarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnActualizarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
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
        papelFormulario1.add(lblDNI4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 153, 25));

        txtDni.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        papelFormulario1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 227, -1));

        lblDNI5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblDNI5.setForeground(new java.awt.Color(0, 0, 0));
        lblDNI5.setText("Monto:");
        papelFormulario1.add(lblDNI5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 153, 22));

        txtMonto.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });
        papelFormulario1.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 227, -1));

        btnPagar.setBackground(new java.awt.Color(0, 102, 153));
        btnPagar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnPagar.setForeground(new java.awt.Color(255, 255, 255));
        btnPagar.setText("Pagar");
        btnPagar.setBorderPainted(false);
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        papelFormulario1.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 115, 31));

        btnCancelar.setBackground(new java.awt.Color(0, 102, 153));
        btnCancelar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorderPainted(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        papelFormulario1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 111, 31));

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
                .addComponent(papelFormulario1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 420, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTablaActionPerformed
        actualizarTabla();
    }//GEN-LAST:event_btnActualizarTablaActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        String dni = txtDni.getText();
        String montoStr = txtMonto.getText();

        if (dni.isEmpty() || montoStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos");
            return;
        }

        double monto = Double.parseDouble(montoStr);
        String fecha = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

        Pago p = new Pago();
        p.setDniCliente(dni);
        p.setMontoPagado(monto);
        p.setFechaPago(fecha);
        p.setEstado("Pagado");

        boolean ok = dao.insertarPago(p);
        if (ok) {
            JOptionPane.showMessageDialog(this, "Pago registrado correctamente");
            listarPagos();
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar el pago");
        }
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
            txtDni.setText("");
    txtMonto.setText("");
    
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void listarPagos() {
        String[] columnas = {"ID", "DNI", "Fecha", "Monto", "Estado"};
        modelo = new DefaultTableModel(null, columnas);

        List<Pago> lista = dao.listarPagos();
        for (Pago p : lista) {
            Object[] fila = new Object[5];
            fila[0] = p.getIdPago();
            fila[1] = p.getDniCliente();
            fila[2] = p.getFechaPago();
            fila[3] = p.getMontoPagado();
            fila[4] = p.getEstado();
            modelo.addRow(fila);
        }
        tablaPagos.setModel(modelo);
    }
private void limpiarCampos() {
        txtDni.setText("");
        txtMonto.setText("");
    }
private void actualizarTabla() {
    DefaultTableModel modelo = (DefaultTableModel) tablaPagos.getModel();
    modelo.setRowCount(0);
    PagoDAO dao = new PagoDAO();
    List<Pago> lista = dao.listarPagos();
    for (Pago p : lista) {
        modelo.addRow(new Object[]{
            p.getIdPago(),
            p.getDniCliente(),
            p.getFechaPago(),
            p.getMontoPagado(),
            p.getEstado()
        });
    }
    if (lista.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No hay pagos registrados.");
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarTabla;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblDNI4;
    private javax.swing.JLabel lblDNI5;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JPanel papelFormulario1;
    private javax.swing.JTable tablaPagos;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}

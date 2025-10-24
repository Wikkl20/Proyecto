
package Vista;

import Modelo.Usuario;
import java.awt.BorderLayout;
import javax.swing.JPanel;


public class FrmPrincipal extends javax.swing.JFrame {
    
    private Usuario usuarioActual;
    public FrmPrincipal() {
        initComponents();
        this.usuarioActual = null;
        configurarSegunRol();
    }



    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelEncabezado = new javax.swing.JPanel();
        lblEncabezado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        panelMenuLateral = new javax.swing.JPanel();
        btnUsuario = new javax.swing.JButton();
        btnPagos = new javax.swing.JButton();
        btnConsumo = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnRealizarPago = new javax.swing.JButton();
        PanelContenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEncabezado.setBackground(new java.awt.Color(0, 153, 204));

        lblEncabezado.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblEncabezado.setForeground(new java.awt.Color(255, 255, 255));
        lblEncabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEncabezado.setText("Bienvenidos Agua Clara");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema de Registro de Pagos");

        btnSalir.setBackground(new java.awt.Color(255, 102, 102));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setContentAreaFilled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEncabezadoLayout = new javax.swing.GroupLayout(panelEncabezado);
        panelEncabezado.setLayout(panelEncabezadoLayout);
        panelEncabezadoLayout.setHorizontalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(lblEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 381, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(btnSalir)
                .addGap(39, 39, 39))
        );
        panelEncabezadoLayout.setVerticalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        panelMenuLateral.setBackground(new java.awt.Color(0, 102, 153));

        btnUsuario.setBackground(new java.awt.Color(0, 102, 153));
        btnUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuario.setText("Usuarios");
        btnUsuario.setBorderPainted(false);
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });

        btnPagos.setBackground(new java.awt.Color(0, 102, 153));
        btnPagos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPagos.setForeground(new java.awt.Color(255, 255, 255));
        btnPagos.setText("Pagos");
        btnPagos.setBorderPainted(false);
        btnPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagosActionPerformed(evt);
            }
        });

        btnConsumo.setBackground(new java.awt.Color(0, 102, 153));
        btnConsumo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConsumo.setForeground(new java.awt.Color(255, 255, 255));
        btnConsumo.setText("Consumo");
        btnConsumo.setBorderPainted(false);
        btnConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsumoActionPerformed(evt);
            }
        });

        btnReportes.setBackground(new java.awt.Color(0, 102, 153));
        btnReportes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setText("Boleta");
        btnReportes.setBorderPainted(false);
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Menú");

        btnRealizarPago.setBackground(new java.awt.Color(0, 102, 153));
        btnRealizarPago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRealizarPago.setForeground(new java.awt.Color(255, 255, 255));
        btnRealizarPago.setText("Realizar Pago");
        btnRealizarPago.setBorderPainted(false);
        btnRealizarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLateralLayout = new javax.swing.GroupLayout(panelMenuLateral);
        panelMenuLateral.setLayout(panelMenuLateralLayout);
        panelMenuLateralLayout.setHorizontalGroup(
            panelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLateralLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPagos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRealizarPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        panelMenuLateralLayout.setVerticalGroup(
            panelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLateralLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnRealizarPago)
                .addGap(33, 33, 33)
                .addComponent(btnUsuario)
                .addGap(40, 40, 40)
                .addComponent(btnPagos)
                .addGap(38, 38, 38)
                .addComponent(btnConsumo)
                .addGap(40, 40, 40)
                .addComponent(btnReportes)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        PanelContenido.setBackground(new java.awt.Color(230, 247, 255));

        javax.swing.GroupLayout PanelContenidoLayout = new javax.swing.GroupLayout(PanelContenido);
        PanelContenido.setLayout(PanelContenidoLayout);
        PanelContenidoLayout.setHorizontalGroup(
            PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelContenidoLayout.setVerticalGroup(
            PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelMenuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelMenuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
            FrmRegistrarUsuario p1 = new FrmRegistrarUsuario();
             mostrarPanel(p1);
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagosActionPerformed
    FrmPagos panelPagos = new FrmPagos();
    panelPagos.setSize(846, 522);
    panelPagos.setLocation(0, 0);

    // 🔹 'contenido' es tu JPanel central (asegúrate que existe con ese nombre)
    PanelContenido.removeAll();
    PanelContenido.add(panelPagos, BorderLayout.CENTER);
    PanelContenido.revalidate();
    PanelContenido.repaint();


    }//GEN-LAST:event_btnPagosActionPerformed

    private void btnConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsumoActionPerformed
        FrmConsumo p3 = new FrmConsumo();
         mostrarPanel(p3);
    }//GEN-LAST:event_btnConsumoActionPerformed

    private void btnRealizarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPagoActionPerformed
    FromRealizarPagos  frmPago = new FromRealizarPagos();
    mostrarPanel(frmPago);
    }//GEN-LAST:event_btnRealizarPagoActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportesActionPerformed
public void mostrarPanel(JPanel p) {
    p.setSize(1200, 1200);
    p.setLocation(0, 0);
    PanelContenido.removeAll();
    PanelContenido.add(p, BorderLayout.CENTER);
    PanelContenido.revalidate();
    PanelContenido.repaint();
}


public FrmPrincipal(Usuario u) {
    initComponents();
    this.usuarioActual = u;

    if (u.getRol().equalsIgnoreCase("usuario")) {
        btnUsuario.setEnabled(false); // ejemplo: solo admin ve usuarios
    }
}
    private void configurarAccesoPorRol() {
        if (usuarioActual.getRol().equalsIgnoreCase("usuario")) {
            // deshabilitar botones que no puede usar
            btnUsuario.setEnabled(false);
            btnConsumo.setEnabled(false);
            btnReportes.setEnabled(false);
            // pagos sí puede
            btnPagos.setEnabled(true);
        } else if (usuarioActual.getRol().equalsIgnoreCase("admin")) {
            // admin todo habilitado
            btnUsuario.setEnabled(true);
            btnConsumo.setEnabled(true);
            btnPagos.setEnabled(true);
            btnReportes.setEnabled(true);
        }
    }
    private void configurarSegunRol() {
    if (usuarioActual != null && usuarioActual.getRol().equalsIgnoreCase("usuario")) {
        btnUsuario.setEnabled(false);
        btnConsumo.setEnabled(false);
        btnReportes.setEnabled(false);
        btnPagos.setEnabled(true);
        // Aquí podrías agregar un nuevo botón si quieres que diga "Realizar pago"
    } else {
        // El administrador puede usar todo
        btnUsuario.setEnabled(true);
        btnConsumo.setEnabled(true);
        btnReportes.setEnabled(true);
        btnPagos.setEnabled(true);
    }
}
  public void setUsuarioActual(Usuario u) {
        this.usuarioActual = u;

        // Si quieres mostrar el nombre del usuario en una etiqueta, por ejemplo:
        if (u != null) {
            System.out.println("Usuario logueado: " + u.getNombre());
            // o si tienes un JLabel lblUsuario:
            // lblUsuario.setText("Bienvenido, " + u.getNombre());
        }
    }

    // ✅ Método opcional para obtener el usuario actual desde otro formulario
    public Usuario getUsuarioActual() {
        return usuarioActual;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelContenido;
    private javax.swing.JButton btnConsumo;
    private javax.swing.JButton btnPagos;
    private javax.swing.JButton btnRealizarPago;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEncabezado;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelMenuLateral;
    // End of variables declaration//GEN-END:variables
}

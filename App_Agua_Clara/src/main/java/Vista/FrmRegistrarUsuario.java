package Vista;
import Modelo.Usuario;
import Modelo.UsuarioDAO;
import javax.swing.JOptionPane;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class FrmRegistrarUsuario extends javax.swing.JPanel {
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    Usuario user = new Usuario();
    DefaultTableModel modeloTabla = new DefaultTableModel();
    
    public FrmRegistrarUsuario() {
        initComponents();
        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {},
    new String [] {
        "ID", "DNI", "Nombre", "Dirección", "Contraseña", "Rol"
    }
));
    }
   

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        papelFormulario = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lblDNI = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        lblDNI1 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblDNI2 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        btnRegistar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        lblDNI3 = new javax.swing.JLabel();
        cbxRol = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        lblTitulo1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(230, 247, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        lblTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Registro de Usuarios");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 60));

        papelFormulario.setBackground(new java.awt.Color(230, 247, 255));

        lblNombre.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Nombre Completo:");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextField1.setUI(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        lblDNI.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblDNI.setForeground(new java.awt.Color(0, 0, 0));
        lblDNI.setText("DNI:");

        txtNombre.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtDni.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        lblDNI1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblDNI1.setForeground(new java.awt.Color(0, 0, 0));
        lblDNI1.setText("Dirección");

        txtDireccion.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        lblDNI2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblDNI2.setForeground(new java.awt.Color(0, 0, 0));
        lblDNI2.setText("Contaseña:");

        btnRegistar.setBackground(new java.awt.Color(0, 102, 153));
        btnRegistar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnRegistar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistar.setText("Registrar");
        btnRegistar.setBorderPainted(false);
        btnRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(0, 102, 153));
        btnActualizar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorderPainted(false);

        lblDNI3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblDNI3.setForeground(new java.awt.Color(0, 0, 0));
        lblDNI3.setText("Rol:");

        cbxRol.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        cbxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Administrador", " " }));

        btnLimpiar.setBackground(new java.awt.Color(0, 102, 153));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorderPainted(false);

        javax.swing.GroupLayout papelFormularioLayout = new javax.swing.GroupLayout(papelFormulario);
        papelFormulario.setLayout(papelFormularioLayout);
        papelFormularioLayout.setHorizontalGroup(
            papelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(papelFormularioLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(papelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(papelFormularioLayout.createSequentialGroup()
                        .addComponent(btnRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(papelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(papelFormularioLayout.createSequentialGroup()
                            .addGroup(papelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblDNI1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDNI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                .addComponent(lblDNI2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(papelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1)
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                .addComponent(txtDni)
                                .addComponent(txtDireccion)
                                .addComponent(txtContraseña)))
                        .addGroup(papelFormularioLayout.createSequentialGroup()
                            .addComponent(lblDNI3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbxRol, 0, 227, Short.MAX_VALUE))))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        papelFormularioLayout.setVerticalGroup(
            papelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(papelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addGroup(papelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(papelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(papelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDNI1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(papelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDNI2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(papelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDNI3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(papelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1.add(papelFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 410, 450));

        jPanel3.setBackground(new java.awt.Color(230, 247, 255));

        tablaUsuarios.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        tablaUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DIN", "Nombre", "Direccion", "Contraseña", "Rol"
            }
        ));
        jScrollPane1.setViewportView(tablaUsuarios);

        btnEliminar.setBackground(new java.awt.Color(0, 102, 153));
        btnEliminar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar Usuario");
        btnEliminar.setBorderPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 460, 380));

        lblTitulo1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo1.setText("Lista de Usuarios");
        jPanel1.add(lblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 440, 48));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
                                      
    int filaSeleccionada = tablaUsuarios.getSelectedRow();
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(null, "Seleccione un usuario para eliminar.");
        return;
    }
    String dni = tablaUsuarios.getValueAt(filaSeleccionada, 1).toString(); // Columna DNI
    if (usuarioDAO.eliminarUsuario(dni)) {
        JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente.");
        cargarUsuariosEnTabla(); // Actualiza la tabla
    } else {
        JOptionPane.showMessageDialog(null, "Error al eliminar usuario.");
    }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistarActionPerformed
    String dni = txtDni.getText().trim();
    String nombre = txtNombre.getText().trim();
    String direccion = txtDireccion.getText().trim();
    String contraseña = new String(txtContraseña.getPassword()).trim();
    String rol = cbxRol.getSelectedItem().toString().trim();

    // Validar campos
    if (dni.isEmpty() || nombre.isEmpty() || direccion.isEmpty() || contraseña.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos.");
        return;
    }

    // Llenar el objeto Usuario
    user.setDni(dni);
    user.setNombre(nombre); // Añadido para incluir el nombre
    user.setDireccion(direccion);
    user.setContraseña(contraseña);
    user.setRol(rol);

    // Guardar en la BD
    if (usuarioDAO.registrarUsuario(user)) {
        JOptionPane.showMessageDialog(null, "Usuario registrado correctamente.");
        cargarUsuariosEnTabla(); // Actualiza la tabla
        limpiarCampos();
    } else {
        JOptionPane.showMessageDialog(null, "Error al registrar el usuario. Verifica los datos o la conexión.");
    }
    


    }//GEN-LAST:event_btnRegistarActionPerformed

private void listarUsuarios() {

    UsuarioDAO dao = new UsuarioDAO();
    List<Usuario> lista = dao.listarUsuarios();

    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID");
    modelo.addColumn("DNI");
    modelo.addColumn("Nombre");
    modelo.addColumn("Dirección");
    modelo.addColumn("Contraseña");
    modelo.addColumn("Rol");

    for (Usuario u : lista) {
        Object[] fila = new Object[6];
        fila[0] = u.getIdUsuario();
        fila[1] = u.getDni();
        fila[2] = u.getNombre();
        fila[3] = u.getDireccion();
        fila[4] = u.getContraseña();
        fila[5] = u.getRol();

        modelo.addRow(fila);
    }

    tablaUsuarios.setModel(modelo);
}

private void limpiarCampos() {
   
    txtDni.setText("");
    txtDireccion.setText("");
    txtContraseña.setText("");
    cbxRol.setSelectedIndex(0);
}
void cargarUsuariosEnTabla() {
    DefaultTableModel modelo = (DefaultTableModel) tablaUsuarios.getModel();
    modelo.setRowCount(0); // Limpia la tabla

    UsuarioDAO dao = new UsuarioDAO();
    List<Usuario> lista = dao.listarUsuarios();

    for (Usuario u : lista) {
        Object[] fila = {
            u.getIdUsuario(), // Añadido ID
            u.getDni(),
            u.getNombre(),
            u.getDireccion(),
            u.getContraseña(),
            u.getRol()
        };
        modelo.addRow(fila);
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistar;
    private javax.swing.JComboBox<String> cbxRol;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblDNI1;
    private javax.swing.JLabel lblDNI2;
    private javax.swing.JLabel lblDNI3;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JPanel papelFormulario;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

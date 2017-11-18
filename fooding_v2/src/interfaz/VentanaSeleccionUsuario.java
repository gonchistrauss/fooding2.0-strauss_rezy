package interfaz;

import dominio.Sistema;

public class VentanaSeleccionUsuario extends javax.swing.JDialog {

    private Sistema modelo;

    public VentanaSeleccionUsuario(Sistema miSis) {
        initComponents();
        modelo = miSis;
        this.setModal(true);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboUsuarios = new javax.swing.JComboBox<>();
        lblFotoPerfil = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblUsuario = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblNacimiento = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        campoNombre = new javax.swing.JLabel();
        campoNacimiento = new javax.swing.JLabel();
        campoApellido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(570, 295));
        setPreferredSize(new java.awt.Dimension(570, 295));
        setResizable(false);
        setSize(new java.awt.Dimension(570, 295));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Seravek", 1, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/multiple-users-silhouette.png"))); // NOI18N
        jLabel1.setText("Seleccion de usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, -10, 370, 64);

        getContentPane().add(comboUsuarios);
        comboUsuarios.setBounds(260, 50, 280, 40);

        lblFotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil_defecto.png"))); // NOI18N
        getContentPane().add(lblFotoPerfil);
        lblFotoPerfil.setBounds(30, 110, 130, 130);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 40, 530, 10);

        lblUsuario.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user (1).png"))); // NOI18N
        lblUsuario.setText("Seleccionar usuario");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(40, 60, 210, 24);

        lblNombre.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/man-user.png"))); // NOI18N
        lblNombre.setText("Nombre:");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(180, 120, 90, 24);

        lblApellido.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblApellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/man-user.png"))); // NOI18N
        lblApellido.setText("Apellido:");
        getContentPane().add(lblApellido);
        lblApellido.setBounds(180, 160, 90, 24);

        lblNacimiento.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblNacimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendar-page-empty.png"))); // NOI18N
        lblNacimiento.setText("Nacimiento:");
        getContentPane().add(lblNacimiento);
        lblNacimiento.setBounds(180, 200, 120, 24);

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/left-arrow.png"))); // NOI18N
        jButton1.setText("Volver");
        getContentPane().add(jButton1);
        jButton1.setBounds(260, 240, 150, 50);

        btnContinuar.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/right-arrow.png"))); // NOI18N
        btnContinuar.setText("Continuar");
        getContentPane().add(btnContinuar);
        btnContinuar.setBounds(410, 240, 150, 50);

        campoNombre.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        campoNombre.setForeground(new java.awt.Color(0, 153, 255));
        campoNombre.setText("xxx");
        getContentPane().add(campoNombre);
        campoNombre.setBounds(310, 120, 90, 24);

        campoNacimiento.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        campoNacimiento.setForeground(new java.awt.Color(0, 153, 255));
        campoNacimiento.setText("zzz");
        getContentPane().add(campoNacimiento);
        campoNacimiento.setBounds(310, 200, 120, 24);

        campoApellido.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        campoApellido.setForeground(new java.awt.Color(0, 153, 255));
        campoApellido.setText("yyy");
        getContentPane().add(campoApellido);
        campoApellido.setBounds(310, 160, 90, 24);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel campoApellido;
    private javax.swing.JLabel campoNacimiento;
    private javax.swing.JLabel campoNombre;
    private javax.swing.JComboBox<String> comboUsuarios;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblFotoPerfil;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}

package interfaz;

import dominio.Sistema;

public class VentanaSeleccionProfesional extends javax.swing.JDialog {

    private Sistema modelo;

    public VentanaSeleccionProfesional(Sistema miSis) {
        initComponents();
        modelo = miSis;
        this.setModal(true);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        comboProfesionales = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        lblFotoPerfil = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblProfesional = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblNacimiento = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Seleccion de profesional");
        setMinimumSize(new java.awt.Dimension(570, 295));
        setPreferredSize(new java.awt.Dimension(570, 295));
        setResizable(false);
        setSize(new java.awt.Dimension(570, 295));
        getContentPane().setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Seravek", 1, 27)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(102, 102, 102));
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/teamwork-in-the-office.png"))); // NOI18N
        lblTitulo.setText("Seleccion de profesional");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(120, -10, 370, 64);

        comboProfesionales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        getContentPane().add(comboProfesionales);
        comboProfesionales.setBounds(260, 50, 280, 40);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 90, 530, 10);

        lblFotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil_defecto.png"))); // NOI18N
        getContentPane().add(lblFotoPerfil);
        lblFotoPerfil.setBounds(30, 110, 130, 130);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(20, 40, 530, 10);

        lblProfesional.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/list-with-possible-workers-to-choose (1).png"))); // NOI18N
        lblProfesional.setText("Seleccionar profesional:");
        getContentPane().add(lblProfesional);
        lblProfesional.setBounds(40, 60, 210, 24);

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

        btnContinuar.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/right-arrow.png"))); // NOI18N
        btnContinuar.setText("Continuar");
        getContentPane().add(btnContinuar);
        btnContinuar.setBounds(410, 240, 150, 50);

        btnVolver.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/left-arrow.png"))); // NOI18N
        btnVolver.setText("Volver");
        getContentPane().add(btnVolver);
        btnVolver.setBounds(260, 240, 150, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> comboProfesionales;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblFotoPerfil;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblProfesional;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}

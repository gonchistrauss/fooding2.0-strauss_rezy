package interfaz;

import dominio.Sistema;
import dominio.Usuario;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class VentanaSeleccionUsuario extends javax.swing.JDialog {

    private Sistema modelo;

    public VentanaSeleccionUsuario(Sistema miSis) {
        initComponents();
        modelo = miSis;
        this.setModal(true);
        this.setLocationRelativeTo(null);
        cargarLista();
    }
    
     public void cargarLabels() {
        Usuario usuario = (Usuario) comboUsuarios.getSelectedItem();
        campoNacionalidad.setText(usuario.getNacionalidad().getCountry());
        campoConsultas.setText(String.valueOf(usuario.getConsultas().size()));
        DateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        campoNacimiento.setText(date.format(usuario.getFechaDeNacimiento()));
        if (usuario.getPathPerfil().equals("/imagenes/perfil_defecto.png")) {
            lblFotoPerfil.setIcon(new ImageIcon(this.getClass().getResource(usuario.getPathPerfil())));
        } else {
            lblFotoPerfil.setIcon(new ImageIcon(usuario.getPathPerfil()));
        }
    }

    public void cargarLista() {
        this.comboUsuarios.setModel(new DefaultComboBoxModel(modelo.getListaUsuarios().toArray()));
        cargarLabels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboUsuarios = new javax.swing.JComboBox<>();
        lblFotoPerfil = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblUsuario = new javax.swing.JLabel();
        lblNacionalidad = new javax.swing.JLabel();
        lblConsultas = new javax.swing.JLabel();
        lblNacimiento = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        campoNacionalidad = new javax.swing.JLabel();
        campoNacimiento = new javax.swing.JLabel();
        campoConsultas = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(570, 320));
        setPreferredSize(new java.awt.Dimension(570, 320));
        setResizable(false);
        setSize(new java.awt.Dimension(570, 320));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Seravek", 1, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/multiple-users-silhouette.png"))); // NOI18N
        jLabel1.setText("Seleccion de usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, -10, 370, 64);

        comboUsuarios.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        comboUsuarios.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboUsuariosItemStateChanged(evt);
            }
        });
        getContentPane().add(comboUsuarios);
        comboUsuarios.setBounds(260, 50, 280, 40);

        lblFotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil_defecto.png"))); // NOI18N
        getContentPane().add(lblFotoPerfil);
        lblFotoPerfil.setBounds(30, 110, 130, 130);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 40, 530, 10);

        lblUsuario.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user (1).png"))); // NOI18N
        lblUsuario.setText("Seleccionar usuario:");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(40, 60, 210, 24);

        lblNacionalidad.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblNacionalidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/international-delivery.png"))); // NOI18N
        lblNacionalidad.setText("Nacionalidad:");
        getContentPane().add(lblNacionalidad);
        lblNacionalidad.setBounds(180, 120, 130, 24);

        lblConsultas.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/man-user.png"))); // NOI18N
        lblConsultas.setText("Consultas:");
        getContentPane().add(lblConsultas);
        lblConsultas.setBounds(180, 200, 110, 24);

        lblNacimiento.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblNacimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendar-page-empty.png"))); // NOI18N
        lblNacimiento.setText("Nacimiento:");
        getContentPane().add(lblNacimiento);
        lblNacimiento.setBounds(180, 160, 120, 24);

        btnVolver.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/left-arrow.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver);
        btnVolver.setBounds(260, 240, 150, 50);

        btnContinuar.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/right-arrow.png"))); // NOI18N
        btnContinuar.setText("Continuar");
        getContentPane().add(btnContinuar);
        btnContinuar.setBounds(410, 240, 150, 50);

        campoNacionalidad.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        campoNacionalidad.setForeground(new java.awt.Color(0, 153, 255));
        campoNacionalidad.setText("xxx");
        getContentPane().add(campoNacionalidad);
        campoNacionalidad.setBounds(310, 120, 230, 24);

        campoNacimiento.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        campoNacimiento.setForeground(new java.awt.Color(0, 153, 255));
        campoNacimiento.setText("zzz");
        getContentPane().add(campoNacimiento);
        campoNacimiento.setBounds(310, 160, 230, 24);

        campoConsultas.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        campoConsultas.setForeground(new java.awt.Color(0, 153, 255));
        campoConsultas.setText("yyy");
        getContentPane().add(campoConsultas);
        campoConsultas.setBounds(310, 200, 230, 24);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wallll.png"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(-20, -10, 790, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboUsuariosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboUsuariosItemStateChanged
        cargarLabels();
    }//GEN-LAST:event_comboUsuariosItemStateChanged

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel campoConsultas;
    private javax.swing.JLabel campoNacimiento;
    private javax.swing.JLabel campoNacionalidad;
    private javax.swing.JComboBox<Object> comboUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblConsultas;
    private javax.swing.JLabel lblFotoPerfil;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}

package interfaz;

import dominio.Consulta;
import dominio.Profesional;
import dominio.Sistema;
import dominio.Usuario;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class VentanaConsultaProfesional extends javax.swing.JDialog {

    private Sistema modelo;
    private Profesional profesionalActivo;
    private Usuario usuarioConsulta;
    private Consulta consultaUsuario;

    public VentanaConsultaProfesional(Sistema miSis, Consulta consulta) {
        initComponents();
        this.setModal(true);
        this.setLocationRelativeTo(null);
        modelo = miSis;
        consultaUsuario = consulta;
        profesionalActivo = modelo.obtenerSesionActivaProfesional();
        usuarioConsulta = consulta.getUsuario();
        this.lblNombre.setText("Nombre: " + usuarioConsulta.getNombre());
        this.lblApellido.setText("Apellidos: " + usuarioConsulta.getApellidos());
        this.lblNacionalidad.setText("Nacionalidad: " + usuarioConsulta.getNacionalidad().getCountry());
        if (!usuarioConsulta.getPathPerfil().equals("/imagenes/perfil_defecto.png")) {
            this.lblFotoPerfil.setIcon(new ImageIcon(usuarioConsulta.getPathPerfil()));
        }
        DateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        this.lblNacimiento.setText("Nacimiento: " + date.format(usuarioConsulta.getFechaDeNacimiento()));
        this.txtHistorialConsulta.setText(consulta.toString());
        this.comboPreferencias.setModel(new DefaultComboBoxModel(usuarioConsulta.getPreferencias().toArray()));
        this.comboRestricciones.setModel(new DefaultComboBoxModel(usuarioConsulta.getRestricciones().toArray()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblInformacion = new javax.swing.JLabel();
        lblFotoPerfil = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblNacimiento = new javax.swing.JLabel();
        lblNacionalidad = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboPreferencias = new javax.swing.JComboBox<>();
        comboRestricciones = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHistorialConsulta = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMensaje = new javax.swing.JTextArea();
        lblRespuesta = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Respuesta a consulta directa");
        setMinimumSize(new java.awt.Dimension(845, 660));
        setPreferredSize(new java.awt.Dimension(845, 660));
        setSize(new java.awt.Dimension(845, 660));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Seravek", 1, 27)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/send (2).png"))); // NOI18N
        lblTitulo.setText("Consulta directa");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(290, 20, 310, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 50, 800, 12);

        lblInformacion.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblInformacion.setText("Informacion del usuario:");
        getContentPane().add(lblInformacion);
        lblInformacion.setBounds(60, 60, 210, 20);

        lblFotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil_defecto.png"))); // NOI18N
        getContentPane().add(lblFotoPerfil);
        lblFotoPerfil.setBounds(90, 90, 130, 130);

        lblNombre.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblNombre.setText("Nombre:");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(20, 250, 260, 16);

        lblApellido.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblApellido.setText("Apellidos:");
        getContentPane().add(lblApellido);
        lblApellido.setBounds(20, 300, 270, 16);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setToolTipText("");
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(320, 70, 12, 530);

        lblNacimiento.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblNacimiento.setText("Nacimiento:");
        getContentPane().add(lblNacimiento);
        lblNacimiento.setBounds(20, 350, 270, 20);

        lblNacionalidad.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblNacionalidad.setText("Nacionalidad:");
        getContentPane().add(lblNacionalidad);
        lblNacionalidad.setBounds(20, 400, 270, 16);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Preferencias:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 450, 110, 20);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Restricciones:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 500, 110, 16);

        comboPreferencias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        getContentPane().add(comboPreferencias);
        comboPreferencias.setBounds(130, 450, 190, 27);

        comboRestricciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        getContentPane().add(comboRestricciones);
        comboRestricciones.setBounds(130, 490, 190, 40);

        txtHistorialConsulta.setEditable(false);
        txtHistorialConsulta.setColumns(20);
        txtHistorialConsulta.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        txtHistorialConsulta.setForeground(new java.awt.Color(0, 102, 255));
        txtHistorialConsulta.setRows(5);
        jScrollPane1.setViewportView(txtHistorialConsulta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(340, 100, 480, 270);

        jLabel1.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/history.png"))); // NOI18N
        jLabel1.setText("Historial de consulta:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(500, 70, 200, 30);

        txtMensaje.setColumns(20);
        txtMensaje.setRows(5);
        txtMensaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMensajeKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(txtMensaje);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(340, 410, 480, 120);

        lblRespuesta.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblRespuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/email.png"))); // NOI18N
        lblRespuesta.setText("Mensaje:");
        getContentPane().add(lblRespuesta);
        lblRespuesta.setBounds(350, 390, 100, 16);

        btnEnviar.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/forward-arrow.png"))); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.setEnabled(false);
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar);
        btnEnviar.setBounds(720, 540, 100, 40);

        btnSalir.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sign-out-option.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(10, 580, 100, 40);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wallll.png"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(-15, -34, 920, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        VentanaPanelProfesional ventana = new VentanaPanelProfesional(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        VentanaPanelProfesional ventana = new VentanaPanelProfesional(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void txtMensajeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMensajeKeyReleased
       if (!this.txtMensaje.getText().isEmpty()) {
            this.btnEnviar.setEnabled(true);
        } else {
            this.btnEnviar.setEnabled(false);
        }
    }//GEN-LAST:event_txtMensajeKeyReleased

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        consultaUsuario.agregarIncidencia(this.txtMensaje.getText(), dateFormat.format(date), profesionalActivo);
        this.txtHistorialConsulta.setText(consultaUsuario.toString());
        this.txtMensaje.setText("");
        this.btnEnviar.setEnabled(false);
    }//GEN-LAST:event_btnEnviarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboPreferencias;
    private javax.swing.JComboBox<String> comboRestricciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblFotoPerfil;
    private javax.swing.JLabel lblInformacion;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRespuesta;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtHistorialConsulta;
    private javax.swing.JTextArea txtMensaje;
    // End of variables declaration//GEN-END:variables
}

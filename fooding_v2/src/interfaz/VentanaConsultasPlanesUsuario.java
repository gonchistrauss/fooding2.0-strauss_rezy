package interfaz;

import dominio.Consulta;
import dominio.Sistema;
import dominio.Usuario;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import utils.Tipos;
import utils.Tipos.Estado;

public class VentanaConsultasPlanesUsuario extends javax.swing.JDialog {

    private Sistema modelo;
    private Usuario usuarioActivo;
    private ArrayList<Consulta> listaActual;

    public VentanaConsultasPlanesUsuario(Sistema miSis) {
        initComponents();
        modelo = miSis;
        listaActual = new ArrayList<>();
        usuarioActivo = modelo.obtenerSesionActivaUsuario();
        this.setLocationRelativeTo(null);
        this.setModal(true);
        agregaBotonesAlGrupo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        btnSalir = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        rbtnPlanes = new javax.swing.JRadioButton();
        rbtnConsultas = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        lblInbox = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lblNacimiento = new javax.swing.JLabel();
        lblFotoPerfil = new javax.swing.JLabel();
        lblInformacion = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblNacionalidad = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        lblConsulta = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtConsulta = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMensaje = new javax.swing.JTextArea();
        btnEnviar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstInbox = new javax.swing.JList<>();
        lblResponder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(926, 856));
        setResizable(false);
        setSize(new java.awt.Dimension(926, 856));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        btnSalir.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(10, 780, 110, 40);

        lblTitulo.setFont(new java.awt.Font("Seravek", 1, 27)); // NOI18N
        lblTitulo.setText("Mis consultas / Mis planes");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(300, 0, 400, 60);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 50, 860, 10);

        rbtnPlanes.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 14)); // NOI18N
        rbtnPlanes.setText("PLANES DE ALIMENTACION");
        rbtnPlanes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnPlanesActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnPlanes);
        rbtnPlanes.setBounds(170, 60, 290, 30);

        rbtnConsultas.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 14)); // NOI18N
        rbtnConsultas.setText("CONSULTAS DIRECTAS");
        rbtnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnConsultasActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnConsultas);
        rbtnConsultas.setBounds(510, 60, 230, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(20, 90, 860, 12);

        lblInbox.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblInbox.setText("Inbox");
        getContentPane().add(lblInbox);
        lblInbox.setBounds(420, 110, 90, 30);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(260, 390, 12, 430);

        lblNacimiento.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblNacimiento.setText("Nacimiento:");
        getContentPane().add(lblNacimiento);
        lblNacimiento.setBounds(10, 680, 230, 20);

        lblFotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil_defecto.png"))); // NOI18N
        getContentPane().add(lblFotoPerfil);
        lblFotoPerfil.setBounds(60, 450, 130, 130);

        lblInformacion.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 24)); // NOI18N
        lblInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/business-card-of-a-man-with-contact-info.png"))); // NOI18N
        lblInformacion.setText("Profesional");
        getContentPane().add(lblInformacion);
        lblInformacion.setBounds(50, 390, 230, 40);

        lblNombre.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblNombre.setText("Nombre:");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(10, 600, 230, 17);

        lblApellido.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblApellido.setText("Apellidos:");
        getContentPane().add(lblApellido);
        lblApellido.setBounds(10, 640, 230, 20);

        lblNacionalidad.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblNacionalidad.setText("Nacionalidad:");
        getContentPane().add(lblNacionalidad);
        lblNacionalidad.setBounds(10, 720, 230, 20);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(10, 430, 250, 12);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(280, 430, 610, 20);

        lblConsulta.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 27)); // NOI18N
        lblConsulta.setText("Visualización");
        lblConsulta.setToolTipText("");
        getContentPane().add(lblConsulta);
        lblConsulta.setBounds(500, 390, 190, 50);

        txtConsulta.setEditable(false);
        txtConsulta.setColumns(20);
        txtConsulta.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtConsulta.setForeground(new java.awt.Color(0, 102, 255));
        txtConsulta.setRows(5);
        jScrollPane2.setViewportView(txtConsulta);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(280, 440, 610, 230);

        txtMensaje.setColumns(20);
        txtMensaje.setRows(5);
        txtMensaje.setEnabled(false);
        txtMensaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMensajeKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(txtMensaje);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(280, 700, 610, 84);

        btnEnviar.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.setEnabled(false);
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar);
        btnEnviar.setBounds(800, 790, 90, 40);

        lstInbox.setModel(new javax.swing.AbstractListModel<Object>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstInbox.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstInbox.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstInboxValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(lstInbox);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(20, 140, 860, 210);

        lblResponder.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblResponder.setText("Mensaje:");
        getContentPane().add(lblResponder);
        lblResponder.setBounds(280, 680, 100, 24);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        VentanaPanelUsuario ventana = new VentanaPanelUsuario(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        VentanaPanelUsuario ventana = new VentanaPanelUsuario(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void rbtnPlanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnPlanesActionPerformed
        listaActual = modelo.filtrarPorPlan(usuarioActivo.getConsultas());
        this.lstInbox.setListData(modelo.consultasPorDescripcion(listaActual).toArray());
    }//GEN-LAST:event_rbtnPlanesActionPerformed

    private void rbtnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnConsultasActionPerformed
        listaActual = modelo.filtrarPorDirecta(usuarioActivo.getConsultas());
        this.lstInbox.setListData(modelo.consultasPorDescripcion(listaActual).toArray());
    }//GEN-LAST:event_rbtnConsultasActionPerformed

    private void lstInboxValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstInboxValueChanged
        if (!evt.getValueIsAdjusting()) {
            this.btnEnviar.setEnabled(false);
            this.txtMensaje.setText("");
            int index = this.lstInbox.getSelectedIndex();
            if (index >= 0 && !listaActual.isEmpty()) {
                Consulta consulta = listaActual.get(index);
                this.txtConsulta.setText(consulta.toString());
                if (consulta.getEstado() != Estado.COMPLETADO) {
                    this.txtMensaje.setEnabled(true);
                } else {
                    this.txtMensaje.setEnabled(false);
                    this.txtMensaje.setText("La consulta ha finalizado.");
                }
            } else {
                this.txtMensaje.setEnabled(false);
                this.btnEnviar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_lstInboxValueChanged

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
        int index = this.lstInbox.getSelectedIndex();
        Consulta consultaUsuario = listaActual.get(index);
        consultaUsuario.agregarIncidencia(this.txtMensaje.getText(), dateFormat.format(date), usuarioActivo);
        this.txtConsulta.setText(consultaUsuario.toString());
        this.txtMensaje.setText("");
        this.btnEnviar.setEnabled(false);
    }//GEN-LAST:event_btnEnviarActionPerformed

    public void agregaBotonesAlGrupo() {
        btnGroup.add(this.rbtnConsultas);
        btnGroup.add(this.rbtnPlanes);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblConsulta;
    private javax.swing.JLabel lblFotoPerfil;
    private javax.swing.JLabel lblInbox;
    private javax.swing.JLabel lblInformacion;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblResponder;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<Object> lstInbox;
    private javax.swing.JRadioButton rbtnConsultas;
    private javax.swing.JRadioButton rbtnPlanes;
    private javax.swing.JTextArea txtConsulta;
    private javax.swing.JTextArea txtMensaje;
    // End of variables declaration//GEN-END:variables
}

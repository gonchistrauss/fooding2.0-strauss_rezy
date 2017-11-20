package interfaz;

import dominio.Profesional;
import dominio.Sistema;
import javax.swing.ImageIcon;

public class VentanaPanelProfesional extends javax.swing.JDialog {

    private Sistema modelo;
    private Profesional profesionalActivo;

    public VentanaPanelProfesional(Sistema miSis) {
        initComponents();
        modelo = miSis;
        this.setModal(true);
        this.setLocationRelativeTo(null);
        profesionalActivo = modelo.obtenerSesionActivaProfesional();
        this.lblNombreProfesional.setText(profesionalActivo.getNombre() + " " + profesionalActivo.getApellidos());
        if (!profesionalActivo.getPathPerfil().equals("/imagenes/perfil_defecto.png")) {
            this.lblFotoPerfil.setIcon(new ImageIcon(profesionalActivo.getPathPerfil()));
        }
        this.lblPlanesPendientes.setText(profesionalActivo.getTituloProfesional());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBBienvenido = new javax.swing.JLabel();
        lblNombreProfesional = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblFotoPerfil = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblNacionalidad = new javax.swing.JLabel();
        lblPlanesPendientes = new javax.swing.JLabel();
        lblConsultasPendientes = new javax.swing.JLabel();
        lblDeseo = new javax.swing.JLabel();
        btnInbox = new javax.swing.JButton();
        btnConsultas = new javax.swing.JButton();
        btnPlanes = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(502, 446));
        setPreferredSize(new java.awt.Dimension(502, 446));
        setResizable(false);
        setSize(new java.awt.Dimension(502, 446));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        lblBBienvenido.setFont(new java.awt.Font("Seravek", 1, 27)); // NOI18N
        lblBBienvenido.setText("Bienvenido, ");
        getContentPane().add(lblBBienvenido);
        lblBBienvenido.setBounds(70, 10, 170, 30);

        lblNombreProfesional.setFont(new java.awt.Font("Seravek", 1, 24)); // NOI18N
        lblNombreProfesional.setForeground(new java.awt.Color(0, 204, 0));
        lblNombreProfesional.setText("Gonzalo Strauss");
        getContentPane().add(lblNombreProfesional);
        lblNombreProfesional.setBounds(220, 10, 270, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(30, 50, 450, 12);

        lblFotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil_defecto.png"))); // NOI18N
        getContentPane().add(lblFotoPerfil);
        lblFotoPerfil.setBounds(30, 80, 130, 130);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(170, 70, 10, 290);

        lblNacionalidad.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblNacionalidad.setForeground(new java.awt.Color(255, 153, 0));
        lblNacionalidad.setText("xxx");
        getContentPane().add(lblNacionalidad);
        lblNacionalidad.setBounds(30, 230, 130, 20);

        lblPlanesPendientes.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblPlanesPendientes.setForeground(new java.awt.Color(255, 153, 0));
        lblPlanesPendientes.setText("yyy");
        getContentPane().add(lblPlanesPendientes);
        lblPlanesPendientes.setBounds(31, 260, 130, 16);

        lblConsultasPendientes.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblConsultasPendientes.setForeground(new java.awt.Color(255, 153, 0));
        lblConsultasPendientes.setText("zzz");
        getContentPane().add(lblConsultasPendientes);
        lblConsultasPendientes.setBounds(31, 290, 130, 16);

        lblDeseo.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblDeseo.setText("Que deseas hacer?");
        getContentPane().add(lblDeseo);
        lblDeseo.setBounds(250, 70, 180, 30);

        btnInbox.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        btnInbox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inbox.png"))); // NOI18N
        btnInbox.setText("Inbox");
        btnInbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInboxActionPerformed(evt);
            }
        });
        getContentPane().add(btnInbox);
        btnInbox.setBounds(220, 110, 220, 40);

        btnConsultas.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/seo.png"))); // NOI18N
        btnConsultas.setText("Mis consultas");
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultas);
        btnConsultas.setBounds(220, 180, 220, 40);

        btnPlanes.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnPlanes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/planning.png"))); // NOI18N
        btnPlanes.setText("Mis planes");
        btnPlanes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanesActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlanes);
        btnPlanes.setBounds(220, 250, 220, 40);

        btnSalir.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sign-out-option.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(220, 320, 220, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.profesionalActivo.setSesionActiva(false);
        this.dispose();
        MenuPrincipal ventana = new MenuPrincipal(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.profesionalActivo.setSesionActiva(false);
        this.dispose();
        MenuPrincipal ventana = new MenuPrincipal(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnInboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInboxActionPerformed
        this.dispose();
        VentanaInbox ventana = new VentanaInbox(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnInboxActionPerformed

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        this.dispose();
        VentanaConsultasProfesional ventana = new VentanaConsultasProfesional(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnConsultasActionPerformed

    private void btnPlanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanesActionPerformed
        this.dispose();
        VentanaPlanesProfesional ventana = new VentanaPlanesProfesional(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnPlanesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnInbox;
    private javax.swing.JButton btnPlanes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBBienvenido;
    private javax.swing.JLabel lblConsultasPendientes;
    private javax.swing.JLabel lblDeseo;
    private javax.swing.JLabel lblFotoPerfil;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombreProfesional;
    private javax.swing.JLabel lblPlanesPendientes;
    // End of variables declaration//GEN-END:variables
}

package interfaz;

import dominio.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class VentanaPanelUsuario extends javax.swing.JDialog {

    private Sistema modelo;
    private Usuario usuarioActivo;

    public VentanaPanelUsuario(Sistema miSis) {
        initComponents();
        modelo = miSis;
        this.setModal(true);
        this.setLocationRelativeTo(null);
        usuarioActivo = modelo.obtenerSesionActivaUsuario();
        this.lblNombreUsuario.setText(usuarioActivo.getNombre() + " " + usuarioActivo.getApellidos());
        if (!usuarioActivo.getPathPerfil().equals("/imagenes/perfil_defecto.png")) {
            this.lblFotoPerfil.setIcon(new ImageIcon(usuarioActivo.getPathPerfil()));
        }
        this.lblPais.setText(usuarioActivo.getNacionalidad().getCountry());
        DateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        this.lblNacimiento.setText(date.format(usuarioActivo.getFechaDeNacimiento()));
        this.lblConsultas.setText("Consultas: " + usuarioActivo.getConsultas().size());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConsultaDirecta = new javax.swing.JButton();
        btnIngesta = new javax.swing.JButton();
        btnConsultas = new javax.swing.JButton();
        lblBBienvenido = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lblDeseo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblNombreUsuario = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblFotoPerfil = new javax.swing.JLabel();
        lblPais = new javax.swing.JLabel();
        lblNacimiento = new javax.swing.JLabel();
        lblConsultas = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Panel de usuario");
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

        btnConsultaDirecta.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        btnConsultaDirecta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/list.png"))); // NOI18N
        btnConsultaDirecta.setText("Consulta / Plan");
        btnConsultaDirecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaDirectaActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultaDirecta);
        btnConsultaDirecta.setBounds(220, 110, 220, 40);

        btnIngesta.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnIngesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendar.png"))); // NOI18N
        btnIngesta.setText("Ingesta diaria");
        btnIngesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngestaActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngesta);
        btnIngesta.setBounds(220, 180, 220, 40);

        btnConsultas.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/planning.png"))); // NOI18N
        btnConsultas.setText("Mis consultas / planes");
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultas);
        btnConsultas.setBounds(220, 250, 220, 40);

        lblBBienvenido.setFont(new java.awt.Font("Seravek", 1, 27)); // NOI18N
        lblBBienvenido.setText("Bienvenido, ");
        getContentPane().add(lblBBienvenido);
        lblBBienvenido.setBounds(70, 10, 170, 30);

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

        lblDeseo.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblDeseo.setText("Que deseas hacer?");
        getContentPane().add(lblDeseo);
        lblDeseo.setBounds(250, 70, 180, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(30, 50, 450, 12);

        lblNombreUsuario.setFont(new java.awt.Font("Seravek", 1, 24)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(0, 204, 0));
        lblNombreUsuario.setText("Gonzalo Strauss");
        getContentPane().add(lblNombreUsuario);
        lblNombreUsuario.setBounds(220, 10, 270, 30);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(170, 70, 10, 290);

        lblFotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil_defecto.png"))); // NOI18N
        getContentPane().add(lblFotoPerfil);
        lblFotoPerfil.setBounds(30, 80, 130, 130);

        lblPais.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblPais.setForeground(new java.awt.Color(0, 153, 255));
        lblPais.setText("xxx");
        getContentPane().add(lblPais);
        lblPais.setBounds(30, 230, 130, 20);

        lblNacimiento.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblNacimiento.setForeground(new java.awt.Color(0, 153, 255));
        lblNacimiento.setText("yyy");
        getContentPane().add(lblNacimiento);
        lblNacimiento.setBounds(31, 260, 130, 16);

        lblConsultas.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblConsultas.setForeground(new java.awt.Color(0, 153, 255));
        lblConsultas.setText("zzz");
        getContentPane().add(lblConsultas);
        lblConsultas.setBounds(31, 290, 130, 16);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wall_raro.jpg"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(-360, 0, 900, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.usuarioActivo.setSesionActiva(false);
        this.dispose();
        MenuPrincipal ventana = new MenuPrincipal(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.usuarioActivo.setSesionActiva(false);
        this.dispose();
        MenuPrincipal ventana = new MenuPrincipal(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnConsultaDirectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaDirectaActionPerformed
        this.dispose();
        VentanaConsulta ventana = new VentanaConsulta(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnConsultaDirectaActionPerformed

    private void btnIngestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngestaActionPerformed
        this.dispose();
        VentanaIngesta ventana = new VentanaIngesta(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnIngestaActionPerformed

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        this.dispose();
        VentanaConsultasPlanesUsuario ventana = new VentanaConsultasPlanesUsuario(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnConsultasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultaDirecta;
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnIngesta;
    private javax.swing.JButton btnSalir;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBBienvenido;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblConsultas;
    private javax.swing.JLabel lblDeseo;
    private javax.swing.JLabel lblFotoPerfil;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblPais;
    // End of variables declaration//GEN-END:variables
}

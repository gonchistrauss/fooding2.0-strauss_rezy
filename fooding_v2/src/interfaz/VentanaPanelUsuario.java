package interfaz;

import dominio.*;

public class VentanaPanelUsuario extends javax.swing.JDialog {

    private Sistema modelo;
    private Usuario usuarioActivo;

    public VentanaPanelUsuario(Sistema miSis) {
        initComponents();
        modelo = miSis;
        this.setModal(true);
        this.setLocationRelativeTo(null);
        usuarioActivo = modelo.obtenerSesionActivaUsuario();
        System.out.println(usuarioActivo.toString());
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

        btnConsultaDirecta.setText("Consulta / Plan");
        getContentPane().add(btnConsultaDirecta);
        btnConsultaDirecta.setBounds(240, 130, 180, 40);

        btnIngesta.setText("Ingesta diaria");
        getContentPane().add(btnIngesta);
        btnIngesta.setBounds(240, 200, 180, 40);

        btnConsultas.setText("Mis consultas / planes");
        getContentPane().add(btnConsultas);
        btnConsultas.setBounds(240, 270, 180, 40);

        lblBBienvenido.setFont(new java.awt.Font("Seravek", 1, 27)); // NOI18N
        lblBBienvenido.setText("Bienvenido, ");
        getContentPane().add(lblBBienvenido);
        lblBBienvenido.setBounds(50, 10, 170, 30);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(240, 340, 180, 40);

        lblDeseo.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblDeseo.setText("Que deseas hacer?");
        getContentPane().add(lblDeseo);
        lblDeseo.setBounds(250, 70, 180, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 50, 470, 10);

        lblNombreUsuario.setFont(new java.awt.Font("Seravek", 1, 24)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(0, 204, 0));
        lblNombreUsuario.setText("Gonzalo Strauss");
        getContentPane().add(lblNombreUsuario);
        lblNombreUsuario.setBounds(220, 10, 270, 30);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(160, 70, 10, 340);

        lblFotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil_defecto.png"))); // NOI18N
        getContentPane().add(lblFotoPerfil);
        lblFotoPerfil.setBounds(20, 80, 130, 130);

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultaDirecta;
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnIngesta;
    private javax.swing.JButton btnSalir;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBBienvenido;
    private javax.swing.JLabel lblDeseo;
    private javax.swing.JLabel lblFotoPerfil;
    private javax.swing.JLabel lblNombreUsuario;
    // End of variables declaration//GEN-END:variables
}

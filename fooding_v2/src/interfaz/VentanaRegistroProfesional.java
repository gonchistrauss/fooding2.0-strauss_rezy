package interfaz;

import dominio.Sistema;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import utils.*;

public class VentanaRegistroProfesional extends javax.swing.JDialog {

    private Sistema modelo;
    private FileNameExtensionFilter filter;
    private ImageIcon perfil;
    private String profilePath;

    public VentanaRegistroProfesional(Sistema miSis) {
        initComponents();
        this.setModal(true);
        this.setLocationRelativeTo(null);
        modelo = miSis;
        this.comboPaises.setModel(new DefaultComboBoxModel(Herramientas.obtenerpaises()));
        this.dateFechaGraduacion.setDateFormatString("dd/MM/yyyy");
        this.dateNacimiento.setDateFormatString("dd/MM/yyyy");
        profilePath = "/imagenes/perfil_defecto.png";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        separador1 = new javax.swing.JSeparator();
        lblTitulo = new javax.swing.JLabel();
        lblFotoPerfil = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtCampoNombre = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        btnImportar = new javax.swing.JButton();
        lblNacimiento = new javax.swing.JLabel();
        dateNacimiento = new com.toedter.calendar.JDateChooser();
        lblProfesionales = new javax.swing.JLabel();
        separador2 = new javax.swing.JSeparator();
        lblPersonales = new javax.swing.JLabel();
        lblTituloProfesional = new javax.swing.JLabel();
        txtTituloProfesional = new javax.swing.JTextField();
        lblGraduacion = new javax.swing.JLabel();
        dateFechaGraduacion = new com.toedter.calendar.JDateChooser();
        lblPais = new javax.swing.JLabel();
        comboPaises = new javax.swing.JComboBox<>();
        btnRegistroProfesional = new javax.swing.JButton();
        separador3 = new javax.swing.JSeparator();
        lblFotoProfesional = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de profesional");
        setMinimumSize(new java.awt.Dimension(647, 541));
        setPreferredSize(new java.awt.Dimension(647, 541));
        setResizable(false);
        setSize(new java.awt.Dimension(647, 541));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(separador1);
        separador1.setBounds(10, 50, 600, 12);

        lblTitulo.setFont(new java.awt.Font("Seravek", 1, 27)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/id-card (1).png"))); // NOI18N
        lblTitulo.setText("Registro de profesional");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(170, 0, 320, 64);

        lblFotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil_defecto.png"))); // NOI18N
        getContentPane().add(lblFotoPerfil);
        lblFotoPerfil.setBounds(30, 90, 130, 130);

        lblNombre.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/man-user.png"))); // NOI18N
        lblNombre.setText("Nombre:");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(170, 100, 90, 24);
        getContentPane().add(txtCampoNombre);
        txtCampoNombre.setBounds(290, 90, 270, 40);

        lblApellido.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblApellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/man-user.png"))); // NOI18N
        lblApellido.setText("Apellido:");
        getContentPane().add(lblApellido);
        lblApellido.setBounds(170, 160, 90, 24);
        getContentPane().add(txtApellido);
        txtApellido.setBounds(290, 150, 270, 40);

        btnImportar.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        btnImportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/export.png"))); // NOI18N
        btnImportar.setText("Importar");
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });
        getContentPane().add(btnImportar);
        btnImportar.setBounds(30, 210, 130, 28);

        lblNacimiento.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblNacimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendar-page-empty.png"))); // NOI18N
        lblNacimiento.setText("Nacimiento:");
        getContentPane().add(lblNacimiento);
        lblNacimiento.setBounds(170, 220, 120, 24);

        dateNacimiento.setOpaque(false);
        getContentPane().add(dateNacimiento);
        dateNacimiento.setBounds(290, 210, 270, 40);

        lblProfesionales.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblProfesionales.setText("Datos profesionales:");
        getContentPane().add(lblProfesionales);
        lblProfesionales.setBounds(270, 280, 160, 17);
        getContentPane().add(separador2);
        separador2.setBounds(20, 270, 590, 10);

        lblPersonales.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblPersonales.setText("Datos personales:");
        getContentPane().add(lblPersonales);
        lblPersonales.setBounds(260, 60, 130, 17);

        lblTituloProfesional.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblTituloProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/diploma.png"))); // NOI18N
        lblTituloProfesional.setText("Titulo:");
        getContentPane().add(lblTituloProfesional);
        lblTituloProfesional.setBounds(170, 310, 90, 24);
        getContentPane().add(txtTituloProfesional);
        txtTituloProfesional.setBounds(290, 300, 270, 40);

        lblGraduacion.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblGraduacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/graduation-hat-and-diploma.png"))); // NOI18N
        lblGraduacion.setText("Graduacion:");
        getContentPane().add(lblGraduacion);
        lblGraduacion.setBounds(170, 370, 120, 24);

        dateFechaGraduacion.setOpaque(false);
        getContentPane().add(dateFechaGraduacion);
        dateFechaGraduacion.setBounds(290, 360, 270, 40);

        lblPais.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblPais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/international-delivery.png"))); // NOI18N
        lblPais.setText("País:");
        getContentPane().add(lblPais);
        lblPais.setBounds(170, 420, 80, 24);

        comboPaises.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        getContentPane().add(comboPaises);
        comboPaises.setBounds(290, 410, 270, 40);

        btnRegistroProfesional.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnRegistroProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/businessman.png"))); // NOI18N
        btnRegistroProfesional.setText("Registrar");
        btnRegistroProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroProfesionalActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistroProfesional);
        btnRegistroProfesional.setBounds(250, 460, 190, 50);
        getContentPane().add(separador3);
        separador3.setBounds(20, 450, 610, 12);

        lblFotoProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/magnifying-lens-as-head-of-business-professional (1).png"))); // NOI18N
        getContentPane().add(lblFotoProfesional);
        lblFotoProfesional.setBounds(30, 280, 130, 160);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chainimage-free-foods-and-drinks-powerpoint-backgroundswallpapers-download-ppt.jpg"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(-20, -410, 790, 980);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(filter);
        int opcion = chooser.showOpenDialog(this);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            ImageIcon icono = new ImageIcon(chooser.getSelectedFile().getAbsolutePath());
            perfil = icono;
            lblFotoPerfil.setIcon(perfil);
            profilePath = chooser.getSelectedFile().getAbsolutePath();
        }
    }//GEN-LAST:event_btnImportarActionPerformed

    private void btnRegistroProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroProfesionalActionPerformed
        if (datosVerificados()) {
            modelo.agregarProfesional(txtCampoNombre.getText(), this.txtApellido.getText(), this.dateNacimiento.getDate(), profilePath, this.txtTituloProfesional.getText(), this.comboPaises.getSelectedItem().toString(), this.dateFechaGraduacion.getDate());
            JOptionPane.showMessageDialog(null, "Profesional registrado exitosamente.", "Mensaje", 0, new ImageIcon(getClass().getResource("/imagenes/businessman.png")));
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnRegistroProfesionalActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MenuPrincipal ventana = new MenuPrincipal(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private boolean datosVerificados() {
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImportar;
    private javax.swing.JButton btnRegistroProfesional;
    private javax.swing.JComboBox<String> comboPaises;
    private com.toedter.calendar.JDateChooser dateFechaGraduacion;
    private com.toedter.calendar.JDateChooser dateNacimiento;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblFotoPerfil;
    private javax.swing.JLabel lblFotoProfesional;
    private javax.swing.JLabel lblGraduacion;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblPersonales;
    private javax.swing.JLabel lblProfesionales;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloProfesional;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JSeparator separador3;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCampoNombre;
    private javax.swing.JTextField txtTituloProfesional;
    // End of variables declaration//GEN-END:variables
}

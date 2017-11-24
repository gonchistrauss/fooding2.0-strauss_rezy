package interfaz;

import dominio.Alimento;
import dominio.Sistema;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import utils.*;

public class VentanaRegistroUsuario extends javax.swing.JDialog {

    private Sistema modelo;
    private FileNameExtensionFilter filter;
    private ImageIcon perfil;
    private String profilePath;
    private ArrayList<Alimento> preferencias;
    private ArrayList<Alimento> restricciones;

    public VentanaRegistroUsuario(Sistema miSis) {
        initComponents();
        this.setModal(true);
        this.setLocationRelativeTo(null);
        modelo = miSis;
        this.comboPaises.setModel(new DefaultComboBoxModel(utils.Herramientas.obtenerpaises()));
        dateNacimiento.setDateFormatString("dd/MM/yyyy");
        perfil = new ImageIcon(getClass().getResource("/imagenes/avatar.png"));
        profilePath = "/imagenes/perfil_defecto.png";
        preferencias = new ArrayList<>();
        restricciones = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        btnPreferencias = new javax.swing.JButton();
        lblPref_res = new javax.swing.JLabel();
        btnRegistroUsuario = new javax.swing.JButton();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblFotoPerfil = new javax.swing.JLabel();
        btnImportar = new javax.swing.JButton();
        lblNacimiento = new javax.swing.JLabel();
        dateNacimiento = new com.toedter.calendar.JDateChooser();
        lblPais = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        comboPaises = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JButton();
        lblStatusNombre = new javax.swing.JLabel();
        lblOkNombre = new javax.swing.JLabel();
        lblStatusApellido = new javax.swing.JLabel();
        lblOkApellido = new javax.swing.JLabel();
        lblStatusNacimiento = new javax.swing.JLabel();
        lblOkNacimiento = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de usuario");
        setMinimumSize(new java.awt.Dimension(638, 458));
        setPreferredSize(new java.awt.Dimension(638, 458));
        setResizable(false);
        setSize(new java.awt.Dimension(638, 458));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Seravek", 1, 27)); // NOI18N
        lblTitulo.setText("Registro de Usuario");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(210, 10, 250, 34);

        lblNombre.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/man-user.png"))); // NOI18N
        lblNombre.setText("Nombre:");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(170, 70, 90, 24);

        lblApellido.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblApellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/man-user.png"))); // NOI18N
        lblApellido.setText("Apellido:");
        getContentPane().add(lblApellido);
        lblApellido.setBounds(170, 130, 90, 24);

        btnPreferencias.setText("Agregar");
        btnPreferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreferenciasActionPerformed(evt);
            }
        });
        getContentPane().add(btnPreferencias);
        btnPreferencias.setBounds(420, 280, 140, 40);

        lblPref_res.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblPref_res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/adjust-button-with-plus-and-minus.png"))); // NOI18N
        lblPref_res.setText("Preferencias y/o restricciones");
        getContentPane().add(lblPref_res);
        lblPref_res.setBounds(170, 290, 260, 24);

        btnRegistroUsuario.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnRegistroUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add-a-contact-on-phone-interface-symbol-of-a-user-with-a-plus-sign.png"))); // NOI18N
        btnRegistroUsuario.setText("Registrar");
        btnRegistroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistroUsuario);
        btnRegistroUsuario.setBounds(250, 340, 190, 50);

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoKeyReleased(evt);
            }
        });
        getContentPane().add(txtApellido);
        txtApellido.setBounds(290, 120, 270, 40);

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        getContentPane().add(txtNombre);
        txtNombre.setBounds(290, 60, 270, 40);

        lblFotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil_defecto.png"))); // NOI18N
        getContentPane().add(lblFotoPerfil);
        lblFotoPerfil.setBounds(30, 60, 130, 130);

        btnImportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/export.png"))); // NOI18N
        btnImportar.setText("Importar");
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });
        getContentPane().add(btnImportar);
        btnImportar.setBounds(30, 186, 130, 28);

        lblNacimiento.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblNacimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendar-page-empty.png"))); // NOI18N
        lblNacimiento.setText("Nacimiento");
        getContentPane().add(lblNacimiento);
        lblNacimiento.setBounds(170, 190, 120, 24);

        dateNacimiento.setOpaque(false);
        getContentPane().add(dateNacimiento);
        dateNacimiento.setBounds(290, 180, 270, 40);

        lblPais.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblPais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/international-delivery.png"))); // NOI18N
        lblPais.setText("País");
        getContentPane().add(lblPais);
        lblPais.setBounds(170, 240, 80, 24);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 50, 600, 12);

        comboPaises.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        getContentPane().add(comboPaises);
        comboPaises.setBounds(290, 230, 270, 40);

        btnVolver.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/left-arrow.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver);
        btnVolver.setBounds(10, 380, 97, 50);

        lblStatusNombre.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblStatusNombre.setForeground(new java.awt.Color(255, 51, 51));
        lblStatusNombre.setText(" ");
        lblStatusNombre.setToolTipText("");
        getContentPane().add(lblStatusNombre);
        lblStatusNombre.setBounds(300, 100, 250, 16);

        lblOkNombre.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        getContentPane().add(lblOkNombre);
        lblOkNombre.setBounds(560, 70, 60, 24);

        lblStatusApellido.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblStatusApellido.setForeground(new java.awt.Color(255, 51, 51));
        lblStatusApellido.setText(" ");
        getContentPane().add(lblStatusApellido);
        lblStatusApellido.setBounds(300, 160, 250, 16);

        lblOkApellido.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        getContentPane().add(lblOkApellido);
        lblOkApellido.setBounds(560, 130, 60, 20);

        lblStatusNacimiento.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblStatusNacimiento.setForeground(new java.awt.Color(255, 51, 51));
        lblStatusNacimiento.setText(" ");
        getContentPane().add(lblStatusNacimiento);
        lblStatusNacimiento.setBounds(300, 220, 240, 16);

        lblOkNacimiento.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        getContentPane().add(lblOkNacimiento);
        lblOkNacimiento.setBounds(560, 190, 60, 20);

        lblBackground.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblBackground.setForeground(new java.awt.Color(255, 51, 51));
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chainimage-free-foods-and-drinks-powerpoint-backgroundswallpapers-download-ppt.jpg"))); // NOI18N
        lblBackground.setText(" ");
        getContentPane().add(lblBackground);
        lblBackground.setBounds(-110, -430, 770, 920);

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

    private void btnRegistroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroUsuarioActionPerformed
        modelo.agregarUsuario(this.txtNombre.getText(), this.txtApellido.getText(), this.comboPaises.getSelectedItem().toString(), this.dateNacimiento.getDate(), profilePath);
        if(!preferencias.isEmpty()){modelo.getListaUsuarios().get(modelo.getListaUsuarios().size() - 1).agregarPreferencia(preferencias);}
        if(!restricciones.isEmpty()){modelo.getListaUsuarios().get(modelo.getListaUsuarios().size() - 1).agregarRestriccion(restricciones);}
        JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente.", "Mensaje", 0, new ImageIcon(getClass().getResource("/imagenes/businessman.png")));
        this.setVisible(false);
        MenuPrincipal ventana = new MenuPrincipal(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnRegistroUsuarioActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MenuPrincipal ventana = new MenuPrincipal(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        MenuPrincipal ventana = new MenuPrincipal(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        Herramientas.validarCampo(this.txtNombre, this.lblStatusNombre, this.lblOkNombre, "nombre");
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyReleased
        Herramientas.validarCampo(this.txtApellido, this.lblStatusApellido, this.lblOkApellido, "apellido");
    }//GEN-LAST:event_txtApellidoKeyReleased

    private void btnPreferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreferenciasActionPerformed
        VentanaPreferenciasRestricciones ventana = new VentanaPreferenciasRestricciones(modelo,preferencias,restricciones);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnPreferenciasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImportar;
    private javax.swing.JButton btnPreferencias;
    private javax.swing.JButton btnRegistroUsuario;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> comboPaises;
    private com.toedter.calendar.JDateChooser dateNacimiento;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblFotoPerfil;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblOkApellido;
    private javax.swing.JLabel lblOkNacimiento;
    private javax.swing.JLabel lblOkNombre;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblPref_res;
    private javax.swing.JLabel lblStatusApellido;
    private javax.swing.JLabel lblStatusNacimiento;
    private javax.swing.JLabel lblStatusNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

package interfaz;

import dominio.Sistema;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import utils.*;

public class VentanaRegistroUsuario extends javax.swing.JDialog {

    private Sistema modelo;
    private FileNameExtensionFilter filter;
    private ImageIcon perfil;

    public VentanaRegistroUsuario(Sistema miSis) {
        initComponents();
        this.setModal(true);
        this.setLocationRelativeTo(null);
        modelo = miSis;
        this.comboPaises.setModel(new DefaultComboBoxModel(utils.Herramientas.obtenerpaises()));
        dateNacimiento.setDateFormatString("dd/MM/yyyy");
        perfil = new ImageIcon(getClass().getResource("/imagenes/avatar.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
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
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Regisdtro de usuario");
        setMinimumSize(new java.awt.Dimension(638, 458));
        setPreferredSize(new java.awt.Dimension(638, 458));
        setResizable(false);
        setSize(new java.awt.Dimension(638, 458));
        getContentPane().setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Seravek", 1, 27)); // NOI18N
        lblTitulo.setText("Registro de Usuario");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(210, 10, 250, 34);

        jLabel1.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/man-user.png"))); // NOI18N
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 70, 90, 24);

        lblApellido.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblApellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/man-user.png"))); // NOI18N
        lblApellido.setText("Apellido:");
        getContentPane().add(lblApellido);
        lblApellido.setBounds(170, 130, 90, 24);

        btnPreferencias.setText("Agregar");
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
        getContentPane().add(btnRegistroUsuario);
        btnRegistroUsuario.setBounds(250, 340, 190, 50);
        btnRegistroUsuario.getAccessibleContext().setAccessibleName("Registrar");

        getContentPane().add(txtApellido);
        txtApellido.setBounds(290, 120, 270, 40);
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

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chainimage-free-foods-and-drinks-powerpoint-backgroundswallpapers-download-ppt.jpg"))); // NOI18N
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
        }
    }//GEN-LAST:event_btnImportarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImportar;
    private javax.swing.JButton btnPreferencias;
    private javax.swing.JButton btnRegistroUsuario;
    private javax.swing.JComboBox<String> comboPaises;
    private com.toedter.calendar.JDateChooser dateNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblFotoPerfil;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblPref_res;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

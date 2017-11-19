package interfaz;

import dominio.Sistema;
import dominio.Usuario;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import utils.Tipos;

public class VentanaConsulta extends javax.swing.JDialog {

    private Sistema modelo;
    private Usuario usuarioActivo;

    public VentanaConsulta(Sistema miSis) {
        initComponents();
        modelo = miSis;
        this.setModal(true);
        this.setLocationRelativeTo(null);
        usuarioActivo = modelo.obtenerSesionActivaUsuario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblEleccion = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnEnviar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMensaje = new javax.swing.JTextArea();
        lblMensaje = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultas y planes de alimentacion");
        setMinimumSize(new java.awt.Dimension(476, 401));
        setSize(new java.awt.Dimension(476, 401));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Seravek", 1, 27)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consulting.png"))); // NOI18N
        lblTitulo.setText("Consulta / Plan de Alimentacion");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(20, 10, 450, 40);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(30, 60, 430, 20);

        lblEleccion.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblEleccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/question-mark.png"))); // NOI18N
        lblEleccion.setText("Que desea realizar?");
        getContentPane().add(lblEleccion);
        lblEleccion.setBounds(30, 70, 180, 40);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consulta directa", "Plan de alimentacion" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(210, 70, 260, 40);

        btnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon.png"))); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.setEnabled(false);
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar);
        btnEnviar.setBounds(340, 330, 90, 40);

        txtMensaje.setColumns(20);
        txtMensaje.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        txtMensaje.setRows(5);
        txtMensaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMensajeKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtMensaje);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 160, 380, 170);

        lblMensaje.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblMensaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close-envelope.png"))); // NOI18N
        lblMensaje.setText("Mensaje:");
        getContentPane().add(lblMensaje);
        lblMensaje.setBounds(50, 134, 120, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(30, 110, 430, 12);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wall_blue.png"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(-5, -4, 500, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        VentanaPanelUsuario ventana = new VentanaPanelUsuario(modelo);
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
        if (this.jComboBox1.getSelectedIndex() == 0) {
            usuarioActivo.agregarConsulta(Tipos.Categoria.DIRECTA, this.txtMensaje.getText());
            JOptionPane.showMessageDialog(null, "Consulta enviada exitosamente.", "Mensaje", 0, new ImageIcon(getClass().getResource("/imagenes/send.png")));
            this.dispose();
            VentanaPanelUsuario ventana = new VentanaPanelUsuario(modelo);
            ventana.setVisible(true);
        } else {
            usuarioActivo.agregarConsulta(Tipos.Categoria.PLAN_ALIMENTICIO, this.txtMensaje.getText());
            JOptionPane.showMessageDialog(null, "Plan alimenticio solicitado exitosamente.", "Mensaje", 0, new ImageIcon(getClass().getResource("/imagenes/send.png")));
            this.dispose();
            VentanaPanelUsuario ventana = new VentanaPanelUsuario(modelo);
            ventana.setVisible(true);
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblEleccion;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtMensaje;
    // End of variables declaration//GEN-END:variables
}

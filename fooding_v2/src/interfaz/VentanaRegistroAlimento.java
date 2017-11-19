package interfaz;

import dominio.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import utils.Herramientas;

public class VentanaRegistroAlimento extends javax.swing.JDialog {

    private Sistema modelo;
    private HashMap<String, Integer> nutrientes;
    private ArrayList<String> listaNutrientes;

    public VentanaRegistroAlimento(Sistema miSis) {
        initComponents();
        modelo = miSis;
        this.setModal(true);
        this.setLocationRelativeTo(null);
        nutrientes = new HashMap<>();
        listaNutrientes = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        lblNutrientes = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lblNombreNutriente = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstNutrientes = new javax.swing.JList<>();
        txtNutriente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtProporcion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(480, 502));
        setPreferredSize(new java.awt.Dimension(480, 502));
        setResizable(false);
        setSize(new java.awt.Dimension(480, 502));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Seravek", 1, 27)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/organic.png"))); // NOI18N
        lblTitulo.setText("Registro de alimento:");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(110, 10, 310, 34);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 40, 430, 12);

        lblNombre.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblNombre.setText("Alimento:");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(20, 70, 90, 24);

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        getContentPane().add(txtNombre);
        txtNombre.setBounds(150, 60, 250, 40);

        lblCategoria.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblCategoria.setText("Categoria:");
        getContentPane().add(lblCategoria);
        lblCategoria.setBounds(20, 130, 170, 24);

        txtCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCategoriaKeyReleased(evt);
            }
        });
        getContentPane().add(txtCategoria);
        txtCategoria.setBounds(150, 120, 250, 40);

        lblNutrientes.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblNutrientes.setText("Nutrientes del alimento:");
        getContentPane().add(lblNutrientes);
        lblNutrientes.setBounds(150, 200, 200, 24);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus.png"))); // NOI18N
        btnAgregar.setEnabled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar);
        btnAgregar.setBounds(180, 300, 80, 40);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(20, 190, 430, 12);

        lblNombreNutriente.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblNombreNutriente.setText("Nutriente:");
        getContentPane().add(lblNombreNutriente);
        lblNombreNutriente.setBounds(50, 230, 110, 24);

        btnRegistro.setText("Registrar Alimento");
        btnRegistro.setEnabled(false);
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistro);
        btnRegistro.setBounds(160, 430, 140, 40);

        jScrollPane1.setViewportView(lstNutrientes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(280, 240, 180, 150);

        txtNutriente.setEditable(false);
        getContentPane().add(txtNutriente);
        txtNutriente.setBounds(10, 256, 160, 40);

        jLabel1.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        jLabel1.setText("Proporcion:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 310, 110, 24);

        txtProporcion.setEditable(false);
        getContentPane().add(txtProporcion);
        txtProporcion.setBounds(10, 340, 160, 40);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("% cada 100 gramos");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 380, 140, 16);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(20, 410, 440, 12);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wall_alimento.jpg"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(-5, -4, 500, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        if (!this.txtCategoria.getText().isEmpty() && !this.txtNombre.getText().isEmpty()) {
            this.txtNutriente.setEditable(true);
            this.txtProporcion.setEditable(true);
            this.btnAgregar.setEnabled(true);
        } else {
            this.txtNutriente.setEditable(false);
            this.txtProporcion.setEditable(false);
            this.btnAgregar.setEnabled(false);
        }
        listaNutrientes.clear();
        nutrientes.clear();
        this.lstNutrientes.setListData(listaNutrientes.toArray());
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtCategoriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoriaKeyReleased
        if (!this.txtNombre.getText().isEmpty() && !this.txtCategoria.getText().isEmpty()) {
            this.txtNutriente.setEditable(true);
            this.txtProporcion.setEditable(true);
            this.btnAgregar.setEnabled(true);
            this.btnRegistro.setEnabled(true);
        } else {
            this.txtNutriente.setEditable(false);
            this.txtProporcion.setEditable(false);
            this.btnAgregar.setEnabled(false);
            this.btnRegistro.setEnabled(false);
        }
        listaNutrientes.clear();
        nutrientes.clear();
        this.lstNutrientes.setListData(listaNutrientes.toArray());
    }//GEN-LAST:event_txtCategoriaKeyReleased


    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (Herramientas.esNumero(this.txtProporcion.getText())) {
            if (Herramientas.validarRango(this.txtProporcion.getText(), 100, 1)) {
                nutrientes.put(this.txtNutriente.getText(), Integer.valueOf(this.txtProporcion.getText()));
                listaNutrientes.add(this.txtNutriente.getText() + " - " + this.txtProporcion.getText() + "%");
                this.lstNutrientes.setListData(listaNutrientes.toArray());
                this.txtNutriente.setText("");
                this.txtProporcion.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Proporción furea de rango.", "Atención", 0, new ImageIcon(getClass().getResource("/imagenes/warning.png")));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Proporción invalida.", "Atención", 0, new ImageIcon(getClass().getResource("/imagenes/warning.png")));

        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        modelo.agregarAlimento(this.txtNombre.getText(), this.txtCategoria.getText(), nutrientes);
        JOptionPane.showMessageDialog(null, "Alimento registrado exitosamente.", "Mensaje", 0, new ImageIcon(getClass().getResource("/imagenes/groceries.png")));
        this.dispose();
        MenuPrincipal ventana = new MenuPrincipal(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        this.dispose();
        MenuPrincipal ventana = new MenuPrincipal(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreNutriente;
    private javax.swing.JLabel lblNutrientes;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<Object> lstNutrientes;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNutriente;
    private javax.swing.JTextField txtProporcion;
    // End of variables declaration//GEN-END:variables
}

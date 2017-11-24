package interfaz;

import dominio.Alimento;
import dominio.Sistema;
import java.util.ArrayList;

public class VentanaPreferenciasRestricciones extends javax.swing.JDialog {

    private Sistema modelo;
    private ArrayList<Alimento> listaPreferencias;
    private ArrayList<Alimento> listaRestricciones;

    public VentanaPreferenciasRestricciones(Sistema miSis, ArrayList<Alimento> preferencias, ArrayList<Alimento> restricciones) {
        initComponents();
        modelo = miSis;
        this.setModal(true);
        this.setLocationRelativeTo(null);
        this.lblTituloRestricciones.setVisible(false);
        this.btnPreferencias.setVisible(false);
        this.lstTodos.setListData(modelo.getListaAlimentos().toArray());
        listaPreferencias = preferencias;
        listaRestricciones = restricciones;
        this.lstMisAlimentos.setListData(listaPreferencias.toArray());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        btnVolver = new javax.swing.JButton();
        btnRestricciones = new javax.swing.JButton();
        btnPreferencias = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstMisAlimentos = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstTodos = new javax.swing.JList<>();
        btnAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblTituloPreferencias = new javax.swing.JLabel();
        lblTituloRestricciones = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Seleccion de preferencias y restricciones");
        setMinimumSize(new java.awt.Dimension(680, 510));
        setPreferredSize(new java.awt.Dimension(680, 510));
        setSize(new java.awt.Dimension(680, 510));
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 380, 640, 12);

        btnVolver.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        btnVolver.setText("Salir");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver);
        btnVolver.setBounds(20, 400, 130, 50);

        btnRestricciones.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnRestricciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/right-arrow (1).png"))); // NOI18N
        btnRestricciones.setText("Restricciones");
        btnRestricciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestriccionesActionPerformed(evt);
            }
        });
        getContentPane().add(btnRestricciones);
        btnRestricciones.setBounds(520, 400, 140, 50);

        btnPreferencias.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnPreferencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/left-arrow (1).png"))); // NOI18N
        btnPreferencias.setText("Preferencias");
        btnPreferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreferenciasActionPerformed(evt);
            }
        });
        getContentPane().add(btnPreferencias);
        btnPreferencias.setBounds(520, 400, 140, 50);

        jScrollPane1.setViewportView(lstMisAlimentos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(380, 90, 270, 270);

        jScrollPane2.setViewportView(lstTodos);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 90, 270, 270);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus (2).png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar);
        btnAgregar.setBounds(310, 200, 60, 50);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buffet.png"))); // NOI18N
        jLabel1.setText("Todos los alimentos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 70, 170, 16);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ice-bucket.png"))); // NOI18N
        jLabel2.setText("Mis Alimentos");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(390, 66, 130, 20);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(20, 40, 630, 12);

        lblTituloPreferencias.setFont(new java.awt.Font("Seravek", 1, 27)); // NOI18N
        lblTituloPreferencias.setText("Preferencias");
        getContentPane().add(lblTituloPreferencias);
        lblTituloPreferencias.setBounds(270, 10, 190, 34);

        lblTituloRestricciones.setFont(new java.awt.Font("Seravek", 1, 27)); // NOI18N
        lblTituloRestricciones.setText("Restricciones");
        getContentPane().add(lblTituloRestricciones);
        lblTituloRestricciones.setBounds(270, 10, 190, 34);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wall_green.jpg"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(-240, -10, 1020, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRestriccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestriccionesActionPerformed
        this.lblTituloPreferencias.setVisible(false);
        this.lblTituloRestricciones.setVisible(true);
        this.btnPreferencias.setVisible(true);
        this.btnRestricciones.setVisible(false);
        this.lstMisAlimentos.setListData(this.listaRestricciones.toArray());
    }//GEN-LAST:event_btnRestriccionesActionPerformed

    private void btnPreferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreferenciasActionPerformed
        this.lblTituloPreferencias.setVisible(true);
        this.lblTituloRestricciones.setVisible(false);
        this.btnPreferencias.setVisible(false);
        this.btnRestricciones.setVisible(true);
        this.lstMisAlimentos.setListData(this.listaPreferencias.toArray());
    }//GEN-LAST:event_btnPreferenciasActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (this.lstTodos.getSelectedIndex() >= 0) {
            Alimento alimento = modelo.getListaAlimentos().get(this.lstTodos.getSelectedIndex());
            if (this.lblTituloPreferencias.isVisible()) {
                if (!listaPreferencias.contains(alimento)) {
                    this.listaPreferencias.add(alimento);
                    this.lstMisAlimentos.setListData(this.listaPreferencias.toArray());
                }
            } else if (this.lblTituloRestricciones.isVisible()) {
                if (!listaRestricciones.contains(alimento)) {
                    this.listaRestricciones.add(alimento);
                    this.lstMisAlimentos.setListData(this.listaRestricciones.toArray());
                }
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnPreferencias;
    private javax.swing.JButton btnRestricciones;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblTituloPreferencias;
    private javax.swing.JLabel lblTituloRestricciones;
    private javax.swing.JList<Object> lstMisAlimentos;
    private javax.swing.JList<Object> lstTodos;
    // End of variables declaration//GEN-END:variables
}

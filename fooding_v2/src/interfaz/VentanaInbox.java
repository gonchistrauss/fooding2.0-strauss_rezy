package interfaz;

import dominio.Consulta;
import dominio.Profesional;
import dominio.Sistema;
import java.util.ArrayList;

public class VentanaInbox extends javax.swing.JDialog {

    private Sistema modelo;
    private Profesional profesionalActivo;

    public VentanaInbox(Sistema miSis) {
        initComponents();
        modelo = miSis;
        this.setModal(true);
        this.setLocationRelativeTo(null);
        profesionalActivo = modelo.obtenerSesionActivaProfesional();
        this.lstInbox.setListData(modelo.consultasPorDescripcion(profesionalActivo.getInbox()).toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstInbox = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox<>();
        btnDetalle = new javax.swing.JButton();
        btnTomar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inbox ");
        setMinimumSize(new java.awt.Dimension(631, 439));
        setResizable(false);
        setSize(new java.awt.Dimension(631, 439));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Seravek", 1, 27)); // NOI18N
        lblTitulo.setText("Inbox de consultas y planes");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(130, 10, 360, 40);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(30, 50, 570, 12);

        jLabel1.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/filter-tool-black-shape.png"))); // NOI18N
        jLabel1.setText("Filtrar por :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 60, 120, 30);

        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Planes", "Consultas" }));
        getContentPane().add(comboCategoria);
        comboCategoria.setBounds(240, 60, 140, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(30, 120, 570, 12);

        lstInbox.setModel(new javax.swing.AbstractListModel<Object>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstInbox);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 150, 570, 200);

        jLabel2.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        jLabel2.setText("Inbox");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 130, 60, 20);

        lblCategoria.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblCategoria.setText("Categoria");
        getContentPane().add(lblCategoria);
        lblCategoria.setBounds(160, 60, 90, 30);

        lblEstado.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblEstado.setText("Estado");
        getContentPane().add(lblEstado);
        lblEstado.setBounds(390, 60, 90, 30);

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Pendiente", "En proceso", "Completado" }));
        getContentPane().add(comboEstado);
        comboEstado.setBounds(450, 60, 140, 27);

        btnDetalle.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search.png"))); // NOI18N
        btnDetalle.setText("Ver detalle");
        btnDetalle.setEnabled(false);
        getContentPane().add(btnDetalle);
        btnDetalle.setBounds(70, 360, 120, 40);

        btnTomar.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnTomar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/checked.png"))); // NOI18N
        btnTomar.setText("Seleccionar");
        btnTomar.setEnabled(false);
        getContentPane().add(btnTomar);
        btnTomar.setBounds(250, 360, 120, 40);

        btnEliminar.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(430, 360, 120, 40);

        btnBuscar.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/loupe.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(480, 90, 110, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        VentanaPanelProfesional ventana = new VentanaPanelProfesional(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int nroCategoria = this.comboCategoria.getSelectedIndex();
        int nroEstado = this.comboEstado.getSelectedIndex();
        
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDetalle;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnTomar;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<Object> lstInbox;
    // End of variables declaration//GEN-END:variables
}

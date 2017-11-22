
package interfaz;

import dominio.Sistema;


public class VentanaHistorial extends javax.swing.JDialog {
    private Sistema modelo;
    
    public VentanaHistorial(Sistema miSis) {
        initComponents();
        modelo = miSis;
        this.setModal(true);
        this.setLocationRelativeTo(null);    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloHistorial = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblHistorial = new javax.swing.JLabel();
        comboVistas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstConsultas = new javax.swing.JList<>();
        panelMensaje = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnEnviar = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(709, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(709, 450));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        lblTituloHistorial.setFont(new java.awt.Font("Seravek", 1, 27)); // NOI18N
        lblTituloHistorial.setText("Panel de consultas y planes");
        getContentPane().add(lblTituloHistorial);
        lblTituloHistorial.setBounds(190, 10, 360, 34);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(40, 50, 630, 10);

        lblHistorial.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblHistorial.setText("Historial:");
        getContentPane().add(lblHistorial);
        lblHistorial.setBounds(50, 70, 80, 24);

        comboVistas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consultas", "Planes" }));
        getContentPane().add(comboVistas);
        comboVistas.setBounds(120, 60, 240, 40);

        lstConsultas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstConsultas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 100, 310, 320);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        btnEnviar.setText("Enviar");

        lblMensaje.setText("Enviar mensaje:");

        javax.swing.GroupLayout panelMensajeLayout = new javax.swing.GroupLayout(panelMensaje);
        panelMensaje.setLayout(panelMensajeLayout);
        panelMensajeLayout.setHorizontalGroup(
            panelMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMensajeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMensajeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEnviar))
                    .addGroup(panelMensajeLayout.createSequentialGroup()
                        .addComponent(lblMensaje)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelMensajeLayout.setVerticalGroup(
            panelMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMensajeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMensaje)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEnviar)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        getContentPane().add(panelMensaje);
        panelMensaje.setBounds(370, 250, 330, 170);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(370, 240, 330, 12);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        VentanaPanelUsuario ventana = new VentanaPanelUsuario(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_formWindowClosing



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JComboBox<String> comboVistas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblHistorial;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblTituloHistorial;
    private javax.swing.JList<String> lstConsultas;
    private javax.swing.JPanel panelMensaje;
    // End of variables declaration//GEN-END:variables
}

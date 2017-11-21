package interfaz;

import dominio.Profesional;
import dominio.Sistema;
import javax.swing.ImageIcon;

public class VentanaPanelProfesional extends javax.swing.JDialog {

    private Sistema modelo;
    private Profesional profesionalActivo;

    public VentanaPanelProfesional(Sistema miSis) {
        initComponents();
        modelo = miSis;
        this.setModal(true);
        this.setLocationRelativeTo(null);
        profesionalActivo = modelo.obtenerSesionActivaProfesional();
        this.lblNombreProfesional.setText(profesionalActivo.getNombre() + " " + profesionalActivo.getApellidos());
        if (!profesionalActivo.getPathPerfil().equals("/imagenes/perfil_defecto.png")) {
            this.lblFotoPerfil.setIcon(new ImageIcon(profesionalActivo.getPathPerfil()));
        }
        this.lblPlanesPendientes.setText(profesionalActivo.getTituloProfesional());
         profesionalActivo = modelo.obtenerSesionActivaProfesional();
        this.lstInbox.setListData(modelo.consultasPorDescripcion(profesionalActivo.getInbox()).toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBBienvenido = new javax.swing.JLabel();
        lblNombreProfesional = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblFotoPerfil = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblNacionalidad = new javax.swing.JLabel();
        lblPlanesPendientes = new javax.swing.JLabel();
        lblConsultasPendientes = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstInbox = new javax.swing.JList<>();
        lblCategoria = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox<>();
        btnDetalle = new javax.swing.JButton();
        btnTomar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnAutor = new javax.swing.JLabel();
        comboAutor = new javax.swing.JComboBox<>();
        lblPanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(980, 500));
        setPreferredSize(new java.awt.Dimension(980, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(502, 446));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        lblBBienvenido.setFont(new java.awt.Font("Seravek", 1, 27)); // NOI18N
        lblBBienvenido.setText("Bienvenido, ");
        getContentPane().add(lblBBienvenido);
        lblBBienvenido.setBounds(480, 20, 170, 30);

        lblNombreProfesional.setFont(new java.awt.Font("Seravek", 1, 24)); // NOI18N
        lblNombreProfesional.setForeground(new java.awt.Color(0, 204, 0));
        lblNombreProfesional.setText("Gonzalo Strauss");
        getContentPane().add(lblNombreProfesional);
        lblNombreProfesional.setBounds(630, 20, 270, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(60, 50, 920, 10);

        lblFotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil_defecto.png"))); // NOI18N
        getContentPane().add(lblFotoPerfil);
        lblFotoPerfil.setBounds(30, 80, 130, 130);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(170, 70, 10, 320);

        lblNacionalidad.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblNacionalidad.setForeground(new java.awt.Color(255, 153, 0));
        lblNacionalidad.setText("xxx");
        getContentPane().add(lblNacionalidad);
        lblNacionalidad.setBounds(30, 230, 130, 20);

        lblPlanesPendientes.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblPlanesPendientes.setForeground(new java.awt.Color(255, 153, 0));
        lblPlanesPendientes.setText("yyy");
        getContentPane().add(lblPlanesPendientes);
        lblPlanesPendientes.setBounds(31, 260, 130, 16);

        lblConsultasPendientes.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblConsultasPendientes.setForeground(new java.awt.Color(255, 153, 0));
        lblConsultasPendientes.setText("zzz");
        getContentPane().add(lblConsultasPendientes);
        lblConsultasPendientes.setBounds(31, 290, 130, 16);

        btnSalir.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sign-out-option.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(10, 420, 130, 40);

        jLabel1.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/filter-tool-black-shape.png"))); // NOI18N
        jLabel1.setText("Filtrar por :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 90, 120, 30);

        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Planes", "Consultas" }));
        getContentPane().add(comboCategoria);
        comboCategoria.setBounds(400, 90, 130, 30);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(190, 150, 750, 12);

        lstInbox.setModel(new javax.swing.AbstractListModel<Object>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstInbox);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(240, 180, 670, 200);

        lblCategoria.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblCategoria.setText("Categoria");
        getContentPane().add(lblCategoria);
        lblCategoria.setBounds(320, 90, 90, 30);

        lblEstado.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblEstado.setText("Estado");
        getContentPane().add(lblEstado);
        lblEstado.setBounds(540, 90, 90, 30);

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Pendiente", "En proceso", "Completado" }));
        getContentPane().add(comboEstado);
        comboEstado.setBounds(600, 90, 130, 27);

        btnDetalle.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search.png"))); // NOI18N
        btnDetalle.setText("Ver detalle");
        btnDetalle.setEnabled(false);
        getContentPane().add(btnDetalle);
        btnDetalle.setBounds(290, 390, 120, 40);

        btnTomar.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnTomar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/checked.png"))); // NOI18N
        btnTomar.setText("Seleccionar");
        btnTomar.setEnabled(false);
        getContentPane().add(btnTomar);
        btnTomar.setBounds(520, 390, 120, 40);

        btnEliminar.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(760, 390, 120, 40);

        btnBuscar.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/loupe.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(830, 120, 110, 30);

        jLabel3.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 24)); // NOI18N
        jLabel3.setText("Inbox");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(520, 60, 130, 30);

        btnAutor.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        btnAutor.setText("Profesional");
        getContentPane().add(btnAutor);
        btnAutor.setBounds(740, 90, 90, 30);

        comboAutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Yo" }));
        getContentPane().add(comboAutor);
        comboAutor.setBounds(830, 90, 120, 27);

        lblPanel.setFont(new java.awt.Font("Seravek", 1, 30)); // NOI18N
        lblPanel.setText("Panel del profesional:");
        getContentPane().add(lblPanel);
        lblPanel.setBounds(80, 10, 370, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.profesionalActivo.setSesionActiva(false);
        this.dispose();
        MenuPrincipal ventana = new MenuPrincipal(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.profesionalActivo.setSesionActiva(false);
        this.dispose();
        MenuPrincipal ventana = new MenuPrincipal(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int nroCategoria = this.comboCategoria.getSelectedIndex();
        int nroEstado = this.comboEstado.getSelectedIndex();

    }//GEN-LAST:event_btnBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAutor;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDetalle;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTomar;
    private javax.swing.JComboBox<String> comboAutor;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblBBienvenido;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblConsultasPendientes;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFotoPerfil;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombreProfesional;
    private javax.swing.JLabel lblPanel;
    private javax.swing.JLabel lblPlanesPendientes;
    private javax.swing.JList<Object> lstInbox;
    // End of variables declaration//GEN-END:variables
}

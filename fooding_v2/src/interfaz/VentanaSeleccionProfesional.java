package interfaz;

import dominio.Profesional;
import dominio.Sistema;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class VentanaSeleccionProfesional extends javax.swing.JDialog {

    private Sistema modelo;

    public VentanaSeleccionProfesional(Sistema miSis) {
        initComponents();
        modelo = miSis;
        this.setModal(true);
        this.setLocationRelativeTo(null);
        cargarLista();
    }

    public void cargarLabels() {
        Profesional profesional = (Profesional) comboProfesionales.getSelectedItem();
        campoTitulo.setText(profesional.getTituloProfesional());
        campoEmision.setText(profesional.getPaisEstudio().getCountry());
        DateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        campoGraduacion.setText(date.format(profesional.getFechaDeGraduacion()));
        if (profesional.getPathPerfil().equals("/imagenes/perfil_defecto.png")) {
            lblFotoPerfil.setIcon(new ImageIcon(this.getClass().getResource(profesional.getPathPerfil())));
        } else {
            lblFotoPerfil.setIcon(new ImageIcon(profesional.getPathPerfil()));
        }
    }

    public void cargarLista() {
        this.comboProfesionales.setModel(new DefaultComboBoxModel(modelo.getListaProfesionales().toArray()));
        cargarLabels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        comboProfesionales = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        lblFotoPerfil = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblProfesional = new javax.swing.JLabel();
        lblTituloProfesional = new javax.swing.JLabel();
        lblEmision = new javax.swing.JLabel();
        lblGraduacion = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        campoTitulo = new javax.swing.JLabel();
        campoEmision = new javax.swing.JLabel();
        campoGraduacion = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Seleccion de profesional");
        setMinimumSize(new java.awt.Dimension(570, 320));
        setPreferredSize(new java.awt.Dimension(570, 320));
        setResizable(false);
        setSize(new java.awt.Dimension(570, 320));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Seravek", 1, 27)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(102, 102, 102));
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/teamwork-in-the-office.png"))); // NOI18N
        lblTitulo.setText("Seleccion de profesional");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(120, -10, 370, 64);

        comboProfesionales.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        comboProfesionales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        comboProfesionales.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboProfesionalesItemStateChanged(evt);
            }
        });
        getContentPane().add(comboProfesionales);
        comboProfesionales.setBounds(260, 50, 280, 40);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 90, 530, 10);

        lblFotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil_defecto.png"))); // NOI18N
        getContentPane().add(lblFotoPerfil);
        lblFotoPerfil.setBounds(30, 110, 130, 130);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(20, 40, 530, 10);

        lblProfesional.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/list-with-possible-workers-to-choose (1).png"))); // NOI18N
        lblProfesional.setText("Seleccionar profesional:");
        getContentPane().add(lblProfesional);
        lblProfesional.setBounds(40, 60, 210, 24);

        lblTituloProfesional.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblTituloProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/diploma.png"))); // NOI18N
        lblTituloProfesional.setText("Titulo:");
        getContentPane().add(lblTituloProfesional);
        lblTituloProfesional.setBounds(180, 120, 90, 24);

        lblEmision.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblEmision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/international-delivery.png"))); // NOI18N
        lblEmision.setText("Emision:");
        getContentPane().add(lblEmision);
        lblEmision.setBounds(180, 160, 90, 24);

        lblGraduacion.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblGraduacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/graduation-hat-and-diploma.png"))); // NOI18N
        lblGraduacion.setText("Graduacion:");
        getContentPane().add(lblGraduacion);
        lblGraduacion.setBounds(180, 200, 120, 24);

        btnContinuar.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/right-arrow.png"))); // NOI18N
        btnContinuar.setText("Continuar");
        getContentPane().add(btnContinuar);
        btnContinuar.setBounds(410, 240, 150, 50);

        btnVolver.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/left-arrow.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver);
        btnVolver.setBounds(260, 240, 150, 50);

        campoTitulo.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        campoTitulo.setForeground(new java.awt.Color(0, 153, 255));
        campoTitulo.setText("xxx");
        getContentPane().add(campoTitulo);
        campoTitulo.setBounds(310, 120, 230, 24);

        campoEmision.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        campoEmision.setForeground(new java.awt.Color(0, 153, 255));
        campoEmision.setText("yyy");
        getContentPane().add(campoEmision);
        campoEmision.setBounds(310, 160, 230, 24);

        campoGraduacion.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        campoGraduacion.setForeground(new java.awt.Color(0, 153, 255));
        campoGraduacion.setText("zzz");
        getContentPane().add(campoGraduacion);
        campoGraduacion.setBounds(310, 200, 230, 24);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wallll.png"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(-35, -14, 650, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboProfesionalesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboProfesionalesItemStateChanged
        cargarLabels();
    }//GEN-LAST:event_comboProfesionalesItemStateChanged

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        MenuPrincipal ventana = new MenuPrincipal(modelo);
        ventana.setVisible(true);    }//GEN-LAST:event_btnVolverActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        MenuPrincipal ventana = new MenuPrincipal(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel campoEmision;
    private javax.swing.JLabel campoGraduacion;
    private javax.swing.JLabel campoTitulo;
    private javax.swing.JComboBox<Object> comboProfesionales;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblEmision;
    private javax.swing.JLabel lblFotoPerfil;
    private javax.swing.JLabel lblGraduacion;
    private javax.swing.JLabel lblProfesional;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloProfesional;
    // End of variables declaration//GEN-END:variables
}

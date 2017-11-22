package interfaz;

import dominio.Alimento;
import dominio.Sistema;
import dominio.Usuario;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class VentanaIngesta extends javax.swing.JDialog {

    private Sistema modelo;
    private Usuario usuarioActivo;
    private ArrayList<Alimento> alimentosIngeridos;
    private String fechaActual;
    private boolean yaEstaRegistrado;

    public VentanaIngesta(Sistema miSis) {
        initComponents();
        modelo = miSis;
        this.setModal(true);
        this.setLocationRelativeTo(null);
        usuarioActivo = modelo.obtenerSesionActivaUsuario();
        cargarListas();
    }

    public void cargarListas() {
        this.dateChooser.setDateFormatString("dd/MM/yyyy");
        DateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        fechaActual = date.format(new Date());
        yaEstaRegistrado = usuarioActivo.getAlimentosIngs().containsKey(fechaActual);
        if (yaEstaRegistrado) {
            this.btnGuardar.setEnabled(false);
            ArrayList<Alimento> alimentos = usuarioActivo.getAlimentosIngs().get(fechaActual);
            this.lblStatusIngerido.setText("Ya hay registro de alimentos para el dia: " + fechaActual);
            this.lstMisAlimentos.setListData(alimentos.toArray());
        } else {
            this.lstAlimentos.setListData(modelo.getListaAlimentos().toArray());
            this.lblStatusIngerido.setText("Ingreso de alimentos ingeridos del dia: " + fechaActual);
            alimentosIngeridos = new ArrayList<Alimento>();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        lblHistorial = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstIngeridosHistorial = new javax.swing.JList<>();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstAlimentos = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstMisAlimentos = new javax.swing.JList<>();
        btnSalir = new javax.swing.JButton();
        btnAgregarAlimento = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        dateChooser = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        lblStatusIngerido = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblDia = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro alimenticio");
        setMinimumSize(new java.awt.Dimension(995, 610));
        setPreferredSize(new java.awt.Dimension(995, 610));
        setSize(new java.awt.Dimension(995, 610));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(490, 60, 10, 530);

        lblHistorial.setFont(new java.awt.Font("Seravek", 1, 27)); // NOI18N
        lblHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/history-clock-button.png"))); // NOI18N
        lblHistorial.setText("Historial");
        getContentPane().add(lblHistorial);
        lblHistorial.setBounds(670, 20, 160, 34);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Alimentos ingeridos en el dia:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(530, 120, 230, 16);

        lstIngeridosHistorial.setModel(new javax.swing.AbstractListModel<Object>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstIngeridosHistorial);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(520, 140, 430, 390);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(510, 50, 440, 12);

        jLabel1.setFont(new java.awt.Font("Seravek", 1, 27)); // NOI18N
        jLabel1.setText("Ingreso de alimentos ingeridos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 10, 440, 50);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(20, 50, 440, 12);

        lstAlimentos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstAlimentosValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstAlimentos);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 90, 450, 170);

        lstMisAlimentos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(lstMisAlimentos);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(30, 340, 450, 190);

        btnSalir.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(30, 530, 130, 40);

        btnAgregarAlimento.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnAgregarAlimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arrow-angle-pointing-down.png"))); // NOI18N
        btnAgregarAlimento.setText("Agregar alimento");
        btnAgregarAlimento.setEnabled(false);
        btnAgregarAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlimentoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarAlimento);
        btnAgregarAlimento.setBounds(170, 270, 180, 50);

        btnGuardar.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tack-save-button.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(360, 530, 120, 40);

        dateChooser.setOpaque(false);
        getContentPane().add(dateChooser);
        dateChooser.setBounds(650, 70, 200, 30);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Seleccionar fecha:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(520, 70, 190, 30);

        btnBuscar.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/loupe.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(860, 70, 90, 28);

        lblStatusIngerido.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblStatusIngerido.setText("Ingreso de alimentos ingeridos del dia:");
        getContentPane().add(lblStatusIngerido);
        lblStatusIngerido.setBounds(40, 70, 430, 16);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Alimentos ingeridos:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 320, 200, 16);

        lblDia.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblDia.setText("dd/MM/yyyy");
        getContentPane().add(lblDia);
        lblDia.setBounds(760, 120, 150, 16);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wall_green.jpg"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(-280, -20, 1290, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        this.dispose();
        VentanaPanelUsuario ventana = new VentanaPanelUsuario(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnAgregarAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlimentoActionPerformed
        Alimento alimento = (Alimento) this.lstAlimentos.getSelectedValue();
        if (!alimentosIngeridos.contains(alimento)) {
            alimentosIngeridos.add(alimento);
            this.lstMisAlimentos.setListData(alimentosIngeridos.toArray());
        }
    }//GEN-LAST:event_btnAgregarAlimentoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int input = JOptionPane.showConfirmDialog(null, "Esta seguro que desea registrar estos alimentos?\n"
                + "Esta accion es irreversible", "Confirmacion",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (input == 0) {
            usuarioActivo.agregarAlimentosIngeridos(alimentosIngeridos, fechaActual);
            this.btnGuardar.setEnabled(false);
            this.btnAgregarAlimento.setEnabled(false);
            yaEstaRegistrado = true;
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void lstAlimentosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstAlimentosValueChanged
        if (!yaEstaRegistrado) {
            if (!evt.getValueIsAdjusting()) {
                if (this.lstAlimentos.getSelectedIndex() >= 0) {
                    this.btnAgregarAlimento.setEnabled(true);
                } else {
                    this.btnAgregarAlimento.setEnabled(false);
                }
            }
        }
    }//GEN-LAST:event_lstAlimentosValueChanged

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Date fechaBuscada = this.dateChooser.getDate();
        DateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        String fechaString = date.format(fechaBuscada);
        this.lblDia.setText(fechaString);
        if (usuarioActivo.getAlimentosIngs().containsKey(fechaString)) {
            ArrayList<Alimento> ingeridosHistorial = usuarioActivo.getAlimentosIngs().get(fechaString);
            this.lstIngeridosHistorial.setListData(ingeridosHistorial.toArray());
        } else {
            String[] indefinido = {"***NO HAY ALIMENTOS INGERIDOS EN ESTA FECHA.***"};
            this.lstIngeridosHistorial.setListData(indefinido);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        VentanaPanelUsuario ventana = new VentanaPanelUsuario(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAlimento;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblHistorial;
    private javax.swing.JLabel lblStatusIngerido;
    private javax.swing.JList<Object> lstAlimentos;
    private javax.swing.JList<Object> lstIngeridosHistorial;
    private javax.swing.JList<Object> lstMisAlimentos;
    // End of variables declaration//GEN-END:variables
}

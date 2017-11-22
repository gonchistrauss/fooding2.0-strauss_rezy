package interfaz;

import dominio.Alimento;
import dominio.Consulta;
import dominio.Profesional;
import dominio.Sistema;
import dominio.Usuario;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class VentanaPlanesProfesional extends javax.swing.JDialog {

    private Sistema modelo;
    private Profesional profesionalActivo;
    private Usuario usuarioConsulta;
    private Consulta consultaUsuario;
    private ArrayList<Alimento> lunes, martes, miercoles, jueves, viernes, sabado, domingo;

    public VentanaPlanesProfesional(Sistema miSis, Consulta consulta) {
        initComponents();
        modelo = miSis;
        this.setModal(true);
        this.setLocationRelativeTo(null);
        cargarListasAlimentos();
        profesionalActivo = modelo.obtenerSesionActivaProfesional();
        this.comboAlimentos.setModel(new DefaultComboBoxModel(modelo.getListaAlimentos().toArray()));
        habilitarBotones();
        usuarioConsulta = consulta.getUsuario();
        consultaUsuario = consulta;
        this.lblNombre.setText("Nombre: " + usuarioConsulta.getNombre());
        this.lblApellido.setText("Apellidos: " + usuarioConsulta.getApellidos());
        this.lblNacionalidad.setText("Nacionalidad: " + usuarioConsulta.getNacionalidad().getCountry());
        if (!usuarioConsulta.getPathPerfil().equals("/imagenes/perfil_defecto.png")) {
            this.lblFotoPerfil.setIcon(new ImageIcon(usuarioConsulta.getPathPerfil()));
        }
        DateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        this.lblNacimiento.setText("Nacimiento: " + date.format(usuarioConsulta.getFechaDeNacimiento()));
        this.comboPreferencias.setModel(new DefaultComboBoxModel(usuarioConsulta.getPreferencias().toArray()));
        this.comboRestricciones.setModel(new DefaultComboBoxModel(usuarioConsulta.getRestricciones().toArray()));
        this.txtMensajeInicial.setText(consultaUsuario.toString());
    }

    public void cargarListasAlimentos() {
        lunes = new ArrayList<>();
        martes = new ArrayList<>();
        miercoles = new ArrayList<>();
        jueves = new ArrayList<>();
        viernes = new ArrayList<>();
        sabado = new ArrayList<>();
        domingo = new ArrayList<>();
    }

    public boolean hayAlimentoCargado() {
        if (this.comboAlimentos.getSelectedIndex() >= 0) {
            return true;
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNacimiento = new javax.swing.JLabel();
        lblInformacion = new javax.swing.JLabel();
        lblFotoPerfil = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblNacionalidad = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboPreferencias = new javax.swing.JComboBox<>();
        comboRestricciones = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        lblPlanAlimentacion = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblSeleccionDeAlimento = new javax.swing.JLabel();
        comboAlimentos = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstDomingo = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstLunes = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstMartes = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstMiercoles = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        lstJueves = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        lstViernes = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        lstSabado = new javax.swing.JList<>();
        btnDomingo = new javax.swing.JButton();
        btnLunes = new javax.swing.JButton();
        btnMartes = new javax.swing.JButton();
        btnMiercoles = new javax.swing.JButton();
        btnJueves = new javax.swing.JButton();
        btnViernes = new javax.swing.JButton();
        btnSabado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        lblDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMensajeInicial = new javax.swing.JTextArea();
        btnSalir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtEnvio = new javax.swing.JTextArea();
        lblEnvio = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        lblBackgorund = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1125, 800));
        setSize(new java.awt.Dimension(1125, 800));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        lblNacimiento.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblNacimiento.setText("Nacimiento:");
        getContentPane().add(lblNacimiento);
        lblNacimiento.setBounds(150, 150, 230, 20);

        lblInformacion.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 24)); // NOI18N
        lblInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/business-card-of-a-man-with-contact-info.png"))); // NOI18N
        lblInformacion.setText("Informacion del usuario:");
        getContentPane().add(lblInformacion);
        lblInformacion.setBounds(50, 20, 300, 40);

        lblFotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil_defecto.png"))); // NOI18N
        getContentPane().add(lblFotoPerfil);
        lblFotoPerfil.setBounds(10, 80, 130, 130);

        lblNombre.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblNombre.setText("Nombre:");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(150, 90, 230, 17);

        lblApellido.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblApellido.setText("Apellidos:");
        getContentPane().add(lblApellido);
        lblApellido.setBounds(150, 120, 230, 20);

        lblNacionalidad.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblNacionalidad.setText("Nacionalidad:");
        getContentPane().add(lblNacionalidad);
        lblNacionalidad.setBounds(150, 180, 230, 20);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Preferencias:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 230, 170, 20);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setText("Restricciones:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 280, 210, 17);

        comboPreferencias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        getContentPane().add(comboPreferencias);
        comboPreferencias.setBounds(10, 250, 370, 27);

        comboRestricciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        getContentPane().add(comboRestricciones);
        comboRestricciones.setBounds(10, 300, 370, 27);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(380, 20, 50, 690);

        lblPlanAlimentacion.setFont(new java.awt.Font("Seravek", 1, 27)); // NOI18N
        lblPlanAlimentacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/planning (1).png"))); // NOI18N
        lblPlanAlimentacion.setText("Plan de alimentacion");
        getContentPane().add(lblPlanAlimentacion);
        lblPlanAlimentacion.setBounds(610, 10, 370, 40);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(400, 50, 700, 10);

        lblSeleccionDeAlimento.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblSeleccionDeAlimento.setText("Seleccionar alimento:");
        getContentPane().add(lblSeleccionDeAlimento);
        lblSeleccionDeAlimento.setBounds(410, 60, 200, 30);

        comboAlimentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        comboAlimentos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboAlimentosItemStateChanged(evt);
            }
        });
        getContentPane().add(comboAlimentos);
        comboAlimentos.setBounds(580, 60, 430, 27);

        lstDomingo.setModel(new javax.swing.AbstractListModel<Object>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstDomingo);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(400, 650, 620, 70);

        lstLunes.setModel(new javax.swing.AbstractListModel<Object>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstLunes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstLunes.setToolTipText("");
        jScrollPane3.setViewportView(lstLunes);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(400, 110, 620, 70);

        lstMartes.setModel(new javax.swing.AbstractListModel<Object>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(lstMartes);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(400, 200, 620, 70);

        lstMiercoles.setModel(new javax.swing.AbstractListModel<Object>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(lstMiercoles);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(400, 290, 620, 70);

        jScrollPane6.setViewportView(lstJueves);

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(400, 380, 620, 70);

        jScrollPane7.setViewportView(lstViernes);

        getContentPane().add(jScrollPane7);
        jScrollPane7.setBounds(400, 470, 620, 70);

        jScrollPane8.setViewportView(lstSabado);

        getContentPane().add(jScrollPane8);
        jScrollPane8.setBounds(400, 560, 620, 70);

        btnDomingo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus.png"))); // NOI18N
        btnDomingo.setEnabled(false);
        btnDomingo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDomingoActionPerformed(evt);
            }
        });
        getContentPane().add(btnDomingo);
        btnDomingo.setBounds(1030, 660, 70, 40);

        btnLunes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus.png"))); // NOI18N
        btnLunes.setEnabled(false);
        btnLunes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLunesActionPerformed(evt);
            }
        });
        getContentPane().add(btnLunes);
        btnLunes.setBounds(1030, 130, 70, 40);

        btnMartes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus.png"))); // NOI18N
        btnMartes.setEnabled(false);
        btnMartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMartesActionPerformed(evt);
            }
        });
        getContentPane().add(btnMartes);
        btnMartes.setBounds(1030, 220, 70, 40);

        btnMiercoles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus.png"))); // NOI18N
        btnMiercoles.setEnabled(false);
        btnMiercoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiercolesActionPerformed(evt);
            }
        });
        getContentPane().add(btnMiercoles);
        btnMiercoles.setBounds(1030, 310, 70, 40);

        btnJueves.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus.png"))); // NOI18N
        btnJueves.setEnabled(false);
        btnJueves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuevesActionPerformed(evt);
            }
        });
        getContentPane().add(btnJueves);
        btnJueves.setBounds(1030, 390, 70, 40);

        btnViernes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus.png"))); // NOI18N
        btnViernes.setEnabled(false);
        btnViernes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViernesActionPerformed(evt);
            }
        });
        getContentPane().add(btnViernes);
        btnViernes.setBounds(1030, 480, 70, 40);

        btnSabado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus.png"))); // NOI18N
        btnSabado.setEnabled(false);
        btnSabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSabadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSabado);
        btnSabado.setBounds(1030, 570, 70, 40);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Domingo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 630, 270, 16);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Lunes");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(400, 90, 200, 16);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setText("Martes");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(400, 180, 140, 16);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setText("Miercoles");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(400, 270, 120, 16);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setText("Jueves");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(400, 360, 190, 16);

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel8.setText("Viernes");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(400, 450, 250, 16);

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel9.setText("Sabado");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(400, 540, 280, 16);

        btnGuardar.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tack-save-button.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(630, 729, 130, 40);

        lblDescripcion.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblDescripcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contact-details.png"))); // NOI18N
        lblDescripcion.setText("Descripcion de consulta:");
        getContentPane().add(lblDescripcion);
        lblDescripcion.setBounds(20, 370, 230, 17);

        txtMensajeInicial.setEditable(false);
        txtMensajeInicial.setColumns(20);
        txtMensajeInicial.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        txtMensajeInicial.setForeground(new java.awt.Color(0, 102, 255));
        txtMensajeInicial.setRows(5);
        jScrollPane1.setViewportView(txtMensajeInicial);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 400, 360, 150);

        btnSalir.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sign-out-option.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(20, 730, 110, 40);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(210, 340, 0, 0);

        txtEnvio.setColumns(20);
        txtEnvio.setRows(5);
        txtEnvio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEnvioKeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(txtEnvio);

        getContentPane().add(jScrollPane9);
        jScrollPane9.setBounds(10, 590, 360, 50);

        lblEnvio.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblEnvio.setText("Enviar Mensaje:");
        getContentPane().add(lblEnvio);
        lblEnvio.setBounds(20, 566, 130, 20);

        btnEnviar.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.setEnabled(false);
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar);
        btnEnviar.setBounds(270, 650, 100, 40);

        lblBackgorund.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wallll.png"))); // NOI18N
        getContentPane().add(lblBackgorund);
        lblBackgorund.setBounds(-37, -24, 1190, 870);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        VentanaPanelProfesional ventana = new VentanaPanelProfesional(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnLunesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLunesActionPerformed
        if (!lunes.contains((Alimento) this.comboAlimentos.getSelectedItem())) {
            this.lunes.add((Alimento) this.comboAlimentos.getSelectedItem());
            this.lstLunes.setListData(lunes.toArray());
            btnGuardar.setEnabled(true);
        }
    }//GEN-LAST:event_btnLunesActionPerformed

    private void btnMartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMartesActionPerformed
        if (!martes.contains((Alimento) this.comboAlimentos.getSelectedItem())) {
            this.martes.add((Alimento) this.comboAlimentos.getSelectedItem());
            this.lstMartes.setListData(martes.toArray());
            btnGuardar.setEnabled(true);
        }
    }//GEN-LAST:event_btnMartesActionPerformed

    private void btnMiercolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiercolesActionPerformed
        if (!miercoles.contains((Alimento) this.comboAlimentos.getSelectedItem())) {
            this.miercoles.add((Alimento) this.comboAlimentos.getSelectedItem());
            this.lstMiercoles.setListData(miercoles.toArray());
            btnGuardar.setEnabled(true);
        }
    }//GEN-LAST:event_btnMiercolesActionPerformed

    private void btnJuevesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuevesActionPerformed
        if (!jueves.contains((Alimento) this.comboAlimentos.getSelectedItem())) {
            this.jueves.add((Alimento) this.comboAlimentos.getSelectedItem());
            this.lstJueves.setListData(jueves.toArray());
            btnGuardar.setEnabled(true);
        }
    }//GEN-LAST:event_btnJuevesActionPerformed

    private void btnViernesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViernesActionPerformed
        if (!viernes.contains((Alimento) this.comboAlimentos.getSelectedItem())) {
            this.viernes.add((Alimento) this.comboAlimentos.getSelectedItem());
            this.lstViernes.setListData(viernes.toArray());
            btnGuardar.setEnabled(true);
        }
    }//GEN-LAST:event_btnViernesActionPerformed

    private void btnSabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSabadoActionPerformed
        if (!sabado.contains((Alimento) this.comboAlimentos.getSelectedItem())) {
            this.sabado.add((Alimento) this.comboAlimentos.getSelectedItem());
            this.lstSabado.setListData(sabado.toArray());
            btnGuardar.setEnabled(true);
        }
    }//GEN-LAST:event_btnSabadoActionPerformed

    private void btnDomingoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDomingoActionPerformed
        if (!domingo.contains((Alimento) this.comboAlimentos.getSelectedItem())) {
            this.domingo.add((Alimento) this.comboAlimentos.getSelectedItem());
            this.lstDomingo.setListData(domingo.toArray());
            btnGuardar.setEnabled(true);
        }
    }//GEN-LAST:event_btnDomingoActionPerformed

    public void habilitarBotones() {
        if (hayAlimentoCargado()) {
            this.btnDomingo.setEnabled(true);
            this.btnLunes.setEnabled(true);
            this.btnMartes.setEnabled(true);
            this.btnMiercoles.setEnabled(true);
            this.btnJueves.setEnabled(true);
            this.btnViernes.setEnabled(true);
            this.btnSabado.setEnabled(true);
        } else {
            this.btnDomingo.setEnabled(false);
            this.btnLunes.setEnabled(false);
            this.btnMartes.setEnabled(false);
            this.btnMiercoles.setEnabled(false);
            this.btnJueves.setEnabled(false);
            this.btnViernes.setEnabled(false);
            this.btnSabado.setEnabled(false);
        }
    }

    private void comboAlimentosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboAlimentosItemStateChanged
        habilitarBotones();
    }//GEN-LAST:event_comboAlimentosItemStateChanged

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String planDeAlimentacion = modelo.parsearListasAPlanDeAlimentacion(lunes, martes, miercoles, jueves, viernes, sabado, domingo);
        System.out.println(planDeAlimentacion);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        this.consultaUsuario.agregarIncidencia(planDeAlimentacion, dateFormat.format(date), profesionalActivo);
        this.txtMensajeInicial.setText(consultaUsuario.toString());
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        VentanaPanelProfesional ventana = new VentanaPanelProfesional(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        consultaUsuario.agregarIncidencia(this.txtEnvio.getText(), dateFormat.format(date), profesionalActivo);
        this.txtMensajeInicial.setText(consultaUsuario.toString());
        this.txtEnvio.setText("");
        this.btnEnviar.setEnabled(false);
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void txtEnvioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnvioKeyReleased
        if (!this.txtEnvio.getText().isEmpty()) {
            this.btnEnviar.setEnabled(true);
        } else {
            this.btnEnviar.setEnabled(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnvioKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDomingo;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnJueves;
    private javax.swing.JButton btnLunes;
    private javax.swing.JButton btnMartes;
    private javax.swing.JButton btnMiercoles;
    private javax.swing.JButton btnSabado;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnViernes;
    private javax.swing.JComboBox<Object> comboAlimentos;
    private javax.swing.JComboBox<String> comboPreferencias;
    private javax.swing.JComboBox<String> comboRestricciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblBackgorund;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblEnvio;
    private javax.swing.JLabel lblFotoPerfil;
    private javax.swing.JLabel lblInformacion;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPlanAlimentacion;
    private javax.swing.JLabel lblSeleccionDeAlimento;
    private javax.swing.JList<Object> lstDomingo;
    private javax.swing.JList<Object> lstJueves;
    private javax.swing.JList<Object> lstLunes;
    private javax.swing.JList<Object> lstMartes;
    private javax.swing.JList<Object> lstMiercoles;
    private javax.swing.JList<Object> lstSabado;
    private javax.swing.JList<Object> lstViernes;
    private javax.swing.JTextArea txtEnvio;
    private javax.swing.JTextArea txtMensajeInicial;
    // End of variables declaration//GEN-END:variables
}

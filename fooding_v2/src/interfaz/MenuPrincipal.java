package interfaz;

import dominio.Sistema;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {

    private Sistema modelo;

    public MenuPrincipal(Sistema sis) {
        initComponents();
        this.modelo = sis;
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFooding = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        btnIngresoUsuario = new javax.swing.JButton();
        btnIngresoProfesional = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setMinimumSize(new java.awt.Dimension(650, 440));
        setPreferredSize(new java.awt.Dimension(650, 440));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        lblFooding.setFont(new java.awt.Font("Lucida Grande", 3, 36)); // NOI18N
        lblFooding.setText("Fooding");
        lblFooding.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lblFooding);
        lblFooding.setBounds(350, 20, 170, 50);

        btnRegistro.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clipboard-with-pencil-.png"))); // NOI18N
        btnRegistro.setText("Registro");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistro);
        btnRegistro.setBounds(340, 80, 180, 50);

        btnIngresoUsuario.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnIngresoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/standing-frontal-man-silhouette.png"))); // NOI18N
        btnIngresoUsuario.setText("Soy usuario");
        btnIngresoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresoUsuario);
        btnIngresoUsuario.setBounds(240, 140, 180, 50);

        btnIngresoProfesional.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnIngresoProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/engineer.png"))); // NOI18N
        btnIngresoProfesional.setText("Soy profesional");
        btnIngresoProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoProfesionalActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresoProfesional);
        btnIngresoProfesional.setBounds(450, 140, 180, 50);

        btnConfiguracion.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vegetables.png"))); // NOI18N
        btnConfiguracion.setText("Registro de alimentos");
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfiguracion);
        btnConfiguracion.setBounds(30, 350, 200, 50);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rsz_nutrition.jpg"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 655, 443);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        Object seleccionRegistro = JOptionPane.showInputDialog(null, "Registrarme como:", "Registro", JOptionPane.QUESTION_MESSAGE, new ImageIcon(getClass().getResource("/imagenes/register.png")), new String[]{"Usuario", "Profesional"}, "Usuario.");
        if (seleccionRegistro != null) {
            String opcion = (String) seleccionRegistro;
            if (opcion.equals("Usuario")) {
                this.setVisible(false);
                VentanaRegistroUsuario ventana = new VentanaRegistroUsuario(modelo);
                ventana.setVisible(true);
            } else {
                this.setVisible(false);
                VentanaRegistroProfesional ventana = new VentanaRegistroProfesional(modelo);
                ventana.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            FileOutputStream file = new FileOutputStream("fooding.app");

            BufferedOutputStream buffer = new BufferedOutputStream(file);

            ObjectOutputStream obj = new ObjectOutputStream(buffer);

            obj.writeObject(modelo);

            obj.flush();
            obj.close();
        } catch (FileNotFoundException ex) {

        } catch (IOException e) {

        }
    }//GEN-LAST:event_formWindowClosing

    private void btnIngresoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoUsuarioActionPerformed
        if (modelo.noHayUsuariosRegistrados()) {
            JOptionPane.showMessageDialog(null, "No hay usuarios registrados.", "Atención", 0, new ImageIcon(getClass().getResource("/imagenes/warning.png")));

        } else {
            VentanaSeleccionUsuario ventana = new VentanaSeleccionUsuario(modelo);
            ventana.setVisible(true);
        }
    }//GEN-LAST:event_btnIngresoUsuarioActionPerformed

    private void btnIngresoProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoProfesionalActionPerformed
        if (modelo.noHayProfesionalesRegistrados()) {
            JOptionPane.showMessageDialog(null, "No hay profesionales registrados.", "Atención", 0, new ImageIcon(getClass().getResource("/imagenes/warning.png")));

        } else {
            VentanaSeleccionProfesional ventana = new VentanaSeleccionProfesional(modelo);
            ventana.setVisible(true);
        }
    }//GEN-LAST:event_btnIngresoProfesionalActionPerformed

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        this.setVisible(false);
        VentanaRegistroAlimento ventana = new VentanaRegistroAlimento(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnConfiguracionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnIngresoProfesional;
    private javax.swing.JButton btnIngresoUsuario;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblFooding;
    // End of variables declaration//GEN-END:variables
}

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

        btnRegistro.setText("Registro");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistro);
        btnRegistro.setBounds(340, 80, 180, 50);

        btnIngresoUsuario.setText("Soy usuario");
        getContentPane().add(btnIngresoUsuario);
        btnIngresoUsuario.setBounds(240, 140, 180, 50);

        btnIngresoProfesional.setText("Soy profesional");
        getContentPane().add(btnIngresoProfesional);
        btnIngresoProfesional.setBounds(450, 140, 180, 50);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rsz_nutrition.jpg"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 655, 443);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        Object seleccionRegistro = JOptionPane.showInputDialog(null, "Registrarme como:", "Registro", JOptionPane.QUESTION_MESSAGE, new ImageIcon(getClass().getResource("/imagenes/avatar.png")), new String[]{"Usuario", "Profesional"}, "Usuario.");
        if (seleccionRegistro != null) {
            String opcion = (String) seleccionRegistro;
            if (opcion.equals("Usuario")) {
                VentanaRegistroUsuario ventana = new VentanaRegistroUsuario(modelo);
                ventana.setVisible(true);
            } else {
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresoProfesional;
    private javax.swing.JButton btnIngresoUsuario;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblFooding;
    // End of variables declaration//GEN-END:variables
}

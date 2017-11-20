package interfaz;

import dominio.Profesional;
import dominio.Sistema;

public class VentanaInbox extends javax.swing.JDialog {

    private Sistema modelo;
    private Profesional profesionalActivo;

    public VentanaInbox(Sistema miSis) {
        initComponents();
        modelo = miSis;
        this.setModal(true);
        this.setLocationRelativeTo(null);
        profesionalActivo = modelo.obtenerSesionActivaProfesional();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

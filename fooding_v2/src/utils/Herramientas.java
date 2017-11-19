package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Herramientas {

    public static String[] obtenerpaises() {
        String[] countries = new String[Locale.getISOCountries().length + 1];
        countries[0] = "N/A";
        String[] countryCodes = Locale.getISOCountries();
        for (int i = 0; i < countryCodes.length; i++) {
            Locale obj = new Locale("", countryCodes[i]);
            countries[i + 1] = obj.getDisplayCountry();
        }
        return countries;

    }

    public static boolean sonLetras(String palabra) {
        return palabra.matches("[a-zA-Z]+");
    }

    public static boolean validarCampo(JTextField campo, JLabel status, JLabel ok, String mensaje) {
        boolean valido = false;
        if (campo.getText().equals("")) {
            status.setText("Campo vacio. Ingrese " + mensaje + ".");
            ok.setIcon(null);
            ok.setText("");
        } else if (!Herramientas.sonLetras(campo.getText())) {
            status.setText("Ingrese únicamente letras");
            ok.setIcon(null);
            ok.setText("");
        } else {
            status.setText("");
            ok.setIcon(new ImageIcon(Herramientas.class.getResource("/imagenes/correcto.png")));
            ok.setText("OK");
            valido = true;
        }
        return valido;
    }

    public static boolean validarCampoFecha(String fecha, JLabel status, JLabel ok) {
        boolean valido = false;
         if (fecha == null) {
            status.setText("La fecha no es válida.");
            ok.setIcon(null);
            ok.setText("");
            System.out.println("error1");
            return false;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        try {
            Date fechaValidacion = dateFormat.parse(fecha);
            status.setText("");
            ok.setIcon(new ImageIcon(Herramientas.class.getResource("/imagenes/correcto.png")));
            ok.setText("OK");
            valido = true;
            System.out.println("ok");

        } catch (ParseException e) {
            status.setText("La fecha no es válida.");
            ok.setIcon(null);
            ok.setText("");
            System.out.println("error2");
        }
        return valido;
    }

}

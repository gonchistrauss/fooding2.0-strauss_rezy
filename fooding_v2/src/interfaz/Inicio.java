package interfaz;

import dominio.Sistema;
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Inicio {

    public static void main(String[] args) throws ParseException {
        Sistema s;
        try {
            FileInputStream file = new FileInputStream("fooding.app");
            BufferedInputStream buffer = new BufferedInputStream(file);
            ObjectInputStream obj = new ObjectInputStream(buffer);
            s = (Sistema) obj.readObject();
        } catch (IOException | ClassNotFoundException e) {
            s = new Sistema();
            System.out.println("Archivo no encontrado");
        }
        MenuPrincipal menu = new MenuPrincipal(s);
        menu.setVisible(true);
    }
}

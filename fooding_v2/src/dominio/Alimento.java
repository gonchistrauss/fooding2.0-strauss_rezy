package dominio;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class Alimento {

    private String nombre;
    private String categoria;
    private HashMap<String, Integer> nutrientes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public HashMap<String, Integer> getNutrientes() {
        return nutrientes;
    }

    public Alimento(String nombre, String categoria, HashMap<String,Integer> nuts) {
        this.setNombre(nombre);
        this.setCategoria(categoria);
        nutrientes = new HashMap<>();
        for (Map.Entry<String,Integer> entry : nuts.entrySet()) {
            nutrientes.put(entry.getKey(), entry.getValue());
        }
    }
}

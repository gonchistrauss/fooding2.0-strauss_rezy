package dominio;

import java.util.Hashtable;

public class Alimento {

    private String nombre;
    private String categoria;
    private Hashtable<String, Integer> nutrientes;

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

    public Hashtable<String, Integer> getNutrientes() {
        return nutrientes;
    }

    public void agregarNutriente(String nutriente, Integer proporcion) {
        this.nutrientes.put(nutriente, proporcion);
    }

    public Alimento(String nombre, String categoria) {
        this.setNombre(nombre);
        this.setCategoria(categoria);
        nutrientes = new Hashtable<>();
    }
}

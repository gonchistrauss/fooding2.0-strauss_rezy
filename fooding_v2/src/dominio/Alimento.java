package dominio;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class Alimento implements Serializable {

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

    public Alimento(String nombre, String categoria, HashMap<String, Integer> nuts) {
        this.setNombre(nombre);
        this.setCategoria(categoria);
        nutrientes = new HashMap<>();
        for (Map.Entry<String, Integer> entry : nuts.entrySet()) {
            nutrientes.put(entry.getKey(), entry.getValue());
        }
    }
    
       @Override
    public boolean equals(Object obj) {
        Alimento a = (Alimento) obj;
        return this.getNombre().equalsIgnoreCase(a.getNombre())
                && this.getCategoria().equalsIgnoreCase(a.getCategoria());
    }


    @Override
    public String toString() {
        String res = "Nombre: " + this.getNombre() + " - Categoria: " + this.getCategoria();
        if (!this.getNutrientes().isEmpty()) {
            res += " - Nutrientes: ";
            for (Map.Entry<String, Integer> entry : this.getNutrientes().entrySet()) {
                res += entry.getKey() + ",";
            }
            res = res.substring(0, res.length() - 1);
        }
        return res;
    }
}

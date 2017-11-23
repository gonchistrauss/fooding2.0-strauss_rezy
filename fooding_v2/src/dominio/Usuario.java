package dominio;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import utils.Tipos.Categoria;

public class Usuario extends Persona implements Serializable {

    //Atributos Usuario
    private ArrayList<Consulta> consultas;
    private Locale nacionalidad;
    private ArrayList<Alimento> preferencias;
    private ArrayList<Alimento> restricciones;
    private HashMap<String, ArrayList<Alimento>> alimentosIngeridos;

    public ArrayList<Alimento> getPreferencias() {
        return preferencias;
    }

    public HashMap<String, ArrayList<Alimento>> getAlimentosIngs() {
        return alimentosIngeridos;
    }

    public void agregarAlimentosIngeridos(ArrayList<Alimento> ingeridos, String fecha) {
        alimentosIngeridos.put(fecha, ingeridos);
    }

    public ArrayList<Alimento> getRestricciones() {
        return restricciones;
    }

    public void agregarRestriccion(ArrayList<Alimento> nuevosAlimentos) {
        for (Alimento alimento : nuevosAlimentos) {
            restricciones.add(alimento);
        }
    }

    public void agregarPreferencia(ArrayList<Alimento> nuevosAlimentos) {
        for (Alimento alimento : nuevosAlimentos) {
            preferencias.add(alimento);
        }
    }

    public Locale getNacionalidad() {
        return nacionalidad;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setNacionalidad(String countryCode) {
        this.nacionalidad = new Locale("", countryCode);
    }

    public Usuario(String nombre, String apellidos, String pais, Date nacimiento, String pathPerfil) {
        super(nombre, apellidos, nacimiento, pathPerfil);
        this.setNacionalidad(pais);
        restricciones = new ArrayList<Alimento>();
        preferencias = new ArrayList<Alimento>();
        consultas = new ArrayList<Consulta>();
        alimentosIngeridos = new HashMap<String, ArrayList<Alimento>>();
    }

    public Usuario() {
        super("nombre", "apellido", new Date(), "pathPerfil");
        this.setNacionalidad("nacionalidad");
        restricciones = new ArrayList<Alimento>();
        preferencias = new ArrayList<Alimento>();
        consultas = new ArrayList<Consulta>();
        alimentosIngeridos = new HashMap<String, ArrayList<Alimento>>();
    }

    public void agregarConsulta(Categoria categoria) {
        Consulta nuevaConsulta = new Consulta(this, categoria);
        this.getConsultas().add(nuevaConsulta);
    }
    
    public void eliminarConsulta(Consulta unaConsulta){
        int index = this.getConsultas().indexOf(unaConsulta);
        this.getConsultas().remove(index);
    }

    @Override
    public boolean equals(Object obj) {
        Usuario unU = (Usuario) obj;
        return this.getNombre().equals(unU.getNombre())
                && this.getApellidos().equals(unU.getApellidos())
                && this.getFechaDeNacimiento().equals(unU.getFechaDeNacimiento());
    }

    //Metodo toString
    @Override
    public String toString() {
        return this.getNombre() + " " + this.getApellidos();
    }

}

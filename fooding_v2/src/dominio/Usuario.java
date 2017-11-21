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
    private ArrayList<Alimento> alimentosIngeridos;
    private ArrayList<Alimento> restricciones;
    private HashMap<Date, ArrayList<Alimento>> alimentosIngs;

    public ArrayList<Alimento> getAlimentosIngeridos() {
        return alimentosIngeridos;
    }

    public ArrayList<Alimento> getRestricciones() {
        return restricciones;
    }

    public void agregarAlimento(Alimento nuevoAlimento) {
        this.alimentosIngeridos.add(nuevoAlimento);
    }

    public void agregarRestriccion(Alimento nuevaRestriccion) {
        this.restricciones.add(nuevaRestriccion);
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
        alimentosIngeridos = new ArrayList<Alimento>();
        restricciones = new ArrayList<Alimento>();
        consultas = new ArrayList<Consulta>();
    }

    public void agregarConsulta(Categoria categoria) {
        Consulta nuevaConsulta = new Consulta(this, categoria);
        nuevaConsulta.setId(this.getConsultas().size() + 1);
        this.getConsultas().add(nuevaConsulta);
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

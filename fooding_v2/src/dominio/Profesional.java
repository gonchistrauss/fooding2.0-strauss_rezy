package dominio;

import java.util.*;
import java.io.Serializable;
import utils.Tipos.Categoria;

public class Profesional extends Persona implements Serializable {

    private String tituloProfesional;
    private Date fechaDeGraduacion;
    private Locale paisEstudio;
    private ArrayList<Consulta> inbox;

    public String getTituloProfesional() {
        return tituloProfesional;
    }

    public void setTituloProfesional(String tituloProfesional) {
        this.tituloProfesional = tituloProfesional;
    }

    public Date getFechaDeGraduacion() {
        return fechaDeGraduacion;
    }

    public void setFechaDeGraduacion(Date fechaDeGraduacion) {
        this.fechaDeGraduacion = fechaDeGraduacion;
    }

    public Locale getPaisEstudio() {
        return paisEstudio;
    }

    public void setPaisEstudio(String countryCode) {
        this.paisEstudio = new Locale("", countryCode);
    }

    public ArrayList<Consulta> getInbox() {
        return inbox;
    }

    public void agregarEnInbox(Consulta nuevaConsulta) {
        this.getInbox().add(nuevaConsulta);
    }

    public Profesional(String nombre, String apellidos,
            Date nacimiento, String pathPerfil, String titulo, Date fechaGrad,
            String paisEstudio,ArrayList<Consulta> consultasPendientes) {
        super(nombre, apellidos, nacimiento, pathPerfil);
        this.setFechaDeGraduacion(fechaGrad);
        this.setPaisEstudio(paisEstudio);
        this.setTituloProfesional(titulo);
        inbox = new ArrayList<Consulta>();
        for (Consulta consulta: consultasPendientes) {
            this.getInbox().add(consulta);
        }
    }
    
    public Profesional(){
        super("N/A","",new Date(),"N/A");
        this.setFechaDeGraduacion(new Date());
        this.setPaisEstudio(Locale.CANADA.getCountry());
        this.setTituloProfesional("N/A");
    }
    
    public void eliminarEnInbox(Consulta unaConsulta){
        int index = this.getInbox().indexOf(unaConsulta);
        this.getInbox().remove(index);
    }

    public ArrayList<Consulta> misConsultas() {
        ArrayList<Consulta> lista = new ArrayList<Consulta>();
        for (Consulta consulta : this.getInbox()) {
            if (consulta.getProfesional().equals(this)) {
                lista.add(consulta);
            }
        }
        return lista;
    }

    @Override
    public boolean equals(Object obj) {
        Profesional unP = (Profesional) obj;
        return this.getNombre().equals(unP.getNombre())
                && this.getApellidos().equals(unP.getApellidos())
                && this.getFechaDeNacimiento().equals(unP.getFechaDeNacimiento());
    } 

    //Metodo toString
    @Override
    public String toString() {
        return this.getNombre() + " " + this.getApellidos();
    }
}

package dominio;

import java.util.ArrayList;
import utils.Tipos.*;

public class Consulta {

    private int id;
    private Usuario usuario;
    private Profesional profesional;
    private Estado estado;
    private ArrayList<Incidencia> listaIncidencias;
    private Categoria categoria;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public ArrayList<Incidencia> getListaIncidencias() {
        return listaIncidencias;
    }

    public void agregarIncidencia(Incidencia nuevaIncidencia) {
        this.listaIncidencias.add(nuevaIncidencia);
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public Consulta(Usuario unUsuario, Categoria unaCategoria) {
        this.setUsuario(unUsuario);
        this.setEstado(Estado.PENDIENTE);
        this.setCategoria(unaCategoria);
        listaIncidencias = new ArrayList<Incidencia>();
    }
    
    public String toStringDescripcion(){
        return "Categoria: " + this.getCategoria().name() + " - Usuario: " + this.getUsuario() + " - Profesional: " + this.getProfesional() + " - Estado: " + this.getEstado().name();
    }
    
       //Metodo toString
    @Override
    public String toString() {
       String consulta = "";
       for(Incidencia incidencia : this.getListaIncidencias()){
           consulta += incidencia.toString() + "\n *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n";
       }
       return consulta;
    }
}

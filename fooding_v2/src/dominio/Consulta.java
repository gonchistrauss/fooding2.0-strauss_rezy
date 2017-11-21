package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import utils.Tipos.*;

public class Consulta implements Serializable {

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

    public void agregarIncidencia(String mensaje, String fecha, Persona creador) {
        Incidencia nuevaIncidencia = new Incidencia(mensaje, fecha, this, creador);
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
        profesional = new Profesional();
        listaIncidencias = new ArrayList<Incidencia>();
    }

    public String toStringDescripcion() {
        String res = "Categoria: " + this.getCategoria().name() + " - Estado: "
                + this.getEstado().name() + " - Usuario: "
                + this.getUsuario().getNombre().toUpperCase() + " "
                + this.getUsuario().getApellidos().toUpperCase()
                + " - Profesional: ";
        if (this.getProfesional() == null) {
            res += "N/A";
        } else {
            res += this.getProfesional().getNombre() + " "
                    + this.getProfesional().getApellidos();

        }
        return res;
    }

    @Override
    public boolean equals(Object obj) {
        Consulta unaC = (Consulta) obj;
        return this.getId() == unaC.getId()
                && this.getProfesional().equals(unaC.getProfesional())
                && this.getUsuario().equals(unaC.getUsuario());
    }

    //Metodo toString
    @Override
    public String toString() {
        String consulta = "Tipo: " + this.getCategoria().toString() + "\n";
        for (Incidencia incidencia : this.getListaIncidencias()) {
            consulta += incidencia.toString() + "\n *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n";
        }
        return consulta;
    }
}

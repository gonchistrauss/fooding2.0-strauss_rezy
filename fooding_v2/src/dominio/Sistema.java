package dominio;

import utils.Tipos.*;
import java.io.Serializable;
import java.util.*;

public class Sistema implements Serializable {

    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Profesional> listaProfesionales;
    private ArrayList<Alimento> listaAlimentos;
    private ArrayList<Consulta> listaConsultasDirectasPendientes;
    private ArrayList<Consulta> listaPlanAlimenticioPendientes;

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public ArrayList<Profesional> getListaProfesionales() {
        return listaProfesionales;
    }

    public ArrayList<Alimento> getListaAlimentos() {
        return listaAlimentos;
    }

    public ArrayList<Consulta> getListaConsultasDirectasPendientes() {
        return listaConsultasDirectasPendientes;
    }

    public ArrayList<Consulta> getListaPlanAlimenticioPendientes() {
        return listaPlanAlimenticioPendientes;
    }

    public boolean noHayUsuariosRegistrados() {
        return this.getListaUsuarios().isEmpty();
    }

    public boolean noHayProfesionalesRegistrados() {
        return this.getListaProfesionales().isEmpty();
    }

    public Sistema() {
        listaUsuarios = new ArrayList<Usuario>();
        listaProfesionales = new ArrayList<Profesional>();
        listaAlimentos = new ArrayList<Alimento>();
        listaConsultasDirectasPendientes = new ArrayList<Consulta>();
        listaPlanAlimenticioPendientes = new ArrayList<Consulta>();
    }

    public void agregarUsuario(String nombre, String apellidos, String nacionalidad, Date nacimiento, String pathPerfil) {
        Usuario nuevoUsuario = new Usuario(nombre, apellidos, nacionalidad, nacimiento, pathPerfil);
        this.getListaUsuarios().add(nuevoUsuario);
    }

    public void agregarProfesional(String nombre, String apellidos, Date nacimiento, String pathPerfil, String titulo, String paisTitulo, Date fechaGrad) {
        Profesional nuevoProfesional = new Profesional(nombre, apellidos, nacimiento, pathPerfil, titulo, fechaGrad, paisTitulo);
        this.getListaProfesionales().add(nuevoProfesional);
    }

    public void agregarAlimento(String nombre, String familia, ArrayList<String> nutrientes) {
        Alimento nuevoAlimento = new Alimento(nombre, familia);
        this.getListaAlimentos().add(nuevoAlimento);

    }

    public void cargarConsultasPendientes() {
        for (Usuario usuario : this.getListaUsuarios()) {
            for (Consulta consulta : usuario.getConsultas()) {
                if (consulta.getEstado() == Estado.PENDIENTE) {
                    if (consulta.getCategoria() == Categoria.DIRECTA) {
                        this.getListaConsultasDirectasPendientes().add(consulta);
                    } else {
                        this.getListaPlanAlimenticioPendientes().add(consulta);
                    }
                }
            }
        }
    }

    public Usuario obtenerSesionActivaUsuario() {
        for (Usuario usuario : this.getListaUsuarios()) {
            if (usuario.esSesionActiva()) {
                return usuario;
            }
        }
        return null;
    }

    public Profesional obtenerSesionActivaProfesional() {
        for (Profesional profesional : this.getListaProfesionales()) {
            if (profesional.esSesionActiva()) {
                return profesional;
            }
        }
        return null;
    }

    public Usuario obtenerUsuario(Usuario unUsuario) {
        for (Usuario usuario : this.getListaUsuarios()) {
            if (usuario.equals((Usuario) unUsuario)) {
                return usuario;
            }
        }
        return null;
    }
}

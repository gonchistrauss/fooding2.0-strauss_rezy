package dominio;

import java.io.Serializable;
import java.util.*;
import utils.Tipos.Categoria;

public abstract class Persona implements Serializable {

    //Atributos de Persona
    private String nombre;
    private String apellidos;
    private Date fechaDeNacimiento;
    private String pathPerfil;
    private boolean sesionActiva;
    //private String mail;

       
    public boolean esSesionActiva() {
        return sesionActiva;
    }

    public void setSesionActiva(boolean sesionActiva) {
        this.sesionActiva = sesionActiva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getPathPerfil() {
        return pathPerfil;
    }

    public void setPathPerfil(String perfil) {
        this.pathPerfil = perfil;
    }

    public Persona(String nombre, String apellidos, Date fechaDeNacimiento, String perfil) {
        this.setNombre(nombre);
        this.setApellidos(apellidos);
        this.setFechaDeNacimiento(fechaDeNacimiento);
        this.setPathPerfil(perfil);
        this.setSesionActiva(false);
    }

    public Persona() {
        this.setNombre("");
        this.setApellidos("");
        this.fechaDeNacimiento = new Date();
        this.setPathPerfil("/imagenes/avatar.png");
        this.setSesionActiva(false);
    }

}

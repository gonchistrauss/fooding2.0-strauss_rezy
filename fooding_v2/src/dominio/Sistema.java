package dominio;

import utils.Tipos.*;
import java.io.Serializable;
import java.util.*;

public class Sistema implements Serializable {

    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Profesional> listaProfesionales;
    private ArrayList<Alimento> listaAlimentos;
    private ArrayList<Consulta> listaConsultas;

    public ArrayList<Consulta> getListaConsultas() {
        return listaConsultas;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public ArrayList<Profesional> getListaProfesionales() {
        return listaProfesionales;
    }

    public ArrayList<Alimento> getListaAlimentos() {
        return listaAlimentos;
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
        listaConsultas = new ArrayList<Consulta>();
    }

    public void agregarUsuario(String nombre, String apellidos, String nacionalidad, Date nacimiento, String pathPerfil) {
        Usuario nuevoUsuario = new Usuario(nombre, apellidos, nacionalidad, nacimiento, pathPerfil);
        this.getListaUsuarios().add(nuevoUsuario);
    }

    public void agregarProfesional(String nombre, String apellidos, Date nacimiento, String pathPerfil, String titulo, String paisTitulo, Date fechaGrad) {
        ArrayList<Consulta> consultasPendientes = this.filtrarPorPendiente(this.getListaConsultas());
        Profesional nuevoProfesional = new Profesional(nombre, apellidos, nacimiento, pathPerfil, titulo, fechaGrad, paisTitulo, (ArrayList<Consulta>) consultasPendientes.clone());
        this.getListaProfesionales().add(nuevoProfesional);
    }

    public void agregarAlimento(String nombre, String familia, HashMap<String, Integer> nutrientes) {
        Alimento nuevoAlimento = new Alimento(nombre, familia, nutrientes);
        this.getListaAlimentos().add(nuevoAlimento);
    }

    public String parsearListasAPlanDeAlimentacion(ArrayList<Alimento> lunes,
            ArrayList<Alimento> martes, ArrayList<Alimento> miercoles,
            ArrayList<Alimento> jueves, ArrayList<Alimento> viernes,
            ArrayList<Alimento> sabado, ArrayList<Alimento> domingo) {
        String res = " *** Plan de Alimentacion sugerido *** \n";
        res += alimentosEnDia(lunes, "lunes");
        res += alimentosEnDia(martes, "martes");
        res += alimentosEnDia(miercoles, "miercoles");
        res += alimentosEnDia(jueves, "jueves");
        res += alimentosEnDia(viernes, "viernes");
        res += alimentosEnDia(sabado, "sabado");
        res += alimentosEnDia(domingo, "domingo");
        return res;
    }

    public String alimentosEnDia(ArrayList<Alimento> unDia, String dia) {
        String res = " (*) Dia " + dia + ": \n";
        if (unDia.isEmpty()) {
            res += "           No hay comidas registradas para este dia. \n";
        } else {
            for (Alimento alimento : unDia) {
                res += "       - " + alimento.toString() + " \n";
            }
        }
        return res;
    }

    public void agregarConsulta(Consulta nuevaConsulta) {
        listaConsultas.add(nuevaConsulta);
        nuevaConsulta.setId(listaConsultas.size());
        for (Profesional profesional : this.getListaProfesionales()) {
            profesional.agregarEnInbox(nuevaConsulta);
        }
    }

    public ArrayList<String> consultasPorDescripcion(ArrayList<Consulta> lista) {
        ArrayList<String> consultasDescripcion = new ArrayList<>();
        for (Consulta consulta : lista) {
            consultasDescripcion.add(consulta.toStringDescripcion());
        }
        return consultasDescripcion;
    }

    public ArrayList<Consulta> filtrarPorDirecta(ArrayList<Consulta> lista) {
        ArrayList<Consulta> directas = new ArrayList<>();
        for (Consulta consulta : lista) {
            if (consulta.getCategoria() == Categoria.DIRECTA) {
                directas.add(consulta);
            }
        }
        return directas;
    }

    public ArrayList<Consulta> filtrarPorPlan(ArrayList<Consulta> lista) {
        ArrayList<Consulta> plan = new ArrayList<>();
        for (Consulta consulta : lista) {
            if (consulta.getCategoria() == Categoria.PLAN_ALIMENTICIO) {
                plan.add(consulta);
            }
        }
        return plan;
    }

    public ArrayList<Consulta> filtrarPorCompletado(ArrayList<Consulta> lista) {
        ArrayList<Consulta> completados = new ArrayList<>();
        for (Consulta consulta : lista) {
            if (consulta.getEstado() == Estado.COMPLETADO) {
                completados.add(consulta);
            }
        }
        return completados;
    }

    public ArrayList<Consulta> filtrarPorPendiente(ArrayList<Consulta> lista) {
        ArrayList<Consulta> pendientes = new ArrayList<>();
        for (Consulta consulta : lista) {
            if (consulta.getEstado() == Estado.PENDIENTE) {
                pendientes.add(consulta);
            }
        }
        return pendientes;
    }

    public ArrayList<Consulta> filtrarPorEnProceso(ArrayList<Consulta> lista) {
        ArrayList<Consulta> enProceso = new ArrayList<>();
        for (Consulta consulta : lista) {
            if (consulta.getEstado() == Estado.EN_PROCESO) {
                enProceso.add(consulta);
            }
        }
        return enProceso;
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

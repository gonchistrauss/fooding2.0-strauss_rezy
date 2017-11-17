package dominio;

import java.util.Date;

public class Incidencia {

    private String mensaje;
    private Date fechaDeCreacion;
    private Persona creador;
    private Consulta consulta;

    public Persona getCreador() {
        return creador;
    }

    public void setCreador(Persona creador) {
        this.creador = creador;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public Incidencia(String mensaje, Date fecha, Consulta unaConsulta, Persona unCreador) {
        this.setConsulta(unaConsulta);
        this.setMensaje(mensaje);
        this.setFechaDeCreacion(fecha);
        this.setCreador(unCreador);
    }
    
       //Metodo toString
    @Override
    public String toString() {
        return "Fecha: " + this.getFechaDeCreacion() + "\n"
                + "Origen: " + this.getCreador() + "\n" 
                + "Descripción:" + this.getMensaje();
    }
}

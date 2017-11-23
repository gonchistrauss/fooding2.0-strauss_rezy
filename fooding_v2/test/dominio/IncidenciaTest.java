/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.Tipos;
import utils.Tipos.Categoria;

/**
 *
 * @author gonzalostrauss
 */
public class IncidenciaTest {

    private Incidencia instance;

    public IncidenciaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        Usuario unUsuario = new Usuario();
        Consulta unaConsulta = new Consulta(unUsuario, Categoria.DIRECTA);
        instance = new Incidencia("Hola", "22/11/2017 09:31", unaConsulta, unUsuario);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getCreador method, of class Incidencia.
     */
    @Test
    public void testGetCreador() {
        Persona expResult = new Usuario();
        Persona result = instance.getCreador();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCreador method, of class Incidencia.
     */
    @Test
    public void testSetCreador() {
        Persona creador = new Usuario();
        creador.setNombre("Lucas");
        instance.setCreador(creador);
        assertEquals(instance.getCreador(), creador);
    }

    /**
     * Test of getMensaje method, of class Incidencia.
     */
    @Test
    public void testGetMensaje() {
        String expResult = "Hola";
        String result = instance.getMensaje();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMensaje method, of class Incidencia.
     */
    @Test
    public void testSetMensaje() {
        String mensaje = "Chau";
        instance.setMensaje(mensaje);
        assertEquals(mensaje, instance.getMensaje());
    }

    /**
     * Test of getFechaDeCreacion method, of class Incidencia.
     */
    @Test
    public void testGetFechaDeCreacion() {
        String expResult = "22/11/2017 09:31";
        String result = instance.getFechaDeCreacion();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFechaDeCreacion method, of class Incidencia.
     */
    @Test
    public void testSetFechaDeCreacion() {
        String fechaDeCreacion = "19/3/2016";
        instance.setFechaDeCreacion(fechaDeCreacion);
        assertEquals(instance.getFechaDeCreacion(), fechaDeCreacion);
    }

    /**
     * Test of getConsulta method, of class Incidencia.
     */
    @Test
    public void testGetConsulta() {
        Consulta expResult = new Consulta((Usuario) instance.getCreador(), Categoria.DIRECTA);
        Consulta result = instance.getConsulta();
        assertEquals(expResult, result);
    }

    /**
     * Test of setConsulta method, of class Incidencia.
     */
    @Test
    public void testSetConsulta() {
        Consulta consulta = new Consulta((Usuario) instance.getCreador(), Categoria.PLAN_ALIMENTICIO);
        instance.setConsulta(consulta);
        assertEquals(consulta,instance.getConsulta());
    }

    /**
     * Test of toString method, of class Incidencia.
     */
    @Test
    public void testToString() {
        String expResult = "Fecha: " + instance.getFechaDeCreacion() + "\n"
                + "Origen: " + instance.getCreador() + "\n" 
                + "Mensaje: " + instance.getMensaje();
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}

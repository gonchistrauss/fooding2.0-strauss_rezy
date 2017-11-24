/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import java.util.Date;
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
public class ConsultaTest {

    Consulta instance;

    public ConsultaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Consulta(new Usuario(),Categoria.DIRECTA);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Consulta.
     */
    @Test
    public void testGetId() {
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Consulta.
     */
    @Test
    public void testSetId() {
        int id = 10;
        instance.setId(id);
        assertEquals(instance.getId(),id);
    }

    /**
     * Test of getUsuario method, of class Consulta.
     */
    @Test
    public void testGetUsuario() {
        Usuario result = instance.getUsuario();
        Usuario usuarioAux = new Usuario();
        assertEquals(usuarioAux, result);
    }

    /**
     * Test of setUsuario method, of class Consulta.
     */
    @Test
    public void testSetUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Jorge");
        usuario.setApellidos("Gutierrez");
        instance.setUsuario(usuario);
        assertEquals(instance.getUsuario(),usuario);
    }

    /**
     * Test of getProfesional method, of class Consulta.
     */
    @Test
    public void testGetProfesional() {
        Profesional expResult = new Profesional();
        Profesional result = instance.getProfesional();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProfesional method, of class Consulta.
     */
    @Test
    public void testSetProfesional() {
        Profesional profesional = new Profesional();
        profesional.setApellidos("Perez");
        profesional.setPaisEstudio("Uruguay");
        instance.setProfesional(profesional);
        assertEquals(profesional,instance.getProfesional());
    }

    /**
     * Test of getEstado method, of class Consulta.
     */
    @Test
    public void testGetEstado() {
        Tipos.Estado expResult = Tipos.Estado.PENDIENTE;
        Tipos.Estado result = instance.getEstado();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEstado method, of class Consulta.
     */
    @Test
    public void testSetEstado() {
        Tipos.Estado estado = Tipos.Estado.EN_PROCESO;
        instance.setEstado(estado);
        assertEquals(instance.getEstado(),estado);
    }

    /**
     * Test of getListaIncidencias method, of class Consulta.
     */
    @Test
    public void testGetListaIncidencias() {
        ArrayList<Incidencia> expResult = new ArrayList<>();
        Incidencia incidencia = new Incidencia("Hola","22-11-2017",instance,instance.getUsuario());
        expResult.add(incidencia);
        instance.agregarIncidencia("Hola","22-11-2017",instance.getUsuario());
        ArrayList<Incidencia> result = instance.getListaIncidencias();
        assertEquals(incidencia, result);
    }

    /**
     * Test of agregarIncidencia method, of class Consulta.
     */
    @Test
    public void testAgregarIncidencia() {
        String mensaje = "hola";
        String fecha = "22-11-2017";
        Persona creador = instance.getUsuario();
        instance.agregarIncidencia(mensaje, fecha, creador);
        int nroIncidenciasExp = 1;
        assertEquals(nroIncidenciasExp,instance.getListaIncidencias().size());
    }

    /**
     * Test of getCategoria method, of class Consulta.
     */
    @Test
    public void testGetCategoria() {
        Tipos.Categoria expResult = Categoria.DIRECTA;
        Tipos.Categoria result = instance.getCategoria();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCategoria method, of class Consulta.
     */
    @Test
    public void testSetCategoria() {
        Tipos.Categoria categoria = Categoria.PLAN_ALIMENTICIO;
        instance.setCategoria(categoria);
        assertEquals(categoria,instance.getCategoria());
    }

    /**
     * Test of toStringDescripcion method, of class Consulta.
     */
    @Test
    public void testToStringDescripcion() {
        String expResult = "Categoria: DIRECTA - Estado: PENDIENTE - Usuario: NOMBRE APELLIDO - Profesional: N/A ";
        String result = instance.toStringDescripcion();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Consulta.
     */
    @Test
    public void testEquals() {
        Consulta consultaAux = new Consulta(new Usuario(),Categoria.DIRECTA);
        assertEquals(consultaAux.getId() == instance.getId() 
                && consultaAux.getUsuario().equals(instance.getUsuario())
                && consultaAux.getProfesional().equals(instance.getProfesional()),consultaAux.equals(instance));
    }

    /**
     * Test of toString method, of class Consulta.
     */
    @Test
    public void testToString() {
        String expResult = "Tipo: " + Tipos.Categoria.DIRECTA.toString() + "\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}

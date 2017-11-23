/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
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
public class ProfesionalTest {

    private Profesional instance;

    public ProfesionalTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Profesional();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getTituloProfesional method, of class Profesional.
     */
    @Test
    public void testGetTituloProfesional() {
        String expResult = "N/A";
        String result = instance.getTituloProfesional();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTituloProfesional method, of class Profesional.
     */
    @Test
    public void testSetTituloProfesional() {
        String tituloProfesional = "Ingeniero";
        instance.setTituloProfesional(tituloProfesional);
        assertEquals(instance.getTituloProfesional(), tituloProfesional);
    }

    /**
     * Test of getFechaDeGraduacion method, of class Profesional.
     */
    @Test
    public void testGetFechaDeGraduacion() {
        Date expResult = new Date();
        Date result = instance.getFechaDeGraduacion();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFechaDeGraduacion method, of class Profesional.
     */
    @Test
    public void testSetFechaDeGraduacion() {
        Date fechaDeGraduacion = new Date();
        instance.setFechaDeGraduacion(fechaDeGraduacion);
        assertEquals(fechaDeGraduacion, instance.getFechaDeGraduacion());
    }

    /**
     * Test of getPaisEstudio method, of class Profesional.
     */
    @Test
    public void testGetPaisEstudio() {
        Locale expResult = new Locale("", "Uruguay");
        instance.setPaisEstudio("Uruguay");
        Locale result = instance.getPaisEstudio();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPaisEstudio method, of class Profesional.
     */
    @Test
    public void testSetPaisEstudio() {
        String countryCode = "Uruguay";
        instance.setPaisEstudio(countryCode);
        String expRes = new Locale("", "Uruguay").getCountry();
        assertEquals(expRes, instance.getPaisEstudio().getCountry());
    }

    /**
     * Test of getInbox method, of class Profesional.
     */
    @Test
    public void testGetInbox() {
        Consulta c = new Consulta(new Usuario(),Categoria.DIRECTA);
        ArrayList<Consulta> expResult = new ArrayList<>();
        expResult.add(c);
        instance.getInbox().add(c);
        ArrayList<Consulta> result = instance.getInbox();
        assertEquals(expResult.get(0), c);
    }

    /**
     * Test of agregarEnInbox method, of class Profesional.
     */
    @Test
    public void testAgregarEnInbox() {
        Consulta nuevaConsulta = new Consulta(new Usuario(),Categoria.DIRECTA);
        int expRes = instance.getInbox().size() + 1;
        instance.agregarEnInbox(nuevaConsulta);
        assertEquals(instance.getInbox().size(),expRes);
    }

    /**
     * Test of eliminarEnInbox method, of class Profesional.
     */
    @Test
    public void testEliminarEnInbox() {
        Consulta unaConsulta = new Consulta(new Usuario(),Categoria.DIRECTA);
        instance.getInbox().add(unaConsulta);
        int expRes = instance.getInbox().size() - 1;
        instance.eliminarEnInbox(unaConsulta);
        assertEquals(expRes,instance.getInbox().size());
    }

    /**
     * Test of misConsultas method, of class Profesional.
     */
    @Test
    public void testMisConsultas() {
        ArrayList<Consulta> expResult = new ArrayList<>();
        Consulta c1 = new Consulta(new Usuario(),Categoria.DIRECTA);
        c1.setProfesional(instance);
        instance.agregarEnInbox(c1);
        Consulta c2 = new Consulta(new Usuario(),Categoria.DIRECTA);
        expResult.add(c1);
        ArrayList<Consulta> result = instance.misConsultas();
        assertEquals(expResult, result);
    }

      @Test
    public void testEquals() {
        Profesional pAux = new Profesional();
        Profesional pAux2 = new Profesional();
        assertTrue(pAux.equals(pAux2));
    }
    
    @Test
    public void testEquals2() {
        Profesional pAux = new Profesional();
        Profesional pAux2 = new Profesional();
        pAux2.setNombre("Gerardo");
        assertFalse(pAux.equals(pAux2));
    }


    /**
     * Test of toString method, of class Profesional.
     */
    @Test
    public void testToString() {
        String expResult = "N/A ";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}

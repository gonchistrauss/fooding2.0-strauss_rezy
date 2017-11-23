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
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTituloProfesional method, of class Profesional.
     */
    @Test
    public void testGetTituloProfesional() {
        System.out.println("getTituloProfesional");
        Profesional instance = new Profesional();
        String expResult = "";
        String result = instance.getTituloProfesional();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTituloProfesional method, of class Profesional.
     */
    @Test
    public void testSetTituloProfesional() {
        System.out.println("setTituloProfesional");
        String tituloProfesional = "";
        Profesional instance = new Profesional();
        instance.setTituloProfesional(tituloProfesional);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaDeGraduacion method, of class Profesional.
     */
    @Test
    public void testGetFechaDeGraduacion() {
        System.out.println("getFechaDeGraduacion");
        Profesional instance = new Profesional();
        Date expResult = null;
        Date result = instance.getFechaDeGraduacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaDeGraduacion method, of class Profesional.
     */
    @Test
    public void testSetFechaDeGraduacion() {
        System.out.println("setFechaDeGraduacion");
        Date fechaDeGraduacion = null;
        Profesional instance = new Profesional();
        instance.setFechaDeGraduacion(fechaDeGraduacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPaisEstudio method, of class Profesional.
     */
    @Test
    public void testGetPaisEstudio() {
        System.out.println("getPaisEstudio");
        Profesional instance = new Profesional();
        Locale expResult = null;
        Locale result = instance.getPaisEstudio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaisEstudio method, of class Profesional.
     */
    @Test
    public void testSetPaisEstudio() {
        System.out.println("setPaisEstudio");
        String countryCode = "";
        Profesional instance = new Profesional();
        instance.setPaisEstudio(countryCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInbox method, of class Profesional.
     */
    @Test
    public void testGetInbox() {
        System.out.println("getInbox");
        Profesional instance = new Profesional();
        ArrayList<Consulta> expResult = null;
        ArrayList<Consulta> result = instance.getInbox();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarEnInbox method, of class Profesional.
     */
    @Test
    public void testAgregarEnInbox() {
        System.out.println("agregarEnInbox");
        Consulta nuevaConsulta = null;
        Profesional instance = new Profesional();
        instance.agregarEnInbox(nuevaConsulta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarEnInbox method, of class Profesional.
     */
    @Test
    public void testEliminarEnInbox() {
        System.out.println("eliminarEnInbox");
        Consulta unaConsulta = null;
        Profesional instance = new Profesional();
        instance.eliminarEnInbox(unaConsulta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of misConsultas method, of class Profesional.
     */
    @Test
    public void testMisConsultas() {
        System.out.println("misConsultas");
        Profesional instance = new Profesional();
        ArrayList<Consulta> expResult = null;
        ArrayList<Consulta> result = instance.misConsultas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Profesional.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Profesional instance = new Profesional();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Profesional.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Profesional instance = new Profesional();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

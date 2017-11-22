/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.HashMap;
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
public class AlimentoTest {

    private Alimento instance;

    public AlimentoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        HashMap<String, Integer> nutrientes = new HashMap<String, Integer>();
        nutrientes.put("Harina", 50);
        nutrientes.put("Salsa de tomate", 25);
        nutrientes.put("Queso", 20);
        nutrientes.put("Levadura", 2);
        nutrientes.put("Sal", 2);
        nutrientes.put("Agua", 1);
        instance = new Alimento("Pizza", "Panes", nutrientes);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getNombre method, of class Alimento.
     */
    @Test
    public void testGetNombre() {
        String expResult = "Pizza";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Alimento.
     */
    @Test
    public void testSetNombre() {
        String nombre = "Hamburguesa";
        instance.setNombre(nombre);
        assertEquals(nombre, instance.getNombre());
    }

    /**
     * Test of getCategoria method, of class Alimento.
     */
    @Test
    public void testGetCategoria() {
        String expResult = "Panes";
        String result = instance.getCategoria();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCategoria method, of class Alimento.
     */
    @Test
    public void testSetCategoria() {
        String categoria = "Carnes";
        instance.setCategoria(categoria);
        assertEquals(categoria, instance.getCategoria());
    }

    /**
     * Test of getNutrientes method, of class Alimento.
     */
    @Test
    public void testGetNutrientes() {
        HashMap<String, Integer> nutrientes = new HashMap<>();
        nutrientes.put("Harina", 50);
        nutrientes.put("Salsa de tomate", 25);
        nutrientes.put("Queso", 20);
        nutrientes.put("Levadura", 2);
        nutrientes.put("Sal", 2);
        nutrientes.put("Agua", 1);
        HashMap<String, Integer> result = instance.getNutrientes();
        assertEquals(nutrientes, result);
    }

    /**
     * Test of equals method, of class Alimento.
     */
    @Test
    public void testEquals() {
        HashMap<String, Integer> nutrientes = new HashMap<String, Integer>();
        nutrientes.put("Queso", 40);
        nutrientes.put("Aceitunas", 35);
        nutrientes.put("Harina", 13);
        nutrientes.put("Grasa", 2);
        nutrientes.put("Sal", 2);
        nutrientes.put("Agua", 7);
        Alimento alimentoAux = new Alimento("Pizza", "Panes", nutrientes);
        assertEquals(alimentoAux.getNombre().equals(instance.getNombre())
                && alimentoAux.getCategoria().equals(instance.getCategoria()),
                instance.equals(alimentoAux));
    }

    /**
     * Test of toString method, of class Alimento.
     */
    @Test
    public void testToString() {
        String expResult = "Nombre: Pizza - Categoria: Panes - Nutrientes: Queso,Levadura,Harina,Salsa de tomate,Agua,Sal";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}

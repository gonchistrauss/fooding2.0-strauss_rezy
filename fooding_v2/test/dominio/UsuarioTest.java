package dominio;

import java.util.ArrayList;
import java.util.HashMap;
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
public class UsuarioTest {

    private Usuario instance;

    public UsuarioTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Usuario();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getPreferencias method, of class Usuario.
     */
    @Test
    public void testGetPreferencias() {
        ArrayList<Alimento> expResult = new ArrayList<>();
        expResult.add(new Alimento("Asado", "Carne", new HashMap<String, Integer>()));
        instance.getPreferencias().add(new Alimento("Asado", "Carne", new HashMap<String, Integer>()));
        ArrayList<Alimento> result = instance.getPreferencias();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAlimentosIngs method, of class Usuario.
     */
    @Test
    public void testGetAlimentosIngs() {
        ArrayList<Alimento> alimentos = new ArrayList<Alimento>();
        alimentos.add(new Alimento("Pizza", "Comida rapida", new HashMap<String, Integer>()));
        HashMap<String, ArrayList<Alimento>> expResult = new HashMap<>();
        expResult.put("22/11/2017", alimentos);
        instance.agregarAlimentosIngeridos(alimentos, "22/11/2017");
        HashMap<String, ArrayList<Alimento>> result = instance.getAlimentosIngs();
        assertEquals(expResult, result);
    }

    /**
     * Test of agregarAlimentosIngeridos method, of class Usuario.
     */
    @Test
    public void testAgregarAlimentosIngeridos() {
        String fecha = "22/11/2017";
        ArrayList<Alimento> ingeridos = new ArrayList<>();
        int expRes = instance.getAlimentosIngs().size() + 1;
        instance.agregarAlimentosIngeridos(ingeridos, fecha);
        assertEquals(expRes, instance.getAlimentosIngs().size());
    }

    /**
     * Test of getRestricciones method, of class Usuario.
     */
    @Test
    public void testGetRestricciones() {
        ArrayList<Alimento> expResult = new ArrayList<>();
        Alimento alimento = new Alimento("Fideos", "Pasta", new HashMap<String, Integer>());
        expResult.add(alimento);
        instance.agregarRestriccion(expResult);
        ArrayList<Alimento> result = instance.getRestricciones();
        assertEquals(expResult, result);
    }

    /**
     * Test of agregarRestriccion method, of class Usuario.
     */
    @Test
    public void testAgregarRestriccion() {
        ArrayList<Alimento> nuevosAlimentos = new ArrayList<Alimento>();
        nuevosAlimentos.add(new Alimento("Fideos", "Pasta", new HashMap<String, Integer>()));
        int expResult = instance.getRestricciones().size() + 1;
        instance.agregarRestriccion(nuevosAlimentos);
        assertEquals(expResult, instance.getRestricciones().size());
    }

    /**
     * Test of agregarPreferencia method, of class Usuario.
     */
    @Test
    public void testAgregarPreferencia() {
        ArrayList<Alimento> nuevosAlimentos = new ArrayList<>();
        nuevosAlimentos.add(new Alimento("Fideos", "Pasta", new HashMap<String, Integer>()));
        int expRes = instance.getPreferencias().size() + 1;
        instance.agregarPreferencia(nuevosAlimentos);
        assertEquals(expRes, instance.getPreferencias().size());
    }

    /**
     * Test of getNacionalidad method, of class Usuario.
     */
    @Test
    public void testGetNacionalidad() {
        Locale expResult = new Locale("", "nacionalidad");
        Locale result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    /**
     * Test of getConsultas method, of class Usuario.
     */
    @Test
    public void testGetConsultas() {
        ArrayList<Consulta> expResult = new ArrayList<>();
        Consulta c = new Consulta(new Usuario(),Categoria.DIRECTA);
        expResult.add(c);
        instance.getConsultas().add(c);
        ArrayList<Consulta> result = instance.getConsultas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNacionalidad method, of class Usuario.
     */
    @Test
    public void testSetNacionalidad() {
        String countryCode = "Uruguay";
        instance.setNacionalidad(countryCode);
        String expRes = new Locale("","Uruguay").getCountry();
        assertEquals(expRes,instance.getNacionalidad().getCountry());
    }

    /**
     * Test of agregarConsulta method, of class Usuario.
     */
    @Test
    public void testAgregarConsulta() {
        Tipos.Categoria categoria = Categoria.DIRECTA;
        int expRes = instance.getConsultas().size() + 1;
        instance.agregarConsulta(categoria);
        assertEquals(expRes,instance.getConsultas().size());
    }

    /**
     * Test of equals method, of class Usuario.
     */
    @Test
    public void testEquals() {
        Usuario usuarioAux = new Usuario();
        Usuario usuarioAux2 = new Usuario();
        assertTrue(usuarioAux.equals(usuarioAux2));
    }
    
    @Test
    public void testEquals2() {
        Usuario usuarioAux = new Usuario();
        Usuario usuarioAux2 = new Usuario();
        usuarioAux2.setNombre("Gerardo");
        assertFalse(usuarioAux.equals(usuarioAux2));
    }

    /**
     * Test of toString method, of class Usuario.
     */
    @Test
    public void testToString() {
        String expResult = "nombre apellido";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}

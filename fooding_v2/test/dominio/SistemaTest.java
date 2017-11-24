
package dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
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
public class SistemaTest {

    private Sistema instance;

    public SistemaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Sistema();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getListaConsultas method, of class Sistema.
     */
    @Test
    public void testGetListaConsultas() {
        ArrayList<Consulta> expResult = new ArrayList<>();
        expResult.add(new Consulta(new Usuario(), Categoria.DIRECTA));
        instance.getListaConsultas().add(new Consulta(new Usuario(), Categoria.DIRECTA));
        ArrayList<Consulta> result = instance.getListaConsultas();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaUsuarios method, of class Sistema.
     */
    @Test
    public void testGetListaUsuarios() {
        ArrayList<Usuario> expResult = new ArrayList<>();
        expResult.add(new Usuario());
        instance.getListaUsuarios().add(new Usuario());
        ArrayList<Usuario> result = instance.getListaUsuarios();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaProfesionales method, of class Sistema.
     */
    @Test
    public void testGetListaProfesionales() {
        ArrayList<Profesional> expResult = new ArrayList<>();
        expResult.add(new Profesional());
        instance.getListaProfesionales().add(new Profesional());
        ArrayList<Profesional> result = instance.getListaProfesionales();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaAlimentos method, of class Sistema.
     */
    @Test
    public void testGetListaAlimentos() {
        ArrayList<Alimento> expResult = new ArrayList<>();
        expResult.add(new Alimento("Jamon", "Cerdo", new HashMap<String, Integer>()));
        instance.getListaAlimentos().add(new Alimento("Jamon", "Cerdo", new HashMap<String, Integer>()));
        ArrayList<Alimento> result = instance.getListaAlimentos();
        assertEquals(expResult, result);
    }

    /**
     * Test of noHayUsuariosRegistrados method, of class Sistema.
     */
    @Test
    public void testNoHayUsuariosRegistrados() {
        boolean expResult = true;
        boolean result = instance.noHayUsuariosRegistrados();
        assertEquals(expResult, result);
    }

    /**
     * Test of noHayProfesionalesRegistrados method, of class Sistema.
     */
    @Test
    public void testNoHayProfesionalesRegistrados() {
        boolean expResult = true;
        boolean result = instance.noHayProfesionalesRegistrados();
        assertEquals(expResult, result);
    }

    /**
     * Test of agregarUsuario method, of class Sistema.
     */
    @Test
    public void testAgregarUsuario() {
        String nombre = "Jorge";
        String apellidos = "Perez";
        String nacionalidad = "Uruguay";
        Date nacimiento = new Date();
        String pathPerfil = "";
        int expRes = instance.getListaUsuarios().size() + 1;
        instance.agregarUsuario(nombre, apellidos, nacionalidad, nacimiento, pathPerfil);
        assertEquals(instance.getListaUsuarios().size(), expRes);
    }

    /**
     * Test of agregarProfesional method, of class Sistema.
     */
    @Test
    public void testAgregarProfesional() {
        String nombre = "Martin";
        String apellidos = "Rodriguez";
        Date nacimiento = new Date();
        String pathPerfil = "";
        String titulo = "Ingeniero";
        String paisTitulo = "Uruguay";
        Date fechaGrad = new Date();
        int expRes = instance.getListaProfesionales().size() + 1;
        instance.agregarProfesional(nombre, apellidos, nacimiento, pathPerfil, titulo, paisTitulo, fechaGrad);
        assertEquals(instance.getListaProfesionales().size(), expRes);
    }

    /**
     * Test of agregarAlimento method, of class Sistema.
     */
    @Test
    public void testAgregarAlimento() {
        String nombre = "Hamburguesa";
        String familia = "rapida";
        HashMap<String, Integer> nutrientes = new HashMap<>();
        int expRes = instance.getListaAlimentos().size() + 1;
        instance.agregarAlimento(nombre, familia, nutrientes);
        assertEquals(expRes,instance.getListaAlimentos().size());
    }

    /**
     * Test of parsearListasAPlanDeAlimentacion method, of class Sistema.
     */
    @Test
    public void testParsearListasAPlanDeAlimentacion() {
        ArrayList<Alimento> lunes = new ArrayList<>();
        ArrayList<Alimento> martes = new ArrayList<>();
        ArrayList<Alimento> miercoles = new ArrayList<>();
        ArrayList<Alimento> jueves = new ArrayList<>();
        ArrayList<Alimento> viernes = new ArrayList<>();
        ArrayList<Alimento> sabado = new ArrayList<>();
        ArrayList<Alimento> domingo = new ArrayList<>();
        String expResult = " *** Plan de Alimentacion sugerido *** \n" +
" (*) Dia lunes: \n" +
"           No hay comidas registradas para este dia. \n" +
" (*) Dia martes: \n" +
"           No hay comidas registradas para este dia. \n" +
" (*) Dia miercoles: \n" +
"           No hay comidas registradas para este dia. \n" +
" (*) Dia jueves: \n" +
"           No hay comidas registradas para este dia. \n" +
" (*) Dia viernes: \n" +
"           No hay comidas registradas para este dia. \n" +
" (*) Dia sabado: \n" +
"           No hay comidas registradas para este dia. \n" +
" (*) Dia domingo: \n" +
"           No hay comidas registradas para este dia. \n";
        String result = instance.parsearListasAPlanDeAlimentacion(lunes, martes, miercoles, jueves, viernes, sabado, domingo);
        assertEquals(expResult, result);
    }

    /**
     * Test of alimentosEnDia method, of class Sistema.
     */
    @Test
    public void testAlimentosEnDia() {
        ArrayList<Alimento> unDia = new ArrayList<>();
        String dia = "lunes";
        String expResult =  " (*) Dia lunes: \n" +
"           No hay comidas registradas para este dia. \n";
        String result = instance.alimentosEnDia(unDia, dia);
        assertEquals(expResult, result);
    }

    /**
     * Test of agregarConsulta method, of class Sistema.
     */
    @Test
    public void testAgregarConsulta() {
        Consulta nuevaConsulta = new Consulta(new Usuario(),Categoria.DIRECTA);
        int expResult = instance.getListaConsultas().size() + 1;
        instance.agregarConsulta(nuevaConsulta);
        assertEquals(expResult,instance.getListaConsultas().size());
    }

    /**
     * Test of consultasPorDescripcion method, of class Sistema.
     */
    @Test
    public void testConsultasPorDescripcion() {
        ArrayList<Consulta> lista = new ArrayList<>();
        Consulta c = new Consulta(new Usuario(),Categoria.DIRECTA);
        lista.add(c);
        ArrayList<String> expResult = new ArrayList<>();
        expResult.add("Categoria: " + c.getCategoria().name() + " - Estado: "
                + c.getEstado().name() + " - Usuario: "
                + c.getUsuario().getNombre().toUpperCase() + " "
                + c.getUsuario().getApellidos().toUpperCase()
                + " - Profesional: N/A ");
        ArrayList<String> result = instance.consultasPorDescripcion(lista);
        assertEquals(expResult, result);
    }

    /**
     * Test of filtrarPorDirecta method, of class Sistema.
     */
    @Test
    public void testFiltrarPorDirecta() {
        ArrayList<Consulta> lista = new ArrayList<>();
        lista.add(new Consulta(new Usuario(),Categoria.DIRECTA));
        lista.add(new Consulta(new Usuario(),Categoria.PLAN_ALIMENTICIO));
        ArrayList<Consulta> expResult = new ArrayList<>();
        expResult.add(new Consulta(new Usuario(),Categoria.DIRECTA));
        ArrayList<Consulta> result = instance.filtrarPorDirecta(lista);
        assertEquals(expResult, result);
    }

    /**
     * Test of filtrarPorPlan method, of class Sistema.
     */
    @Test
    public void testFiltrarPorPlan() {
           ArrayList<Consulta> lista = new ArrayList<>();
        lista.add(new Consulta(new Usuario(),Categoria.DIRECTA));
        lista.add(new Consulta(new Usuario(),Categoria.PLAN_ALIMENTICIO));
        ArrayList<Consulta> expResult = new ArrayList<>();
        expResult.add(new Consulta(new Usuario(),Categoria.PLAN_ALIMENTICIO));
        ArrayList<Consulta> result = instance.filtrarPorPlan(lista);
        assertEquals(expResult, result);
    }

    /**
     * Test of filtrarPorCompletado method, of class Sistema.
     */
    @Test
    public void testFiltrarPorCompletado() {
           ArrayList<Consulta> lista = new ArrayList<>();
        lista.add(new Consulta(new Usuario(),Categoria.DIRECTA));
        Consulta c = new Consulta(new Usuario(),Categoria.DIRECTA);
        c.setEstado(Tipos.Estado.COMPLETADO);
        lista.add(c);
        ArrayList<Consulta> expResult = new ArrayList<>();
        expResult.add(c);
        ArrayList<Consulta> result = instance.filtrarPorCompletado(lista);
        assertEquals(expResult, result);
    }

    /**
     * Test of filtrarPorPendiente method, of class Sistema.
     */
    @Test
    public void testFiltrarPorPendiente() {
            ArrayList<Consulta> lista = new ArrayList<>();
        lista.add(new Consulta(new Usuario(),Categoria.DIRECTA));
        Consulta c = new Consulta(new Usuario(),Categoria.DIRECTA);
        c.setEstado(Tipos.Estado.COMPLETADO);
        lista.add(c);
        ArrayList<Consulta> expResult = new ArrayList<>();
        expResult.add(new Consulta(new Usuario(),Categoria.DIRECTA));
        ArrayList<Consulta> result = instance.filtrarPorPendiente(lista);
        assertEquals(expResult, result);

    }

    /**
     * Test of filtrarPorEnProceso method, of class Sistema.
     */
    @Test
    public void testFiltrarPorEnProceso() {
         ArrayList<Consulta> lista = new ArrayList<>();
        lista.add(new Consulta(new Usuario(),Categoria.DIRECTA));
        Consulta c = new Consulta(new Usuario(),Categoria.DIRECTA);
        c.setEstado(Tipos.Estado.EN_PROCESO);
        lista.add(c);
        ArrayList<Consulta> expResult = new ArrayList<>();
        expResult.add(c);
        ArrayList<Consulta> result = instance.filtrarPorEnProceso(lista);
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenerSesionActivaUsuario method, of class Sistema.
     */
    @Test
    public void testObtenerSesionActivaUsuario() {
        Usuario expResult = new Usuario();
        instance.getListaUsuarios().add(expResult);
        expResult.setSesionActiva(true);
        Usuario result = instance.obtenerSesionActivaUsuario();
        assertEquals(expResult, result);

    }

    /**
     * Test of obtenerSesionActivaProfesional method, of class Sistema.
     */
    @Test
    public void testObtenerSesionActivaProfesional() {
        Profesional expResult = new Profesional();
        instance.getListaProfesionales().add(expResult);
        expResult.setSesionActiva(true);
        Profesional result = instance.obtenerSesionActivaProfesional();
        assertEquals(expResult, result);

    }

    /**
     * Test of obtenerUsuario method, of class Sistema.
     */
    @Test
    public void testObtenerUsuario() {
        Usuario unUsuario = new Usuario();
        Usuario expResult = new Usuario();
        instance.getListaUsuarios().add(unUsuario);
        Usuario result = instance.obtenerUsuario(unUsuario);
        assertEquals(expResult, result);
    }

}

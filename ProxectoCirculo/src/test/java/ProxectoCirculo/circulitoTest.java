package ProxectoCirculo;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas para la clase circulito
 * @author profesor
 */
public class circulitoTest {

    /**
     * Test of establecerX method, of class circulito.
     */
    @Test
    public void testEstablecerX() {
        System.out.println("establecerX");
        int valorX = 0;
        circulito instance = new circulito();
        instance.setX(valorX);
    }

    /**
     * Test of establecerY method, of class circulito.
     */
    @Test
    public void testEstablecerY() {
        System.out.println("establecerY");
        int valorY = 0;
        circulito instance = new circulito();
        instance.setY(valorY);
    }

    /**
     * Test of establecerRadio method, of class circulito.
     */
    @Test
    public void testEstablecerRadio() {
        System.out.println("establecerRadio");
        circulito instance = new circulito();
        instance.establecerRadio(0.0);
        instance.establecerRadio(0.1);
        instance.establecerRadio(-0.1);
    }

    /**
     * Test of obtenerX method, of class circulito.
     */
    @Test
    public void testObtenerX() {
        System.out.println("obtenerX");
        circulito instance = new circulito(0,0,0.1);
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
    }


    /**
     * Test of obtenerY method, of class circulito.
     */
    @Test
    public void testObtenerY() {
        System.out.println("obtenerY");
        circulito instance = new circulito(0,0,0.1);
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenerRadio method, of class circulito.
     */
    @Test
    public void testObtenerRadio() {
        System.out.println("obtenerRadio");
        circulito instance = new circulito(0,0,0.1);
        double result = instance.obtenerRadio();
        assertEquals(0.1, result,0);

        instance.establecerRadio(0.1);
        result= instance.obtenerRadio();
        assertEquals(0.1, result,0);

        instance.establecerRadio(-0.1);
        result= instance.obtenerRadio();
        assertEquals(0.0, result,0);
    }

    /**
     * Test of obtenerDiametro method, of class circulito.
     */
    @Test
    public void testObtenerDiametro() {
        System.out.println("obtenerDiametro");
        circulito instance = new circulito(0,0,0.1);
        double result = instance.obtenerDiametro();
        assertEquals(0.2, result,0);
    }

    /**
     * Test of obtenerCircunferencia method, of class circulito.
     */
    @Test
    public void testObtenerCircunferencia() {
        System.out.println("obtenerCircunferencia");
        circulito instance = new circulito(0,0,0.1);
        double expResult = 0.6283185;
        double result = instance.obtenerCircunferencia();
        assertEquals(expResult, result,1e-6);
    }

    /**
     * Test of obtenerArea method, of class circulito.
     */
    @Test
    public void testObtenerArea() {
        System.out.println("obtenerArea");
        circulito instance = new circulito(0,0,0.1);
        double expResult = 0.0314159;
        double result = instance.ObtenerAreaCirculo();
        assertEquals(expResult, result,1e-6);
    }

    
    /**
     * Test of trasladarCentro method, of class circulito.
     */
    @Test
    public void testTrasladarCentro() {
        System.out.println("trasladarCentro");
        circulito instance = new circulito();
        int resultx=instance.getX();
        int resulty=instance.getY();
        instance.trasladarCentro();
        int resultnx = instance.getX();
        int resultny = instance.getY();
        assertEquals(resultx+5, resultnx);
        assertEquals(resulty+6, resultny);
    }

}
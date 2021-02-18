package circulo;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas para la clase Circulo
 * @author profesor
 */
public class CirculoTest {

    /**
     * Test of establecerX method, of class Circulo.
     */
    @Test
    public void testEstablecerX() {
        System.out.println("establecerX");
        int valorX = 0;
        Circulo instance = new Circulo();
        instance.establecerX(valorX);
    }

    /**
     * Test of establecerY method, of class Circulo.
     */
    @Test
    public void testEstablecerY() {
        System.out.println("establecerY");
        int valorY = 0;
        Circulo instance = new Circulo();
        instance.establecerY(valorY);
    }

    /**
     * Test of establecerRadio method, of class Circulo.
     */
    @Test
    public void testEstablecerRadio() {
        System.out.println("establecerRadio");
        Circulo instance = new Circulo();
        instance.establecerRadio(0.0);
        instance.establecerRadio(0.1);
        instance.establecerRadio(-0.1);
    }

    /**
     * Test of obtenerX method, of class Circulo.
     */
    @Test
    public void testObtenerX() {
        System.out.println("obtenerX");
        Circulo instance = new Circulo(0,0,0.1);
        int expResult = 0;
        int result = instance.obtenerX();
        assertEquals(expResult, result);
    }


    /**
     * Test of obtenerY method, of class Circulo.
     */
    @Test
    public void testObtenerY() {
        System.out.println("obtenerY");
        Circulo instance = new Circulo(0,0,0.1);
        int expResult = 0;
        int result = instance.obtenerY();
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenerRadio method, of class Circulo.
     */
    @Test
    public void testObtenerRadio() {
        System.out.println("obtenerRadio");
        Circulo instance = new Circulo(0,0,0.1);
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
     * Test of obtenerDiametro method, of class Circulo.
     */
    @Test
    public void testObtenerDiametro() {
        System.out.println("obtenerDiametro");
        Circulo instance = new Circulo(0,0,0.1);
        double result = instance.obtenerDiametro();
        assertEquals(0.2, result,0);
    }

    /**
     * Test of obtenerCircunferencia method, of class Circulo.
     */
    @Test
    public void testObtenerCircunferencia() {
        System.out.println("obtenerCircunferencia");
        Circulo instance = new Circulo(0,0,0.1);
        double expResult = 0.6283185;
        double result = instance.obtenerCircunferencia();
        assertEquals(expResult, result,1e-6);
    }

    /**
     * Test of obtenerArea method, of class Circulo.
     */
    @Test
    public void testObtenerArea() {
        System.out.println("obtenerArea");
        Circulo instance = new Circulo(0,0,0.1);
        double expResult = 0.0314159;
        double result = instance.obtenerArea();
        assertEquals(expResult, result,1e-6);
    }

    
    /**
     * Test of trasladarCentro method, of class Circulo.
     */
    @Test
    public void testTrasladarCentro() {
        System.out.println("trasladarCentro");
        Circulo instance = new Circulo();
        int resultx=instance.obtenerX();
        int resulty=instance.obtenerY();
        instance.trasladarCentro();
        int resultnx = instance.obtenerX();
        int resultny = instance.obtenerY();
        assertEquals(resultx+5, resultnx);
        assertEquals(resulty+6, resultny);
    }

}
package circulo;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas para la clase Circulo
 * @author profesor
 */
public class CirculoTest {

    /**
     * Test of getCoordenadaX method, of class Circulo.
     */
    @Test
    public void testgetCoordenadaX() {
        System.out.println("getCoordenadaX");
        int valorX = 0;
        Circulo instance = new Circulo();
        instance.getCoordenadaX(valorX);
    }

    /**
     * Test of getCoordenadaY method, of class Circulo.
     */
    @Test
    public void testgetCoordenadaY() {
        System.out.println("getCoordenadaY");
        int valorY = 0;
        Circulo instance = new Circulo();
        instance.getCoordenadaY(valorY);
    }

    /**
     * Test of setRadio method, of class Circulo.
     */
    @Test
    public void testsetRadio() {
        System.out.println("setRadio");
        Circulo instance = new Circulo();
        instance.setRadio(0.0);
        instance.setRadio(0.1);
        instance.setRadio(-0.1);
    }

    /**
     * Test of getCoordenadaX method, of class Circulo.
     */
    @Test
    public void testCoordenadaX() {
        System.out.println("getCoordenadaX");
        Circulo instance = new Circulo(0,0,0.1);
        int expResult = 0;
        int result = instance.getCoordenadaX();
        assertEquals(expResult, result);
    }


    /**
     * Test of getCoordenadaY method, of class Circulo.
     */
    @Test
    public void testCoordenadaY() {
        System.out.println("getCoordenadaY");
        Circulo instance = new Circulo(0,0,0.1);
        int expResult = 0;
        int result = instance.getCoordenadaY();
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenerRadio method, of class Circulo.
     */
    @Test
    public void testObtenerRadio() {
        System.out.println("obtenerRadio");
        Circulo instance = new Circulo(0,0,0.1);
        double result = instance.getRadio();
        assertEquals(0.1, result,0);

        instance.setRadio(0.1);
        result= instance.getRadio();
        assertEquals(0.1, result,0);

        instance.setRadio(-0.1);
        result= instance.getRadio();
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
        int resultx=instance.getCoordenadaX();
        int resulty=instance.getCoordenadaY();
        instance.trasladarCentro();
        int resultnx = instance.getCoordenadaX();
        int resultny = instance.getCoordenadaY();
        assertEquals(resultx+5, resultnx);
        assertEquals(resulty+6, resultny);
    }

}
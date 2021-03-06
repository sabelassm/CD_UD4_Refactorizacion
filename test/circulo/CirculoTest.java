package circulo;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas para la clase Circulo
 * @author Alvaro
 */
public class CirculoTest {

    /**
     * Test del metodo getCoordenadaX , de la clase clase Circulo.
     */
    @Test
    public void testgetCoordenadaX() {
        System.out.println("getCoordenadaX");
        int valorX = 0;
        Circulito instance = new Circulito();
        instance.getCoordenadaX();
    }

    /**
     * Test del metodo getCoordenaday , de la clase clase Circulo.
     */
    @Test
    public void testgetCoordenadaY() {
        System.out.println("getCoordenadaY");
        int valorY = 0;
        Circulito instance = new Circulito();
        instance.getCoordenadaY();
    }

    /**
     * Test del metodo setradio , de la clase clase Circulo. 
     */
    @Test
    public void testsetRadio() {
        System.out.println("setRadio");
        Circulito instance = new Circulito();
        instance.setRadio(0.0);
        instance.setRadio(0.1);
        instance.setRadio(-0.1);
    }

    /**
     * Test del metodo Coordenada x , de la clase clase Circulo.
     */
    @Test
    public void testCoordenadaX() {
        System.out.println("getCoordenadaX");
        Circulito instance = new Circulito(0,0,0.1);
        int expResult = 0;
        int result = instance.getCoordenadaX();
        assertEquals(expResult, result);
    }


    /**
     * Test del metodo coordenada y , de la clase clase Circulo.
     */
    @Test
    public void testCoordenadaY() {
        System.out.println("getCoordenadaY");
        Circulito instance = new Circulito(0,0,0.1);
        int expResult = 0;
        int result = instance.getCoordenadaY();
        assertEquals(expResult, result);
    }

    /**
     * Test del metodo obtener radio, de la clase clase Circulo.
     */
    @Test
    public void testObtenerRadio() {
        System.out.println("obtenerRadio");
        Circulito instance = new Circulito(0,0,0.1);
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
     * Test del metodo obtener diametro, de la clase clase Circulo.
     */
    @Test
    public void testObtenerDiametro() {
        System.out.println("obtenerDiametro");
        Circulito instance = new Circulito(0,0,0.1);
        double result = instance.obtenerDiametro();
        assertEquals(0.2, result,0);
    }

    /**
     * Test del metodo obtener circunferencia, de la clase clase Circulo.
     */
    @Test
    public void testObtenerCircunferencia() {
        System.out.println("obtenerCircunferencia");
        Circulito instance = new Circulito(0,0,0.1);
        double expResult = 0.6283185;
        double result = instance.obtenerCircunferencia();
        assertEquals(expResult, result,1e-6);
    }

    /**
     *Test del metodo obtener area, de la clase clase Circulo.
     */
    @Test
    public void testObtenerArea() {
        System.out.println("obtenerArea");
        Circulito instance = new Circulito(0,0,0.1);
        double expResult = 0.0314159;
        double result = instance.obtenerAreacirculo();
        assertEquals(expResult, result,1e-6);
    }

    
    /**
     * Test del metodo trasladar centro, de la clase clase Circulo.
     */
    @Test
    public void testTrasladarCentro() {
        System.out.println("trasladarCentro");
        Circulito instance = new Circulito();
        int resultx=instance.getCoordenadaX();
        int resulty=instance.getCoordenadaY();
        instance.trasladarCentro();
        int resultnx = instance.getCoordenadaX();
        int resultny = instance.getCoordenadaY();
        assertEquals(resultx+5, resultnx);
        assertEquals(resulty+6, resultny);
    }

}
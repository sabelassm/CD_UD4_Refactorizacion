package pruebaCirculito;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas para la clase Circulito
 * @author profesor
 */
public class CirculoTest {

    /**
     * Test del método para establecer la coordenada X de la clase Circulito.
     */
    @Test
    public void testEstablecerX() {
        System.out.println("establecerX");
        int valorX = 0;
        Circulito instance = new Circulito();
        instance.setCoordenadaX(valorX);   
    }

    /**
     * Test del método para establecer la coordenada Y de la clase Circulito.
     */
    @Test
    public void testEstablecerY() {
        System.out.println("establecerY");
        int valorY = 0;
        Circulito instance = new Circulito();
        instance.setCoordenadaY(valorY);
    }

    /**
     * Test del método para establecer lel radio de la clase Circulito.
     */
    @Test
    public void testEstablecerRadio() {
        System.out.println("establecerRadio");
        Circulito instance = new Circulito();
        instance.establecerRadio(0.0);
        instance.establecerRadio(0.1);
        instance.establecerRadio(-0.1);
    }

    /**
     * Test para obtener la coordenada X de la clase Circulito.
     */
    @Test
    public void testObtenerX() {
        System.out.println("obtenerX");
        Circulito instance = new Circulito(0,0,0.1);
        int expResult = 0;
        int result = instance.getCoordenadaX();
        assertEquals(expResult, result);
    }


    /**
     * Test para obtener la coordenada Y de la clase Circulito.
     */
    @Test
    public void testObtenerY() {
        System.out.println("obtenerY");
        Circulito instance = new Circulito(0,0,0.1);
        int expResult = 0;
        int result = instance.getCoordenadaY();
        assertEquals(expResult, result);
    }

    /**
     * Test para obtener el radio de la clase Circulito.
     */
    @Test
    public void testObtenerRadio() {
        System.out.println("obtenerRadio");
        Circulito instance = new Circulito(0,0,0.1);
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
     * Test para obtener el diametro de la clase Circulito.
     */
    @Test
    public void testObtenerDiametro() {
        System.out.println("obtenerDiametro");
        Circulito instance = new Circulito(0,0,0.1);
        double result = instance.obtenerDiametro();
        assertEquals(0.2, result,0);
    }

    /**
     * Test para obtener la circunferencia de la clase Circulito.
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
     * Test para obtener el área de la clase Circulito.
     */
    @Test
    public void testObtenerArea() {
        System.out.println("obtenerArea");
        Circulito instance = new Circulito(0,0,0.1);
        double expResult = 0.0314159;
        double result = instance.obtenerAreaCirculo();
        assertEquals(expResult, result,1e-6);
    }

    
    /**
     * Test para trasladar el centro de la clase Circulito.
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
        assertEquals(resulty+5, resultny);
    }

}
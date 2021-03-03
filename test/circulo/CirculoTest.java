package circulo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas Unitarias para la clase Circulito.
 *
 * @author profesor, Silvia López Diéguez
 * @version 03/03/2021
 * @see src.Circulito
 */
public class CirculoTest {

    /**
     * Test del método establecerX, de la clase Circulito.
     */
    @Test
    public void testEstablecerX() {
        System.out.println("establecerX");
        int valorX = 0;
        Circulito instance = new Circulito();
        instance.setCoordenadaX(valorX);
    }

    /**
     * Test del método establecerY, de la clase Circulito.
     */
    @Test
    public void testEstablecerY() {
        System.out.println("establecerY");
        int valorY = 0;
        Circulito instance = new Circulito();
        instance.setCoordenadaY(valorY);
    }

    /**
     * Test del método establecerRadio, de la clase Circulito.
     */
    @Test
    public void testEstablecerRadio() {
        System.out.println("establecerRadio");
        Circulito instance = new Circulito();
        instance.setRadio((0.0 < Circulito.getLimiteradio() ? 0.0 : 0.0));
        instance.setRadio((0.1 < Circulito.getLimiteradio() ? 0.0 : 0.1));
        double valorRadio = -0.1;
        instance.setRadio((valorRadio < Circulito.getLimiteradio() ? 0.0 : valorRadio));
    }

    /**
     * Test del método obtenerX, de la clase Circulit.
     */
    @Test
    public void testObtenerX() {
        System.out.println("obtenerX");
        Circulito instance = new Circulito(0, 0, 0.1);
        int expResult = 0;
        int result = instance.getCoordenadaX();
        assertEquals(expResult, result);
    }

    /**
     * Test del método obtenerY, de la clase Circulito.
     */
    @Test
    public void testObtenerY() {
        System.out.println("obtenerY");
        Circulito instance = new Circulito(0, 0, 0.1);
        int expResult = 0;
        int result = instance.getCoordenadaY();
        assertEquals(expResult, result);
    }

    /**
     * Test del método obtenerRadio, de la clase Circulito.
     */
    @Test
    public void testObtenerRadio() {
        System.out.println("obtenerRadio");
        Circulito instance = new Circulito(0, 0, 0.1);
        double result = instance.getRadio();
        assertEquals(0.1, result, 0);

        instance.setRadio((0.1 < Circulito.getLimiteradio() ? 0.0 : 0.1));
        result = instance.getRadio();
        assertEquals(0.1, result, 0);
        double valorRadio = -0.1;

        instance.setRadio((valorRadio < Circulito.getLimiteradio() ? 0.0 : valorRadio));
        result = instance.getRadio();
        assertEquals(0.0, result, 0);
    }

    /**
     * Test del método obtenerDiametro, de la clase Circulito.
     */
    @Test
    public void testObtenerDiametro() {
        System.out.println("obtenerDiametro");
        Circulito instance = new Circulito(0, 0, 0.1);
        double result = instance.obtenerDiametro();
        assertEquals(0.2, result, 0);
    }

    /**
     * Test del método obtenerCircunferencia, de la clase Circulito.
     */
    @Test
    public void testObtenerCircunferencia() {
        System.out.println("obtenerCircunferencia");
        Circulito instance = new Circulito(0, 0, 0.1);
        double expResult = 0.6283185;
        double result = instance.obtenerCircunferencia();
        assertEquals(expResult, result, 1e-6);
    }

    /**
     * Test del método obtenerArea, de la clase Circulito.
     */
    @Test
    public void testObtenerArea() {
        System.out.println("obtenerArea");
        Circulito instance = new Circulito(0, 0, 0.1);
        double expResult = 0.0314159;
        double result = instance.obtenerAreaCirculo();
        assertEquals(expResult, result, 1e-6);
    }

    /**
     * Test del método trasladarCentro, de la clase Circulito.
     */
    @Test
    public void testTrasladarCentro() {
        System.out.println("trasladarCentro");
        Circulito instance = new Circulito();
        int resultx = instance.getCoordenadaX();
        int resulty = instance.getCoordenadaY();
        instance.trasladarCentro();
        int resultnx = instance.getCoordenadaX();
        int resultny = instance.getCoordenadaY();
        assertEquals(resultx + 5, resultnx);
        assertEquals(resulty + 6, resultny);
    }

}

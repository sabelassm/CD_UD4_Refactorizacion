package circulo;

/**
 * Pruebas de refactorización en NetBeans con la clase Circulo
 * @author Yago Alvarez Enriquez
 */

public class Circulito {

    /**
 * Coordenada radio, x, y e limiteRadio
 */
    private static final double limiteRadio = 0.0;
    private int coordenadaX;
    private int coordenadaY;
    private double radio;

/**
 * Constructor circulito
 */
    public Circulito() {
    }
/**
 * Declaración valores circulito
 * @param valorX
 * @param valorY
 * @param valorRadio
 */
    public Circulito(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY= valorY;
        establecerRadio(valorRadio);
    }
/**
 * setters and getters
 */
    public void setX(int valorX) {
        coordenadaX=valorX;
    }

    public int getX() {
        return coordenadaX;
    }

    public void setY(int valorY) {
        coordenadaY=valorY;
    }

    public int getY() {
        return coordenadaY
;
    }
/**
 * Establece el valor del radio
 * @param valorRadio
 */
    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < limiteRadio ? 0.0 : valorRadio);
    }
/**
 * Obtiene valor de radio
 * @return valor de radio
 */
    public double obtenerRadio() {
        return radio;
    }
/**
 * Obtiene valor diametro
 * @return valor diametro
 */
    public double obtenerDiametro() {
        return radio * 2;
    }

/**
 * Obtiene valor circunferencia
 * @return valor circunferencia
 */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }
/**
 * Obtiene valor area
 * utiliza el valor de PI =  {@value java.lang.Math#PI}
 * @return valor area
 */

    public double obtenerAreaCirculo() {
        return Math.PI * radio * radio;
    }

/**
 * Centro de las coordenadas y radio
 * @return centro de las coordenadas y radio
 */
    @Override
    public String toString() {
        return "Centro = [" + coordenadaX + "," + coordenadaY+ "]; Radio = " + radio;
    }
/**
 * traslada las coordenadas 5 puntos
 */
    public void trasladarCentro(){
        coordenadaX=coordenadaX + 5;
        coordenadaY=coordenadaY + 5;
    }
/**
 * asigna a a el valor de coordenadaX
 * @return valor coordenadaX
 */    
    public int a(){
        return coordenadaX;
    }
}

package circulo;

/**
 * Pruebas de refactorización en NetBeans con la clase Circulo
 * 
 * @author profesor, Silvia López Diéguez
 * @version 03/03/2021
 * 
 */
public class Circulito {
    // Campos de la clase Circulito
    private static final double limiteRadio = 0.0;
    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    /**
     * Constructor vacío No asignación de argumentos de entrada
     */
    public Circulito() {
    }

    /**
     * Constructor para las coordenadas del círculo
     * 
     * @param valorX                                  coordenada: coordenadaX
     * @param valorY                                  coordenada: coordenadaY
     * @param (valorRadio<limiteRadio?0.0:valorRadio) ecuación: radio
     */
    public Circulito(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        radio = (valorRadio < limiteRadio ? 0.0 : valorRadio);
    }

    /**
     * Devuelve diámetro de círulo
     * 
     * @return diámetro
     */
    public double obtenerDiametro() {
        return radio * 2;
    }

    /**
     * Devuelve perímetro de círculo (circunferencia) y utiliza el valor de
     * PI={@value java.lang.Math#PI}
     * 
     * @return longitud
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    /**
     * Devuelve área de círculo y utiliza el valor de PI={@value java.lang.Math#PI}
     * 
     * @return área
     */
    public double obtenerAreaCirculo() {
        return Math.PI * radio * radio;
    }

    /**
     * Devuelve un resumen de todos los valores asignados a los campos
     * 
     * @return valores de argumentos
     */
    @Override
    public String toString() {
        return "Centro = [" + coordenadaX + "," + coordenadaY + "]; Radio = " + radio;
    }

    /**
     * Desplaza el centro a una distancia 5
     * 
     * @param coordenadaX suma 5 al valor de coordenadaX
     * @param coordenadaY suma 5 al valor de coordenadaY
     */
    public void trasladarCentro() {
        coordenadaX = coordenadaX + 5;
        coordenadaY = coordenadaY + 5;
    }

    /**
     * Devuelve el valor de un punto de eje X
     * 
     * @return coordenadaX
     */
    public int a() {
        return coordenadaX;
    }

    /**
     * Devuelve la coordenadaX
     * 
     * @return coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * Establece la coordenadaX
     * 
     * @param coordenadaX
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * Devuelve la coordenadaY
     * 
     * @return coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * Establece la coordenadaY
     * 
     * @param coordenadaY
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * Devuelve el valor del radio
     * 
     * @return radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Establece el valor del radio
     * 
     * @param radio
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Devuelve el valor límite del radio
     * 
     * @return valor límite de radio
     */
    public static double getLimiteradio() {
        return limiteRadio;
    }

}

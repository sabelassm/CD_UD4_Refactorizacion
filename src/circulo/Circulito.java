package pruebaCirculito;

/**
 * Pruebas de refactorización en NetBeans con la clase Circulito
 *
 * @author profesor
 */
public class Circulito {

    
   
    /**
     * Posición en el centro del circulo de la coordenada X
     */
    private int coordenadaX;
    /**
     * Posición en el centro del circulo de la coordenada Y
     */
    private int coordenadaY;
    /**
     * Radio del círculo
     */
    private double radio;
    /**
     * Valor mínimo para el radio
     */
    private static final double LIMITERADIO = 0.0;
    /**
     * Constructor vacio
     */
    public Circulito() {
    }

    /**
     * Constructor de la clase sirculo
     * @param valorX que recibirá la coordenada X
     * @param valorY que recibirá la coordenada Y
     * @param valorRadio que recibirá el radio del círculo
     */
    public Circulito (int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        establecerRadio(valorRadio);
    }

    
    /** 
     * Establece el radio en números positivos
     * @param valorRadio
     */
    public void establecerRadio(double valorRadio) {

        radio = (valorRadio < LIMITERADIO ? LIMITERADIO : valorRadio);
    }

    
    /** 
     * Muestra lo que vale radio
     * @return double
     */
    public double obtenerRadio() {
        return radio;
    }

    
    /** 
     * Calcula y devuelve lo que vale el diametro
     * @return double
     */
    public double obtenerDiametro() {
        return radio * 2;
    }

    
    /** 
     * Calcula y devuelve la circunferencia
     * @return double
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    
    /** 
     * Calcula y devuelve el área 
     * @return double
     */
    public double obtenerAreaCirculo() {
        return Math.PI * radio * radio;
    }

    
    /** 
     * Devuelve una cadena de caracteres con los valores de las coordenadas y el radio del circulo
     * @return String
     */
    @Override
    public String toString() {
        return "Centro = [" + coordenadaX + "," + coordenadaY + "]; Radio = " + radio;
    }

    public void trasladarCentro() {
        coordenadaX = coordenadaX + 5;
        coordenadaY = coordenadaY + 5;
    }

    
    /** 
     * Devuelve la coordenada X
     * @return int
     */
    public int a() {
        return coordenadaX;
    }

    
    /** 
     * Devuelve la coordenada X
     * @return int
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    
    /** 
     * Establece la posición de la coordenada X según el parámetro entero que reciba
     * @param coordenadaX
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    
    /** 
     * Devuelve la coordenada Y
     * @return int
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    
    /** 
     * Establece la posición de la coordenada Y según el parámetro entero que reciba
     * @param coordenadaY
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
}

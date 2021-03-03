package circulo;

/**
 * Clase Circulito
 * 
 * @author profesor
 * @version 1.0
 */
public class Circulito {
    
    private static final double LIMITERADIO = 0.0;
    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    /** 
     * constructor por defecto sin parametros
     */
    public Circulito() {
    }

    /** 
     * constructor con coordenadas X e Y y radio
     * @param valorX coordenadaX
     * @param valorY coordenadaY
     * @param valorRadio radio
     */
    public Circulito(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }
   
    /** 
     * metodo get par la coordenada X
     * devuelve un numero entero correspondiente a la coordenada X
     * @return int - coordenada X
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /** 
     * metodo set para la coordenadaX
     * @param coordenadaX de tipo entero
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    
    /** 
     * metodo get par la coordenada Y
     * devuelve un numero entero correspondiente a la coordenada Y
     * @return int - coordenada Y
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    
    /** 
     * metodo set para la coordenada Y
     * @param coordenadaY de tipo entero
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    
    /** 
     * metodo get par el radio
     * devuelve un numero decimal correspondiente al radio
     * @return double - radio
     */
    public double getRadio() {
        return radio;
    }

    
    /** 
     * metodo set para el radio
     * @param radio radio de tipo double
     */
    public void setRadio(double radio) {

        this.radio = (radio < LIMITERADIO ? LIMITERADIO : radio);
    }

    
    /** 
     * devuelve el diametro del circulo
     * @return diametro - double
     */
    public double obtenerDiametro() {
        return radio * 2;
    }

    
    /** 
     * devuelve la circunferencia del circulo
     * @return circunferencia - double
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    
    /** 
     * obtiene el area del circulo
     * @return area - double
     */
    public double obtenerAreaCirculo() {
        return Math.PI * radio * radio;
    }

    
    /** 
     * metodo sobreescrito
     * indica las coordenadas del centro y el radio del circulo
     * @return String
     */
    @Override
    public String toString() {
        return "Centro = [" + coordenadaX + "," + coordenadaY + "]; Radio = " + radio;
    }

    /** 
     * mueve 5 puntos las coordenadas del centro del circulo
     */
    public void trasladarCentro() {
        coordenadaX = coordenadaX + 5;
        coordenadaY = coordenadaY + 5;
    }


}

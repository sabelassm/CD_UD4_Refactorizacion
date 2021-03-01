package circulo;

/**
 * Pruebas de refactorización en NetBeans con la clase Circulo
 * @author profesor
 * @version 1.0
 */
public class Circulito {

    /**
     * Valor de la posición del centro del círculo respecto a la coordenada x
     */
    private int coordenadaX;
    /**
     * Valor de la posición del centro del círculo respecto a la coordenada y
     */
    private int coordenadaY;
    /**
     * Valor del radio del círculo
     */
    private double radio;
    /**
     * Valor límite inferior para la variables radio
     */
    private static final double LIMITERADIO = 0.0;

    /**
     * Función no determinada, se mantiene para futuros ejercicios
     */ 
    public Circulito() {
    }

    /**
     * Constructor de la clase
     * @param valorX Valor a asignar a la coordenada x
     * @param valorY Valor a asignar a la coordenada y
     * @param valorRadio Valor a asignar al radio del círculo
     */
    public Circulito(int valorX, int valorY, double valorRadio) {
        setCoordenadaX(valorX);
        setCoordenadaY(valorY);
        setRadio(valorRadio);
    }

    /**
     * Calula el diámetro del círculo
     * @return Valor del diámetro del circulo
     */
    public double obtenerDiametro() {
        return radio * 2;
    }

    /**
     * Calcula la circunferencia del círculo
     * @return Valor de la circunferencia del círculo
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    /**
     * Calcula el área del círculo
     * @return Valor del área del círculo
     */
    public double obtenerAreaCirculo() {
        return Math.PI * radio * radio;
    }

    /**
     * Muestra los parámetros que definen al cí­rculo, coordenadas y radio, con un formato predefinido.
     * @return Salida formateada de los parámetros que definen el círculo
     */
    @Override
    public String toString() {
        return "Centro = [" + coordenadaX + "," + coordenadaY + "]; Radio = " + radio;
    }

    /**
     * Modifica la posición del centro del círculo un número predefinido de unidades.
     * La modificación incremente el valor de las coordenadas en 5.
     */
    public void trasladarCentro() {
        coordenadaX = coordenadaX + 5;
        coordenadaY = coordenadaY + 5;
    }

    /**
     * Muestra la posición del centro respecto a la coordenada x
     * @return Valor de la variables coordenadaX
     * @deprecated getCoordenadaX
     */
    public int a() {
        return coordenadaX;
    }

    /**
     * Muestra la posición del centro respecto a la coordenada x 
     * @return Valor de la variables coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * Establece la posición del centro respecto a la coordenada x
     * Puede tomar cualquier valor entero
     * @param coordenadaX
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * Muestra la posición del centro respecto a la coordenada y
     * @return Valor de la variables coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * Establece la posición del centro respecto a la coordenada y 
     * Puede tomar cualquier valor entero
     * @param coordenadaY
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * Muestra el valor del radio
     * @return Valor del radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Establece el valor del radio
     * Limita los posibles valores a números positivos, o en caso contrario asigna valor 0.0
     * @param radio
     */
    public void setRadio(double radio) {
        this.radio = (radio < LIMITERADIO ? LIMITERADIO : radio);

    }
}

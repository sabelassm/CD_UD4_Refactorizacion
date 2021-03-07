package circulo;

/**
 * Clase principal
 * @author Pablo Bourdelande García
 */
public class Circulito {

    private static final double LIMITERADIO = 0.0;
    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    public Circulito() {
    }
    /**
     * Establece todos los parámetros a la vez, el usuario enviará coordenadas y radio y el método almacenará la información
     * @param valorX
     * @param valorY
     * @param valorRadio
     */
    public Circulito(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        establecerRadio(valorRadio);
    }

    
    /** 
     * Establece el valor de la coordenada X dado el valor introducido por el usuario
     * @param valorX
     */
    public void setX(int valorX) {
        coordenadaX=valorX;
    }

    
    /** 
     * Obtiene el valor de la coordenada X previamente establecida
     * @return int
     */
    public int getX() {
        return coordenadaX;
    }

    
    /** 
     * Establece el valor de la coordenada Y dado el valor introducido por el usuario
     * @param valorY
     */
    public void setY(int valorY) {
        coordenadaY=valorY;
    }

    
    /** 
     * Obtiene el valor de la coordenada Y previamente establecida
     * @return int
     */
    public int getY() {
        return coordenadaY;
    }

    
    /** 
     * Establece el valor del radio recibiendo el valor introducido por el usuario
     * @param valorRadio
     */
    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < LIMITERADIO ? 0.0 : valorRadio);
    }

    
    /** 
     * Obtiene el radio previamente establecido
     * @return double
     */
    public double obtenerRadio() {
        return radio;
    }

    
    /** 
     * Calcula el diámetro usando para ello el radio del método establecerRadio()
     * @return double
     */
    public double obtenerDiametro() {
        return radio * 2;
    }


    
    /** 
     * Calcula el perímetro del círculo, para ello hace uso del método obtenerDiametro()
     * @return double
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    
    /** 
     * Calcula el área del círculo, para ello obtiene el radio, que debe ser establecido en establecerRadio()
     * @return double
     */
    public double obtenerAreaCirculo() {
        return Math.PI * radio * radio;
    }

    
    /** 
     * Construye la sentencia para posteriormente usarla con un system.out.print y mostrar la información de forma ordenada
     * @return String
     */
    @Override
    public String toString() {
        return "Centro = [" + coordenadaX + "," + coordenadaY + "]; Radio = " + radio;
    }
    /**
     * Modifica las coordenadas para trasladar el centro del círculo 5 unidades en cada coordenada
     */
    public void trasladarCentro(){
        coordenadaX=coordenadaX + 5;
        coordenadaY=coordenadaY + 5;
    }
    
    
    /** 
     * Devuelve el valor de la coordenadaX
     * @return int
     */
    public int a(){
        return coordenadaX;
    }
}

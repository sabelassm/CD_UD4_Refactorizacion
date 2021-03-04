package circulo;

/**
 * Pruebas de refactorización en NetBeans con la clase Circulo
 * @author profesor
 */
public class Circulito {

    private static final double LIMITERADIO = 0.0;
    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    public Circulito() {
    }

    public Circulito(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        establecerRadio(valorRadio);
    }

    
    /**
     * @param valorX
     */
    public void establecerX(int valorX) {
        coordenadaX=valorX;
    }

    
    /** 
     * Establece el valor de X
     * @return int
     */
    public int obtenerX() {
        return coordenadaX;
    }

    
    /** 
     * Establece el valor de Y
     * @param valorY
     */
    public void establecerY(int valorY) {
        coordenadaY=valorY;
    }

    
    
     @return int
    
    public int obtenerY() {
        return coordenadaY;
    }

    
    /** 
     * Establece el valor del Radio
     * @param valorRadio
     */
    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < LIMITERADIO ? 0.0 : valorRadio);
    }

    
    /** 
     * @return double
     */
    public double obtenerRadio() {
        return radio;
    }

    
    /** 
     * Obtiene el valor del Diametro
     * @return double
     */
    public double obtenerDiametro() {
        return radio * 2;
    }


    
    /** 
     * Obtiene la circunferencia
     * @return double
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    
    /** 
     * Obtiene el Area del Circulo
     * @return double
     */
    public double obtenerAreaCirculo() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Centro = [" + coordenadaX + "," + coordenadaY + "]; Radio = " + radio;
    }

    public void trasladarCentro(){
        coordenadaX=coordenadaX + 5;
        coordenadaY=coordenadaY + 5;
    }
    
    public int a(){
        return coordenadaX;
    }
}

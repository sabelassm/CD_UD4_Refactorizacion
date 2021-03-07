package Circulito;

/**
 * Pruebas de refactorización en NetBeans con la clase Circulito
 * @author profesor
 */
public class Circulito {

    private static final double LIMITERADIO = 0.0;
    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    public Circulito() {
    }

    public Circulito(int valorcoordenadaX, int valorY, double valorRadio) {
        coordenadaX = valorcoordenadaX;
        coordenadaY = valorY;
        establecerRadio(valorRadio);
    }

    
    /** 
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
     * @return double
     */
    public double obtenerDiametro() {
        return radio * 2;
    }


    
    /** 
     * @return double
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    
    /** 
     * @return double
     */
    public double ObtenerAreaCirculo() {
        return Math.PI * radio * radio;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Centro = [" + coordenadaX + "," + coordenadaY + "]; Radio = " + radio;
    }

    public void trasladarCentro(){
        coordenadaX=coordenadaX + 5;
        coordenadaY=coordenadaY + 5;
    }
    
    
    /** 
     * @return int
     */
    public int a(){
        return coordenadaX;
    }
}

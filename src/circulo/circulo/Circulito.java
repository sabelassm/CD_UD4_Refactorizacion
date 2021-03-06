package circulo;


/**
 * Pruebas de refactorización en NetBeans con la clase Circulo
 * 
 * @author profesor
 */
public class Circulito {

    private static final double LIMITERADIO = 0.0;
    private int CoordenadaX;
    private int CoordenadaY;
    private double radio;

    public Circulito() {
    }

    public Circulito(int valorX, int valorY, double valorRadio) {
       this.CoordenadaX = valorX;
       this.CoordenadaY = valorY;
       this.radio = valorRadio;
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
    public double obtenerAreacirculo() {
        return Math.PI * radio * radio;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Centro = [" + CoordenadaX + "," + CoordenadaY + "]; Radio = " + radio;
    }

    public void trasladarCentro() {
        CoordenadaX = CoordenadaX + 5;
        CoordenadaY = CoordenadaY + 5;
    }

    
    /** 
     * @return int
     */
    public int a() {
        return CoordenadaX;
    }

    
    /** 
     * @return double
     */
    public static double getLimiteradio() {
        return LIMITERADIO;
    }

    
    /** 
     * @return int
     */
    public int getCoordenadaX() {
        return CoordenadaX;
    }

    
    /** 
     * @param coordenadaX
     */
    public void setCoordenadaX(int coordenadaX) {
        CoordenadaX = coordenadaX;
    }

    
    /** 
     * @return int
     */
    public int getCoordenadaY() {
        return CoordenadaY;
    }

    
    /** 
     * @param coordenadaY
     */
    public void setCoordenadaY(int coordenadaY) {
        CoordenadaY = coordenadaY;
    }

    
    /** 
     * @return double
     */
    public double getRadio() {
        return radio;
    }

    
    /** 
     * @param radio
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
}

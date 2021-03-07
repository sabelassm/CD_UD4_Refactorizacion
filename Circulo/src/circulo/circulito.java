package circulo;
/**
 * Mantemos package circulo ao estar asociado ao proxecto con ese nome.
 */
/**
 * Pruebas de refactorización en NetBeans con la clase circulito
 * @author profesor
 */
public class circulito {


    /**
     * Renomeamos os campos X e Y a coordenadaX e coordenadaY. 
     * Creamos a constante LIMITERADIO
     */
    private static final double LIMITERADIO = 0.0;
    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    public circulito() {
    }
    /**
     * Vemos como afecta o cambio superior dos campos e se ve reflexado correctamente en todo o documento.
     */
    public circulito(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        establecerRadio(valorRadio);
    }

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
        return coordenadaY;
    }

    
    /** 
     * Devolve o radio do círculo.
     * @param valorRadio
     */
    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < LIMITERADIO ? 0.0 : valorRadio);
    }

    
    /** 
     * Devolve o doble do radio.
     * @return double
     */
    public double obtenerRadio() {
        return radio;
    }

    public double obtenerDiametro() {
        return radio * 2;
    }

    
    /** 
     * Devolve o doble da circunferencia.
     * @return double
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    
    /** 
     * Obtén a área do círculo.
     */
    public double ObtenerAreaCirculo() {
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

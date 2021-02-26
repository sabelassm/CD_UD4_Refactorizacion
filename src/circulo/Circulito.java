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

    /**
     * Constructor vacio
     */
    public Circulito() {
    }

    /**
     * Constructor por parametros
     * @param valorX int, define o valor da cordenada x
     * @param valorY int , define o calor da cordena y
     * @param valorRadio int, define o valor do radio
     */
    public Circulito(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        radio=(valorRadio < LIMITERADIO ? LIMITERADIO : valorRadio);
    }

    /**
     * Metodo que calcula o diametro do circulo
     * @return diametro, o doble do radio
     */
    public double obtenerDiametro() {
        return radio * 2;
    }

    /**
     * Metodo que calcula o valor da lonxitude da circunferencia.
     * @return lonxitude da circunferencia
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    /**
     * Metodo que calcula a area do circulo
     * @return area
     */
    public double obtenerAreaCirculo() {
        return Math.PI * radio * radio;
    }

    /**
     * Convirte os datos do circulo nun String
     * @return cadena cos datos do ciruculo
     */
    @Override
    public String toString() {
        return "Centro = [" + coordenadaX + "," + coordenadaY + "]; Radio = " + radio;
    }

    /**
     * Desplaza o centro do circulo, desplazando en 5 unidades o eixe X e en outras 5 o eixe Y
     */
    public void trasladarCentro(){
        coordenadaX=coordenadaX + 5;
        coordenadaY=coordenadaY + 5;
    }
    
    /**
     * Devolve a cordenada X
     * @return cordenadaX
     */
    public int a(){
        return coordenadaX;
    }

    /**
     * Devolver a cordenada X
     * @return cordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * Permite modificar o valor da cordenadaX
     * @param coordenadaX, valor que tomara cordenanaX do circulo
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * Devolver a cordenada Y
     * @return cordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * Permite modificar o calor da cordena Y
     * @param coordenadaY valor que tomara a cordenadaY do circulo
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * Devolver o radio
     * @return radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Permite modificar o radio do circulo
     * @param radio valor que tomara o radio do circulo
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
}

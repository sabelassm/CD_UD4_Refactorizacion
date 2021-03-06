package circulo;


/**
 * Pruebas de refactorización en NetBeans con la clase Circulo
 * 
 * @author Alvaro
 */
public class Circulito {
/**
 * variables del la clase.
 */
    private static final double LIMITERADIO = 0.0;
    private int CoordenadaX;
    private int CoordenadaY;
    private double radio;

    public Circulito() {
    }
/**
 * Contructor de la clase circulito
 */
    public Circulito(int valorX, int valorY, double valorRadio) {
       this.CoordenadaX = valorX;
       this.CoordenadaY = valorY;
       this.radio = valorRadio;
    }
    

/** 
 * @return double
 */
/*
 * obtiene el diametro 
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
 * obtiene el area 
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
/**
 * traslada el centro a 5+
 */
    public void trasladarCentro() {
        CoordenadaX = CoordenadaX + 5;
        CoordenadaY = CoordenadaY + 5;
    }

/** 
 * devuelve vaariable limiteradio 
 */
    public static double getLimiteradio() {
        return LIMITERADIO;
    }
/**
 * devuleve la coordenada x 
 */
    public int getCoordenadaX() {
        return CoordenadaX;
    }
/**
 * establece la coordenada x
 */
    public void setCoordenadaX(int coordenadaX) {
        CoordenadaX = coordenadaX;
    }
/**
 * devuleve la coordenada y 
 */
    public int getCoordenadaY() {
        return CoordenadaY;
    }
/**
 * establece la coordenada y 
 */
    public void setCoordenadaY(int coordenadaY) {
        CoordenadaY = coordenadaY;
    }
/**
 * devuleve el radio 
 */
    public double getRadio() {
        return radio;
    }
/**
 * establece el radio 
 */
    public void setRadio(double radio) {
        this.radio = radio;
    }
}

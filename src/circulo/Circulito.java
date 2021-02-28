package circulo;

/**
 * Pruebas de refactorización en NetBeans con la clase Circulo
 * @author profesor
 */
public class Circulito {
	
	/**
	 * @param LIMITERADIO limite radio
	 * @param coordenadaX coordenada X
	 * @param coordenadaY corrdenada Y
	 * @param radio radio
	 */
	
    private static final double LIMITERADIO = 0.0;
	private int coordenadaX;
    private int coordenadaY;
    private double radio;

    /**
     *  Circulito
     */
    public Circulito() {
    }
    
    /**
     * @param valorX valor X
     * @param valorY valor Y
     * @param valorRadio valor del radio
     */
    public Circulito(int valorX, int valorY, double valorRadio) {
        setCoordenadaX(valorX);
        setCoordenadaY(valorY);
        establecerRadio(valorRadio);
    }
    
    /**
     * @param valorX establece x
     */
    public void establecerX(int valorX) {
        setCoordenadaX(valorX);
    }
    
    /**
     * @return obtiene x
     */
    public int obtenerX() {
        return getCoordenadaX();
    }
    
    /**
     * @param valorY establece Y
     */
    public void establecerY(int valorY) {
        setCoordenadaY(valorY);
    }
    
    /**
     * @return obtiene Y
     */
    public int obtenerY() {
        return getCoordenadaY();
    }
    
    /**
     * @param valorRadio valor del radio
     */
    public void establecerRadio(double valorRadio) {

        setRadio((valorRadio < LIMITERADIO ? 0.0 : valorRadio));
    }
    
    /** 
     * @return obtiene radio
     */
    public double obtenerRadio() {
        return getRadio();
    }
    
    /**
     * @return obtiene diametro
     */
    public double obtenerDiametro() {
        return getRadio() * 2;
    }

    /**
     * @return obtiene circunferencia
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    /**
     * @return obtiene area
     */
    public double obtenerAreaCirculo() {
        return Math.PI * getRadio() * getRadio();
    }

    /**
     * @return obtiene centro
     */
    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    /**
     * traslada centro
     */
    public void trasladarCentro(){
        setCoordenadaX(getCoordenadaX() + 5);
        setCoordenadaY(getCoordenadaY() + 5);
    }
 
    /**
     * @return  devulve coordenada X
     */
    public int a(){
        return getCoordenadaX();
    }

	private int getCoordenadaX() {
		return coordenadaX;
	}


	private void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}


	private int getCoordenadaY() {
		return coordenadaY;
	}


	private void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	private double getRadio() {
		return radio;
	}
	
	private void setRadio(double radio) {
		this.radio = radio;
	}
}

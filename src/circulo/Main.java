package circulo;

import java.text.DecimalFormat;

/**
 * Obtiene diámetro, perímetro y area dados las coordenadas y el radio del cículo
 * @author Pablo BOurdelande García
 */
public class Main {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Circulito circulo = new Circulito(37,43,2.5);
        String salida =
                "La coordenada X es "+circulo.getX()+
                "\nLa coordenada Y es "+circulo.getY()+
                "\nEl radio es "+circulo.obtenerRadio();
        circulo.setX(35);
        circulo.setY(20);
        circulo.establecerRadio(4.2);
        DecimalFormat dosDigitos = new DecimalFormat("0.00");
        salida+="\nEl diámetro es "+dosDigitos.format(circulo.obtenerDiametro());
        salida+="\nLa circunferencia es "+dosDigitos.format(circulo.obtenerCircunferencia());
        salida+="\nEl área es "+dosDigitos.format(circulo.obtenerAreaCirculo());
        System.out.println(salida);
        
        System.out.println(salida);
        System.exit(0);
    }

}

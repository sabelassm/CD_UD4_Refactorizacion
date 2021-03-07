package circulo;

import java.text.DecimalFormat;

/**
 * Pruebas de refactorización en NetBeans con la clase circulito
 * @author profesor
 */
public class Main {
    public static void main(String[] args) {
        circulito circulito = new circulito(37,43,2.5);
        String salida =
                "La coordenada X es "+circulito.getX()+
                "\nLa coordenada Y es "+circulito.getY()+
                "\nEl radio es "+circulito.obtenerRadio();
        circulito.setX(35);
        circulito.setY(20);
        circulito.establecerRadio(4.2);
        DecimalFormat dosDigitos = new DecimalFormat("0.00");
        salida+="\nEl diámetro es "+dosDigitos.format(circulito.obtenerDiametro());
        salida+="\nLa circunferencia es "+dosDigitos.format(circulito.obtenerCircunferencia());
        salida+="\nEl área es "+dosDigitos.format(circulito.ObtenerAreaCirculo());
        System.out.println(salida);
        
        System.out.println(salida);
        System.exit(0);
    }

}

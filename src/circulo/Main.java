package pruebaCirculito;

import java.text.DecimalFormat;

/**
 * Pruebas de refactorización en NetBeans con la clase Circulo
 * @author profesor
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Se crea un objeto Circulito con los valores pasados como parametros
         */
        Circulito circulo = new Circulito(37,43,2.5);
        /**
         * Cadena de caracteres que después se imprimirá por pantalla 
         * Usa metodos getter y setter para acceder a los datos de Circulito
         */
        String salida =
                "La coordenada X es "+circulo.getCoordenadaX()+
                "\nLa coordenada Y es "+circulo.getCoordenadaY()+
                "\nEl radio es "+circulo.obtenerRadio();
        circulo.setCoordenadaX(35);
        circulo.setCoordenadaY(20);
        circulo.establecerRadio(4.2);
        /**
         * Da formato de dos decimales cuando se use 
         */ 
        DecimalFormat dosDigitos = new DecimalFormat("0.00");
        /**
         * Añade a la salida más información
         */
        salida+="\nEl diámetro es "+dosDigitos.format(circulo.obtenerDiametro());
        salida+="\nLa circunferencia es "+dosDigitos.format(circulo.obtenerCircunferencia());
        salida+="\nEl área es "+dosDigitos.format(circulo.obtenerAreaCirculo());
        /**
         * Impresion en pantalla de las salidas
         */
        System.out.println(salida);
        
        System.out.println(salida);
        /**
         * 
         */
        System.exit(0);
    }

}

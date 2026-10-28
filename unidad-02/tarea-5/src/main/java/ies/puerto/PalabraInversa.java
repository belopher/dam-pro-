package ies.puerto;

import java.util.Scanner;

/**
 * @author belopher
 * @version 1.0.0
 */
public class PalabraInversa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una palabra:");
        String sPalabra = teclado.nextLine();
        String sInvertida = reverse(sPalabra);
        System.out.println("Palabra invertida: "+sInvertida);
    }

    /**
     * Crea una palabra o texto invertida a la original
     * @param palabra String Palabra/texto original
     * @return String Cadena Invertida
     */
    static String reverse(String palabra){
        StringBuilder resultado = new StringBuilder();
        if (palabra == null || palabra.isEmpty()){
            return resultado.toString();
    }
        // size/length |0|-> a 8 - 1 = 7 -> a
        //palabra = |a|l|m|e|n|d|r|a| -> |a|r|d|n|e|m|l|a|
        for (int i = palabra.length() -1; i >= 0; i--) {
           char caracter = palabra.charAt(i);
           resultado.append(caracter);
        }
        return resultado.toString();
    }

}

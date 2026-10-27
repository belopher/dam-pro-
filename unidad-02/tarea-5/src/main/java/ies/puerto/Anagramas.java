package ies.puerto;
/**
 * @author belopher
 * @version 1.0.0
 */

import java.util.Locale;
import java.util.Scanner;

public class Anagramas {
    static void main() {
Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la primera palabra");
        String sPalabra1 = teclado.nextLine();
        System.out.println("Introduce la segunda palabra");
        String sPalabra2 = teclado.nextLine();
        boolean bAnagrama =esAnagramas(sPalabra1,sPalabra2);
        System.out.println("Las palabras son Anagramas=" +bAnagrama);
    }

    /**
     * Funcion que verifica si dos palabras son anagrama
     * @param palabra1 String palabra 1 del anagrama
     * @param palabra2 String palabra 2 del anagrama
     * @return true/false
     */
    static boolean esAnagramas(String palabra1, String palabra2) {
        if (palabra1 == null || palabra1.isEmpty()) {
            return false;
        }
        if (palabra2 == null || palabra2.isEmpty()) {
            return false;
        }

        palabra1 = palabra1.toLowerCase();
        palabra1 = palabra1.replace(" ", "");
        palabra2 = palabra2.toLowerCase();
        palabra2 = palabra2.replace(" ", "");

        if (palabra1.length() != palabra2.length()){
            return false;
        }

        for (int i = 0; i < palabra1.length(); i++) {
            char letraPalbra1 = palabra1.charAt(i);
            char letraPalabra2 = palabra2.charAt(palabra1.length() -1-i);
            if (letraPalbra1 != letraPalabra2) {
                return false;
            }
        }
            return true;
        }
    }
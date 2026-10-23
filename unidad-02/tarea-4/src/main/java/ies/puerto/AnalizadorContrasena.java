package ies.puerto;

import javax.swing.text.AttributeSet;
import java.util.Scanner;

/**
 * @author belopher
 * @version 1.0.0
 */
public class AnalizadorContrasena {

    /**
     * Programa principal
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la cadena");
        String sContrasenia = teclado.nextLine();
        String resultado = generarInforme(sContrasenia);
        System.out.println(resultado);
    }

    /**
     * Funcion que cuenta el numero de mayusculas de una cadena
     * @param sContrasenia String cadena de texto
     * @return int con el numero de mayusculas
     */
    static int contarMayusculas(String sContrasenia){
        int numero = 0;
        //Java2026! |J|a|v|a|2|0|2|6|!|
        //          |0|1|2|3|4|5|6|7|8|
        //Character.isUpperCase(c);
        for (int i = 0; i < sContrasenia.length(); i++){
            char caracter = sContrasenia.charAt(i);

            if  (Character.isUpperCase(caracter)){
                numero++;
            }
        }
        return  numero;
    }
    static int contarMinusculas(String sContrasenia){
        int numero = 0;
        return sContrasenia.length() - contarMayusculas(sContrasenia) - contarDigitos(sContrasenia) - contarSimbolos(sContrasenia);
        //Java2026! |J|a|v|a|2|0|2|6|!|
        //          |0|1|2|3|4|5|6|7|8|
        //Character.isUpperCase(c);
        /*
        for (int i = 0; i < sContrasenia.length(); i++){
            char caracter = sContrasenia.charAt(i);
            if (Character.isAlphabetic(caracter) && Character.isLowerCase(caracter)){
                numero++;
                }
            }*/

        }
    static int contarDigitos(String sContrasenia){
        int numero = 0;
        //Java2026! |J|a|v|a|2|0|2|6|!|
        //          |0|1|2|3|4|5|6|7|8|
        //Character.isUpperCase(c);
        for (int i = 0; i < sContrasenia.length(); i++){
            char caracter = sContrasenia.charAt(i);
            if (Character.isDigit(caracter)){
                numero++;
            }
        }
        return  numero;
    }
    static int contarSimbolos(String sContrasenia){
        int numero = 0;
        //numero = 9 - 1 - 4 - 1
        //Java2026! |J|a|v|a|2|0|2|6|!|
        //          |0|1|2|3|4|5|6|7|8|
        //Character.isUpperCase(c);
        for (int i = 0; i < sContrasenia.length(); i++){
            char caracter = sContrasenia.charAt(i);
            if (!Character.isLetterOrDigit(caracter)){
                numero++;
            }
        }
        return  numero;
    }
    static boolean tieneLongitudMinima(String sContrasenia) {
        if (sContrasenia.length() >= 8){
            return false;
        }
        return true;
    }

    static boolean esContrasenaValida(String sContrasenia){
        if (!tieneLongitudMinima(sContrasenia)){
            return false;
        }
        if (contarMayusculas(sContrasenia) < 1){
            return false;
        }
        if (contarDigitos(sContrasenia) < 1){
            return false;
        }
        if (contarMinusculas(sContrasenia) < 1){
            return false;
        }
        return true;
    }
    static String generarInforme(String sContrasenia){
        return "Digitos:" +contarDigitos(sContrasenia)
             +"Resultado:" +esContrasenaValida(sContrasenia);
    }
}




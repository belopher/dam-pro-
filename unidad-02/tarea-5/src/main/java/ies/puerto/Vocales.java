package ies.puerto;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author belopher
 * @version 1.0.0
 */
public class Vocales {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cadena de texto");
        String cadena = teclado.nextLine();
        int resultado = contarVolcales(cadena);
        System.out.println("El numero de vocales es: " +resultado);
    }

    static int contarVolcales(String sCadena){
        if (sCadena == null || sCadena.isEmpty()){
            return 0;
        }
        int resultado = 0;
        sCadena = sCadena.toLowerCase();
        for (int i = 0; i < sCadena.length(); i++) {
           char caracter = sCadena.charAt(i);
           if (caracter == 'a' ||caracter == 'e' ||caracter == 'i' ||caracter == 'o' ||caracter == 'u'||
            caracter == 'á' ||caracter == 'é' ||caracter == 'í' ||caracter == 'ó' ||caracter == 'ú' ){
               resultado = resultado +1;
           }
        }

        return resultado;
    }
    static int contarVolcales2(String sCadena){
        if (sCadena == null || sCadena.isEmpty()){
            return 0;
        }
        int resultado = 0;
        sCadena = sCadena.toLowerCase();
        for (int i = 0; i < sCadena.length(); i++) {
            char caracter = sCadena.charAt(i);
            switch (caracter){
                case'a':case'e':case'i':case'o':
                case'u':case'á':case'é':case'í':
                case'ó':case'ú':
                resultado = resultado +1;
            }




            if (caracter == 'a' ||caracter == 'e' ||caracter == 'i' ||caracter == 'o' ||caracter == 'u'||
                    caracter == 'á' ||caracter == 'é' ||caracter == 'í' ||caracter == 'ó' ||caracter == 'ú' ){
                resultado = resultado +1;
            }
        }

        return resultado;
    }

}



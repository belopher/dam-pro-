package ies.puerto;

import java.util.Scanner;

/**
 *@author belopher
 *@version 1.0.0
 */
public class Main {
    static void main() {
        Scanner scanner =new Scanner(System.in);
        boolean salir = false;
        int opcion = 0;
        System.out.println("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Bienvenida/o, " + nombre);
        int contador = 0;

        while (!salir) {
            System.out.println("=========================================");
            System.out.println("1. Kilómetros a metros");
            System.out.println("2. Metros a centímetros");
            System.out.println("3. Kilómetros a millas");
            System.out.println("4. Salir");
            System.out.println("~~ Selecciona una opción ~~");
            System.out.println("=========================================");
            opcion = scanner.nextInt();
            float metros = 0;
            float kilometros = 0;
            float millas = 0;
            float centimetros = 0;

            switch (opcion) {
                case 1:
                    System.out.println("Introduzca los kilómetros");
                    kilometros = scanner.nextFloat();
                    metros = kilometros * 1000;
                    System.out.println("Resultado: " + metros);
                    System.out.println("Operación realizada exitosamete");
                    contador ++;
                    break;

                case 2:
                    System.out.println("Introduzca los metros");
                    metros = scanner.nextFloat();
                    centimetros = metros * 100;
                    System.out.println("Resultado: " + centimetros);
                    System.out.println("Operación realizada exitosamente");
                    contador ++;
                    break;

                case 3:
                    System.out.println("Introduzca los kilómetros");
                    kilometros = scanner.nextFloat();
                    millas = (float) (kilometros * 0.621371);
                    System.out.println("Resultado: " + millas);
                    System.out.println("Operación realizada exitosamente");
                    contador ++;
                    break;

                case 4:
                    System.out.println("          Usuario: " +nombre);
                    System.out.println("Haz realizado " +contador+ " operaciones");
                    System.out.println("Gracias por utilizar la calculadora");
                    return;

                default:
                    System.out.println("No");
                    break;


            }
        }
    }
}



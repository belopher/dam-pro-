package ies.puerto;

import java.util.Scanner;

/**
 * @author belopher
 * @version 1.0.0
 */
public class AlgoritmoEuclides {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primero numero: ");
        int numero1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int numero2 = teclado.nextInt();

        int resultado = calcularMaximoComunDivisor(numero1, numero2);
        System.out.println("El maximo comun divisor es: " +resultado);
    }

    /**
     * Funcion que reliza el maximo comun divisor
     * @param numero1
     * @param numero2
     * @return
     */
    static int calcularMaximoComunDivisor(int numero1, int numero2){
    int resultado = 0;
    numero1 = Math.abs(numero1);
    numero2 = Math.abs(numero2);

    while (numero2 != 0){
        int resto = numero1 % numero2;
        numero1 =numero2;
        numero2 = resto;
    }
    return numero1;

    }
}

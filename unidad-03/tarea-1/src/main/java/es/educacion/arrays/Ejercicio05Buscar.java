package es.educacion.arrays;

/**
 * @author belopher
 * @version 1.0.0
 */
public final class Ejercicio05Buscar {
    private Ejercicio05Buscar() { }

    //|8|3|5|6|
    //|0|1|2|3|

    // Devuelve el índice de la primera aparición o -1. No requiere ordenar. Null: IllegalArgumentException.
    public static int buscar(int[] numeros, int objetivo) {
     if (numeros == null || numeros.length == 0){
         throw new IllegalArgumentException();
     }
        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            if (numero == objetivo){
                return i;
            }
        } return -1;

    }
}

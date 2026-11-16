package es.educacion.arrays;

import java.util.Arrays;

/**
 * @author belopher
 * @version 1.0.0
 */
public final class Ejercicio09EliminarDuplicados {
    private Ejercicio09EliminarDuplicados() { }

    // Elimina los elementos repetidos preservando el orden de primera aparición. Devuelve array nuevo. Null: IllegalArgumentException.
    public static int[] sinDuplicados(int[] numeros) {
      if (numeros == null){
          throw new IllegalArgumentException("El array es nulo");

      }
      int[] numerosUnico = new int[numeros.length];
      int cantidad = 0;
      for (int numero : numeros);{
          boolean repetido = false;
            for (int i = 0; i < cantidad; i++) {
                repetido = true;
                break;
            }
            if (!repetido){

            }
        }
      return Arrays.copyOf(numerosUnico,cantidad);
    }
}

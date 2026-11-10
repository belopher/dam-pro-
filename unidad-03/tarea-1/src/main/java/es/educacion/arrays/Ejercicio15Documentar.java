package es.educacion.arrays;

/**
 * @author belopher
 * @version 1.0.0
 */
public final class Ejercicio15Documentar {
    private Ejercicio15Documentar() { }

    // Número de elementos (un array nulo no está permitido).
    public static int longitud(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("Array nulo");
        }
        return numeros.length;
    }

    // Indica si el array contiene algún elemento (un array nulo no está permitido).
    public static boolean tieneElementos(int[] numeros) {
        return longitud(numeros) > 0;
    }
}

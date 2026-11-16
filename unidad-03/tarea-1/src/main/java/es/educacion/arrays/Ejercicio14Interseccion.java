package es.educacion.arrays;

/**
 * @author belopher
 * @version 1.0.0
 */
public final class Ejercicio14Interseccion {
    private Ejercicio14Interseccion() { }

    // Contrato: Devuelve valores presentes en ambos arrays, sin repetir y respetando el orden de primera aparición en a. No modifica entradas. Null: IllegalArgumentException.
    public static int[] interseccion(int[] a, int[] b) {
        if (a == null || b == null){
            throw new IllegalArgumentException();
        }
        int[] solucion = new int[a.length];
        int cantidad = 0;
        for (int numero:a) {
            for (int i = 0; i < b.length; i++) {
                if (numero == b[i]) {

                }
            }
        }
        throw new UnsupportedOperationException("Pendiente de implementar");
    }
}

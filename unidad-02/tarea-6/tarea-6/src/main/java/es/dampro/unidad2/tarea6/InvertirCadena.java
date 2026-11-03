package es.dampro.unidad2.tarea6;

/**
 * @author belopher
 * @version 1.0.0
 */
public final class InvertirCadena {

    private InvertirCadena() {
        // Clase de algoritmos estáticos.
    }

    /**
     * @param texto texto a invertir; no puede ser null
     * @return el texto con los caracteres en orden inverso
     * @throws IllegalArgumentException si el texto es null
     */
    public static String invertir(String texto) {
        if (texto == null) {
            throw new IllegalArgumentException("El texto no puede ser null");
        }
        char[] caracteres = texto.toCharArray();
        int izquierda = 0;
        int derecha = caracteres.length - 1;
        while (izquierda < derecha) {
            char intercambio = caracteres[izquierda];
            caracteres[izquierda] = caracteres[derecha];
            caracteres[derecha] = intercambio;
            izquierda++;
            derecha--;
        }
        return new String(caracteres);
    }
}

package es.dampro.unidad2.tarea6;

/**
 * @author belopher
 * @version 1.0.0
 */


public class ContadorVocales {

    private static final String VOCALES = "aeiouáéíóúü";

    /**
     * Utilidad para contar vocales en un texto.
     * Cuenta las vocales (a, e, i, o, u), con tilde y ü, en mayúsculas o
     * minúsculas. El resto de caracteres se ignora.

     * @param texto texto a analizar; no puede ser null
     * @return número de vocales encontradas
     * @throws IllegalArgumentException si el texto es null
     */
    public int contarVocales(String texto) {
        if (texto == null) {
            throw new IllegalArgumentException("El texto no puede ser null");
        }
        int total = 0;
        for (char caracter : texto.toCharArray()) {
            if (VOCALES.indexOf(Character.toLowerCase(caracter)) >= 0) {
                total++;
            }
        }
        return total;
    }
}

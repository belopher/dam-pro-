package es.dampro.unidad2.tarea6;

/**
 * @author belopher
 * @version 1.0.0
 */
/**
 * Utilidad para comprobar si un texto es palíndromo.
 */
public class Palindromo {

    /**
     * Comprueba si un texto se lee igual de izquierda a derecha y viceversa.
     * Ignora espacios y diferencias entre mayúsculas y minúsculas, pero no
     * ignora signos de puntuación ni tildes. Un texto vacío (o solo con
     * espacios) no se considera palíndromo.
     *
     * @param texto texto a comprobar; no puede ser null
     * @return true si el texto es palíndromo, false en caso contrario
     * @throws IllegalArgumentException si el texto es null
     */
    public boolean esPalindromo(String texto) {
        if (texto == null) {
            throw new IllegalArgumentException("El texto no puede ser null");
        }
        StringBuilder normalizado = new StringBuilder();
        for (char caracter : texto.toCharArray()) {
            if (!Character.isWhitespace(caracter)) {
                normalizado.append(Character.toLowerCase(caracter));
            }
        }
        if (normalizado.length() == 0) {
            return false;
        }
        int izquierda = 0;
        int derecha = normalizado.length() - 1;
        while (izquierda < derecha) {
            if (normalizado.charAt(izquierda) != normalizado.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }
}
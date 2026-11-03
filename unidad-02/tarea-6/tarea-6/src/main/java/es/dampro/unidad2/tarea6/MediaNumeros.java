package es.dampro.unidad2.tarea6;

/**
 * @author belopher
 * @version 1.0.0
 */

public class MediaNumeros {
    /**
     * Utilidad para calcular la media de una lista de enteros.
     */
    private static final String SEPARADOR = ",";

    /**
     * Calcula la media aritmética de una lista de enteros separados por comas,
     * con espacios opcionales. El resultado no se redondea.
     *
     * @param numeros lista de enteros separados por comas; no puede ser null ni vacía
     * @return la media de los números
     * @throws IllegalArgumentException si el texto es null o está vacío
     * @throws NumberFormatException    si algún elemento no es un entero válido
     */
    public double calcularMedia(String numeros) {
        if (numeros == null || numeros.isBlank()) {
            throw new IllegalArgumentException("La lista no puede ser null ni vacía");
        }
        String[] elementos = numeros.split(SEPARADOR, -1);
        long suma = 0;
        for (String elemento : elementos) {
            suma += Integer.parseInt(elemento.trim());
        }
        return (double) suma / elementos.length;
    }
}
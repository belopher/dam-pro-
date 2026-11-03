package es.dampro.unidad2.tarea6;

/**
 * @author belopher
 * @version 1.0.0
 */



public class MayorNumero {

    private static final String SEPARADOR = ",";

    /**
     * Utilidad para obtener el mayor número de una lista de enteros.
     * Extrae el mayor entero de una lista separada por comas. Admite números
     * negativos y espacios alrededor de cada elemento.
     *
     * @param numeros lista de enteros separados por comas; no puede ser null ni vacía
     * @return el mayor entero de la lista
     * @throws IllegalArgumentException si el texto es null o está vacío
     * @throws NumberFormatException    si algún elemento no es un entero válido
     */
    public int obtenerMayor(String numeros) {
        if (numeros == null || numeros.isBlank()) {
            throw new IllegalArgumentException("La lista no puede ser null ni vacía");
        }
        String[] elementos = numeros.split(SEPARADOR, -1);
        int mayor = Integer.parseInt(elementos[0].trim());
        for (int posicion = 1; posicion < elementos.length; posicion++) {
            int actual = Integer.parseInt(elementos[posicion].trim());
            if (actual > mayor) {
                mayor = actual;
            }
        }
        return mayor;
    }
}
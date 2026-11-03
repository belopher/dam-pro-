package es.dampro.unidad2.tarea6;

/**
 * @author belopher
 * @version 1.0.0
 */


public class BinarioDecimal {

    /**
     * Utilidad para convertir números binarios a decimal.
     * Convierte una cadena formada solo por ceros y unos a su valor decimal.
     *
     * @param binario cadena binaria; no puede ser null ni vacía
     * @return valor decimal del número binario
     * @throws IllegalArgumentException si el texto es null o está vacío
     * @throws NumberFormatException    si contiene caracteres distintos de '0' y '1'
     *                                  o si el valor no cabe en un int
     */
    public int convertirBinario(String binario) {
        if (binario == null || binario.isEmpty()) {
            throw new IllegalArgumentException("El binario no puede ser null ni vacío");
        }
        int resultado = 0;
        for (char caracter : binario.toCharArray()) {
            if (caracter != '0' && caracter != '1') {
                throw new NumberFormatException("Carácter no válido: " + caracter);
            }
            int bit = caracter - '0';
            if (resultado > (Integer.MAX_VALUE - bit) / 2) {
                throw new NumberFormatException("El valor desborda un int: " + binario);
            }
            resultado = resultado * 2 + bit;
        }
        return resultado;
    }
}
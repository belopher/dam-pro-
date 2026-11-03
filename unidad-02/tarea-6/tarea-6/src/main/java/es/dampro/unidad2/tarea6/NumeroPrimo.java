package es.dampro.unidad2.tarea6;

/**
 * @author belopher
 * @version 1.0.0
 */

public class NumeroPrimo {
    /**
     * Utilidad para comprobar si un número es primo.
     */
    private static final int MENOR_PRIMO = 2;

    /**
     * Decide si un número recibido como texto es primo. Los números menores
     * que 2 no son primos.
     *
     * @param numero entero en formato texto; no puede ser null ni vacío
     * @return true si el número es primo, false en caso contrario
     * @throws IllegalArgumentException si el texto es null o está vacío
     * @throws NumberFormatException    si el texto no es un entero válido
     */
    public boolean esPrimo(String numero) {
        if (numero == null || numero.isEmpty()) {
            throw new IllegalArgumentException("El número no puede ser null ni vacío");
        }
        int valor = Integer.parseInt(numero);
        if (valor < MENOR_PRIMO) {
            return false;
        }
        for (int divisor = 2; divisor <= valor / divisor; divisor++) {
            if (valor % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
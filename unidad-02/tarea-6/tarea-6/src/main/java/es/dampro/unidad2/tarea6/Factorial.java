package es.dampro.unidad2.tarea6;

/**
 * @author belopher
 * @version 1.0.0
 */

public class Factorial {
    /**
     * Utilidad para calcular factoriales.
     */
    private static final int MAXIMO = 12;

    /**
     * Calcula el factorial de un entero entre 0 y 12 (ambos incluidos).
     * El límite de 12 evita desbordar un int.
     *
     * @param numero entero en formato texto; no puede ser null ni vacío
     * @return el factorial del número
     * @throws IllegalArgumentException si el texto es null, vacío o el número
     *                                  está fuera del rango 0 a 12
     * @throws NumberFormatException    si el texto no es un entero válido
     */
    public int calcularFactorial(String numero) {
        if (numero == null || numero.isEmpty()) {
            throw new IllegalArgumentException("El número no puede ser null ni vacío");
        }
        int valor = Integer.parseInt(numero);
        if (valor < 0 || valor > MAXIMO) {
            throw new IllegalArgumentException("El número debe estar entre 0 y " + MAXIMO);
        }
        int resultado = 1;
        for (int factor = 2; factor <= valor; factor++) {
            resultado *= factor;
        }
        return resultado;
    }
}
package es.dampro.unidad2.tarea6;

/**
 * @author belopher
 * @version 1.0.0
 */


public class SumaDigitos {

    /**
     * Utilidad para sumar los dígitos de un número entero positivo.
     * Suma los dígitos de un entero positivo indicado como texto.
     * Solo se admiten los caracteres del '0' al '9'; no se aceptan signos
     * ni espacios.

     * @param numero número en formato texto; no puede ser null ni vacío
     * @return suma de todos sus dígitos
     * @throws IllegalArgumentException si el texto es null o está vacío
     * @throws NumberFormatException    si contiene caracteres que no son dígitos
     */
    public int sumarDigitos(String numero) {
        if (numero == null || numero.isEmpty()) {
            throw new IllegalArgumentException("El número no puede ser null ni vacío");
        }
        int suma = 0;
        for (char caracter : numero.toCharArray()) {
            if (caracter < '0' || caracter > '9') {
                throw new NumberFormatException("Carácter no válido: " + caracter);
            }
            suma += caracter - '0';
        }
        return suma;
    }
}
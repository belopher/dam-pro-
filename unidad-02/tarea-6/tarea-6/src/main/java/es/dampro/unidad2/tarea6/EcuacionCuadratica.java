package es.dampro.unidad2.tarea6;

/**
 * @author belopher
 * @version 1.0.0
 */

public class EcuacionCuadratica {
/**
 * Utilidad para trabajar con ecuaciones de segundo grado.
 */
    /**
     * Calcula el discriminante (b² - 4ac) de la ecuación ax² + bx + c = 0.
     * Los tres coeficientes deben ser números reales finitos y a distinto de cero.
     *
     * @param a coeficiente cuadrático en formato texto; no puede ser cero
     * @param b coeficiente lineal en formato texto
     * @param c término independiente en formato texto
     * @return el valor del discriminante
     * @throws IllegalArgumentException si algún texto es null o vacío, algún
     *                                  coeficiente no es finito, a es cero o
     *                                  el resultado no es finito
     * @throws NumberFormatException    si algún texto no es un número válido
     */
    public double calcularDiscriminante(String a, String b, String c) {
        double coeficienteA = convertir(a, "a");
        double coeficienteB = convertir(b, "b");
        double coeficienteC = convertir(c, "c");
        if (coeficienteA == 0) {
            throw new IllegalArgumentException("El coeficiente a debe ser distinto de cero");
        }
        double discriminante = coeficienteB * coeficienteB - 4 * coeficienteA * coeficienteC;
        if (!Double.isFinite(discriminante)) {
            throw new IllegalArgumentException("El discriminante no es un valor finito");
        }
        return discriminante;
    }

    /**
     * Convierte un coeficiente de texto a double, validando que sea finito.
     *
     * @param texto  coeficiente en formato texto
     * @param nombre nombre del coeficiente, usado en los mensajes de error
     * @return el coeficiente como double
     * @throws IllegalArgumentException si el texto es null, vacío o no es finito
     * @throws NumberFormatException    si el texto no es un número válido
     */
    private double convertir(String texto, String nombre) {
        if (texto == null || texto.isBlank()) {
            throw new IllegalArgumentException("El coeficiente " + nombre + " no puede ser null ni vacío");
        }
        double valor = Double.parseDouble(texto);
        if (!Double.isFinite(valor)) {
            throw new IllegalArgumentException("El coeficiente " + nombre + " debe ser finito");
        }
        return valor;
    }
}
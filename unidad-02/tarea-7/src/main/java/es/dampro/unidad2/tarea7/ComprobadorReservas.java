package es.dampro.unidad2.tarea7;

import java.time.LocalDateTime;

/**
 * Utilidad para detectar conflictos entre reservas.
 *
 * @author belopher
 * @version 1.0
 */
public final class ComprobadorReservas {

    /**
     * Comprueba si dos reservas con intervalo [inicio, fin) se solapan. Dos
     * reservas que solo coinciden en un extremo no se consideran solapadas.
     *
     * @param inicio1 inicio de la primera reserva
     * @param fin1    fin de la primera reserva; debe ser posterior a su inicio
     * @param inicio2 inicio de la segunda reserva
     * @param fin2    fin de la segunda reserva; debe ser posterior a su inicio
     * @return true si las reservas se solapan, false en caso contrario
     * @throws IllegalArgumentException si alguna fecha es null o algún fin no
     *                                  es posterior a su inicio
     */
    public static boolean haySolapamiento(LocalDateTime inicio1, LocalDateTime fin1,
                                          LocalDateTime inicio2, LocalDateTime fin2) {
        if (inicio1 == null || fin1 == null || inicio2 == null || fin2 == null) {
            throw new IllegalArgumentException("Las fechas no pueden ser null");
        }
        if (!fin1.isAfter(inicio1) || !fin2.isAfter(inicio2)) {
            throw new IllegalArgumentException("Cada fin debe ser posterior a su inicio");
        }
        return inicio1.isBefore(fin2) && inicio2.isBefore(fin1);
    }
}
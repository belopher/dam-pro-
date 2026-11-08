package es.dampro.unidad2.tarea7;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Utilidad para calcular cuántos días faltan para un evento.
 *
 * @author belopher
 * @version 1.0
 */
public final class CuentaAtrasEvento {

    /**
     * Calcula los días naturales con signo entre hoy y la fecha de un evento:
     * positivo si el evento aún no ha llegado, cero si es hoy y negativo si
     * ya ocurrió.
     *
     * @param hoy    fecha de referencia
     * @param evento fecha del evento
     * @return días naturales desde hoy hasta el evento, con signo
     */
    public static long calcularDiasRestantes(LocalDate hoy, LocalDate evento) {
        return ChronoUnit.DAYS.between(hoy, evento);
    }
}
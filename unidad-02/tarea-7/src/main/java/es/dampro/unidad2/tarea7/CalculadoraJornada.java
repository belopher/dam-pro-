package es.dampro.unidad2.tarea7;

import java.time.Duration;
import java.time.LocalTime;

/**
 * Utilidad para calcular el tiempo efectivo de una jornada laboral.
 *
 * @author belopher
 * @version 1.0
 */
public final class CalculadoraJornada {

    /**
     * Calcula el tiempo trabajado en una jornada dentro del mismo día,
     * descontando el tiempo de descanso.
     *
     * @param entrada          hora de entrada
     * @param salida           hora de salida; debe ser estrictamente posterior a la entrada
     * @param descansoMinutos  minutos de descanso a descontar; no puede ser negativo
     *                         ni superar la duración de la jornada
     * @return la duración efectiva trabajada
     * @throws IllegalArgumentException si alguna hora es null, la salida no es
     *                                  posterior a la entrada o el descanso es
     *                                  negativo o mayor que la jornada
     */
    public static Duration calcularTiempoTrabajado(LocalTime entrada, LocalTime salida, int descansoMinutos) {
        if (entrada == null || salida == null) {
            throw new IllegalArgumentException("Las horas no pueden ser null");
        }
        if (!salida.isAfter(entrada)) {
            throw new IllegalArgumentException("La salida debe ser posterior a la entrada");
        }
        Duration jornada = Duration.between(entrada, salida);
        Duration descanso = Duration.ofMinutes(descansoMinutos);
        if (descanso.isNegative() || descanso.compareTo(jornada) > 0) {
            throw new IllegalArgumentException("El descanso debe estar entre 0 y la duración de la jornada");
        }
        return jornada.minus(descanso);
    }
}
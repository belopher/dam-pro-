package es.dampro.unidad2.tarea7;

import java.time.LocalDateTime;

/**
 * Utilidad para calcular la hora de llegada de un viaje.
 *
 * @author belopher
 * @version 1.0
 */
public final class CalculadoraViaje {

    /**
     * Calcula la fecha y hora de llegada sumando una duración, expresada en
     * horas y minutos, a la fecha y hora de salida.
     *
     * @param salida  fecha y hora de salida
     * @param horas   horas de duración; no puede ser negativo
     * @param minutos minutos de duración; no puede ser negativo
     * @return la fecha y hora de llegada
     * @throws IllegalArgumentException si la salida es null o alguna cantidad es negativa
     */
    public static LocalDateTime calcularLlegada(LocalDateTime salida, long horas, long minutos) {
        if (salida == null) {
            throw new IllegalArgumentException("La salida no puede ser null");
        }
        if (horas < 0 || minutos < 0) {
            throw new IllegalArgumentException("Las horas y los minutos no pueden ser negativos");
        }
        return salida.plusHours(horas).plusMinutes(minutos);
    }
}
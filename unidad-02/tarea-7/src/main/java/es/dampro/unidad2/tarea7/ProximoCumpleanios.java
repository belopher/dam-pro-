package es.dampro.unidad2.tarea7;

import java.time.LocalDate;

/**
 * Utilidad para calcular la fecha del próximo cumpleaños de una persona.
 *
 * @author belopher
 * @version 1.0
 */
public final class ProximoCumpleanios {

    /**
     * Calcula la fecha del próximo cumpleaños, incluyendo el propio día de hoy
     * si coincide. Para quien nació el 29 de febrero, en los años no bisiestos
     * el cumpleaños se celebra el 28 de febrero (ajuste que realiza
     * {@link LocalDate#withYear(int)}).
     *
     * @param nacimiento fecha de nacimiento; no puede ser posterior a hoy
     * @param hoy        fecha de referencia desde la que se busca el cumpleaños
     * @return la fecha del próximo cumpleaños, igual o posterior a hoy
     * @throws IllegalArgumentException si alguna fecha es null o el nacimiento
     *                                  es posterior a hoy
     */
    public static LocalDate calcularProximoCumpleanios(LocalDate nacimiento, LocalDate hoy) {
        if (nacimiento == null || hoy == null) {
            throw new IllegalArgumentException("Las fechas no pueden ser null");
        }
        if (nacimiento.isAfter(hoy)) {
            throw new IllegalArgumentException("El nacimiento no puede ser posterior a hoy");
        }
        LocalDate cumpleaniosEsteAnio = nacimiento.withYear(hoy.getYear());
        if (cumpleaniosEsteAnio.isBefore(hoy)) {
            return nacimiento.withYear(hoy.getYear() + 1);
        }
        return cumpleaniosEsteAnio;
    }
}
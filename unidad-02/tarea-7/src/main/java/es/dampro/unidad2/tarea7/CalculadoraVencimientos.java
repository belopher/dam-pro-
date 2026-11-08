package es.dampro.unidad2.tarea7;

import java.time.LocalDate;

/**
 * Utilidad para calcular fechas de vencimiento a partir de una fecha base.
 *
 * @author belopher
 * @version 1.0
 */
public final class CalculadoraVencimientos {

    /**
     * Calcula un vencimiento aplicando primero los años, después los meses y
     * por último los días. Admite desplazamientos negativos y delega en
     * {@link LocalDate} el ajuste de los finales de mes.
     *
     * @param fecha fecha de partida
     * @param dias  días a sumar (puede ser negativo)
     * @param meses meses a sumar (puede ser negativo)
     * @param anios años a sumar (puede ser negativo)
     * @return la fecha de vencimiento resultante
     */
    public static LocalDate calcularVencimiento(LocalDate fecha, int dias, int meses, int anios) {
        return fecha.plusYears(anios).plusMonths(meses).plusDays(dias);
    }
}
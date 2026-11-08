package es.dampro.unidad2.tarea7;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Utilidad para convertir fechas y horas entre zonas horarias.
 *
 * @author Nombre y apellidos
 * @version 1.0
 */
public final class ConversorZonasHorarias {

    /**
     * Convierte una fecha y hora con zona a otra zona horaria conservando el
     * mismo instante en la línea del tiempo, de modo que la hora local cambia
     * pero el momento exacto es el mismo.
     *
     * @param fechaOrigen fecha y hora con su zona de origen
     * @param zonaDestino zona horaria a la que se quiere convertir
     * @return la misma instancia temporal expresada en la zona de destino
     */
    public static ZonedDateTime convertirZona(ZonedDateTime fechaOrigen, ZoneId zonaDestino) {
        return fechaOrigen.withZoneSameInstant(zonaDestino);
    }
}
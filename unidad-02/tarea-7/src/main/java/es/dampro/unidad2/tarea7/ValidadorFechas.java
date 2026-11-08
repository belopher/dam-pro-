package es.dampro.unidad2.tarea7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

/**
 * Utilidad para validar y convertir fechas escritas como texto.
 *
 * @author Nombre y apellidos
 * @version 1.0
 */
public final class ValidadorFechas {

    private static final DateTimeFormatter FORMATO =
            DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);

    /**
     * Interpreta estrictamente un texto con formato dd/MM/uuuu (dos dígitos de
     * día, dos de mes y cuatro de año). Rechaza fechas imposibles como el
     * 29/02/2025 o el 31/04/2026.
     *
     * @param texto fecha en formato dd/MM/uuuu
     * @return la fecha interpretada
     * @throws DateTimeParseException si el texto es null, tiene un formato
     *                                incorrecto o representa una fecha imposible
     */
    public static LocalDate validarFecha(String texto) {
        if (texto == null) {
            throw new DateTimeParseException("El texto no puede ser null", "", 0);
        }
        return LocalDate.parse(texto, FORMATO);
    }
}
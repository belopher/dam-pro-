package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * TODO: Describe la finalidad de CalculadoraEdad.
 *
 * @author
 * @version
 */
public final class CalculadoraEdad {
    private CalculadoraEdad() { }
    LocalDate nacimiento = LocalDate.of(2007,7,13);
    LocalDate fechaActual = LocalDate.now();
    Period periodo = Period.between();
    /**
     * TODO: Describe lo que hace el método.
     *
     * @param nacimiento LocalDate Fecha de nacimiento
     * @param fechaActual Localdate fecha ahora mismo
     * @return
     */
    public static Period calcularEdad(LocalDate nacimiento, LocalDate fechaActual) {
       boolean posterior = nacimiento.isAfter(fechaActual);
       if (posterior)



        return Period.between(nacimiento,fechaActual);
    }
}

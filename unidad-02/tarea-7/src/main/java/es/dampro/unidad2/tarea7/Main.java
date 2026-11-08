package es.dampro.unidad2.tarea7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Programa principal que muestra una demostración de cada algoritmo de
 * fechas y horas de la tarea 7.
 *
 * @author belopher
 * @version 1.0
 */
public final class Main {

    private Main() {
    }

    /**
     * Ejecuta un ejemplo de cada clase e imprime una línea por algoritmo con
     * su etiqueta y el resultado.
     *
     * @param args argumentos de línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        System.out.println("AnalizadorFecha: "
                + AnalizadorFecha.analizarFecha(LocalDate.of(2024, 2, 29)));
        System.out.println("CalculadoraEdad: "
                + CalculadoraEdad.calcularEdad(LocalDate.of(2000, 5, 20), LocalDate.of(2026, 11, 6)));
        System.out.println("CalculadoraVencimientos: "
                + CalculadoraVencimientos.calcularVencimiento(LocalDate.of(2026, 1, 31), 0, 1, 0));
        System.out.println("ValidadorFechas: "
                + ValidadorFechas.validarFecha("29/02/2024"));
        System.out.println("CuentaAtrasEvento: "
                + CuentaAtrasEvento.calcularDiasRestantes(LocalDate.of(2026, 12, 1), LocalDate.of(2026, 12, 25)));
        System.out.println("CalculadoraJornada: "
                + CalculadoraJornada.calcularTiempoTrabajado(LocalTime.of(8, 30), LocalTime.of(17, 0), 30));
        System.out.println("CalculadoraViaje: "
                + CalculadoraViaje.calcularLlegada(LocalDateTime.of(2026, 6, 15, 22, 30), 5, 45));
        System.out.println("ComprobadorReservas: "
                + ComprobadorReservas.haySolapamiento(
                LocalDateTime.of(2026, 6, 15, 10, 0), LocalDateTime.of(2026, 6, 15, 11, 30),
                LocalDateTime.of(2026, 6, 15, 11, 0), LocalDateTime.of(2026, 6, 15, 12, 0)));
        System.out.println("ProximoCumpleanios: "
                + ProximoCumpleanios.calcularProximoCumpleanios(LocalDate.of(2000, 5, 20), LocalDate.of(2026, 11, 6)));
        System.out.println("ConversorZonasHorarias: "
                + ConversorZonasHorarias.convertirZona(
                ZonedDateTime.of(2026, 1, 15, 12, 0, 0, 0, ZoneId.of("Atlantic/Canary")),
                ZoneId.of("Europe/Madrid")));
    }
}
package ProgramacionTema4.Fechas.Ejercicios_1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ejercicio_4 {
    public static void main(String[] args) {

        LocalDate fecha = LocalDate.of(2026, 1, 28);
        System.out.println(esFinDeSemana(fecha) ? "es fin de semana" : "no es finde");

    }
    public static boolean esFinDeSemana(LocalDate fecha) {
        DayOfWeek dia = fecha.getDayOfWeek();
        return dia == DayOfWeek.SATURDAY || dia == DayOfWeek.SUNDAY;
    }
}
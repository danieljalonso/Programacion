package ProgramacionTema4.Fechas.Ejercicios_1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ejercicio_6 {
    public static void main(String[] args) {

        LocalDate inicio = LocalDate.of(2025, 4, 1);
        LocalDate fin = LocalDate.of(2025, 4, 15);

        int contador = 0;

        for (LocalDate fecha = inicio; !fecha.isAfter(fin); fecha = fecha.plusDays(1)) {
            DayOfWeek dia = fecha.getDayOfWeek();
            if (dia != DayOfWeek.SATURDAY && dia != DayOfWeek.SUNDAY) {
                contador++;
            }
        }

        System.out.println("Días laborables: " + contador);

    }
}

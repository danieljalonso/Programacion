package ProgramacionTema4.Fechas.Pruebas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Fechas {
    public static void main(String[] args) {

        LocalDate fecha = LocalDate.now();
        System.out.println("fecha actual: " + fecha);
        LocalDate fechaPosterior = fecha.plusDays(3);
        System.out.println("fecha nueva: " + fechaPosterior);

        System.out.println(fecha.isBefore(fechaPosterior));

        LocalDateTime fechaCompleta = LocalDateTime.now();
        System.out.println("Fecha con hora: " + fechaCompleta);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Fecha formateada: " + formato.format(fechaCompleta));
    }
}

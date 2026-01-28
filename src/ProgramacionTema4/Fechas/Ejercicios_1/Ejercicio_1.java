package ProgramacionTema4.Fechas.Ejercicios_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio_1 {
    public static void main(String[] args) {

        LocalDate fecha = LocalDate.now();
        DateTimeFormatter dia = DateTimeFormatter.ofPattern("EEEE");
        DateTimeFormatter num = DateTimeFormatter.ofPattern("dd");
        DateTimeFormatter mes = DateTimeFormatter.ofPattern("MMMM");
        DateTimeFormatter year = DateTimeFormatter.ofPattern("yyyy");

        System.out.println("Hoy es " + dia.format(fecha) + ", " + num.format(fecha) + " de "
                + mes.format(fecha) + " de " + year.format(fecha));

    }
}

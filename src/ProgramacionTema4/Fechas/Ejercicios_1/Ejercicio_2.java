package ProgramacionTema4.Fechas.Ejercicios_1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LocalDate hoy = LocalDate.of(2025, 4, 2);

        System.out.print("Introduce el día de tu nacimiento: ");
        int dia = sc.nextInt();

        System.out.print("Introduce el mes de tu nacimiento: ");
        int mes = sc.nextInt();

        LocalDate proximoCumple = LocalDate.of(hoy.getYear(), mes, dia);

        if (proximoCumple.isBefore(hoy) || proximoCumple.isEqual(hoy)) {
            proximoCumple = proximoCumple.plusYears(1);
        }

        long dias = ChronoUnit.DAYS.between(hoy, proximoCumple);

        System.out.println("Faltan " + dias + " días para tu cumple");

    }
}

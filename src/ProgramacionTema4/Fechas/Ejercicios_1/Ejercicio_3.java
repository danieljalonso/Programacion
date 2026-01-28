package ProgramacionTema4.Fechas.Ejercicios_1;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio_3 {
    public static void main(String[] args) {

        ZonedDateTime españa = ZonedDateTime.now(ZoneId.of("Europe/Madrid"));
        ZonedDateTime japon = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime mexico = ZonedDateTime.now(ZoneId.of("America/Mexico_City"));

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm z");

        System.out.println("España: " + formato.format(españa));
        System.out.println("Japón: " + formato.format(japon));
        System.out.println("Mexico: " + formato.format(mexico));

    }
}

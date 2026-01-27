package ProgramacionTema4.Fechas.Pruebas;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FechasTZ {
    public static void main(String[] args) {

        ZonedDateTime españa = ZonedDateTime.now(ZoneId.of("Europe/Madrid"));
        ZonedDateTime usa = españa.withZoneSameInstant(ZoneId.of("America/New_York"));
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("Hora española: " + formato.format(españa));
        System.out.println("Hora USA: " + formato.format(usa));

    }
}

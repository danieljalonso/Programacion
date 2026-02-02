package ProgramacionTema4.Fechas.Ejercicios_3;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ejercicio_2 {
    public static void main(String[] args) {

        ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZoneId london = ZoneId.of("Europe/London");

        ZonedDateTime salidaMadrid = ZonedDateTime.of(2026, 4, 5, 11, 30, 0, 0, madrid
        );

        Duration vuelo = Duration.ofHours(2).plusMinutes(15);
        ZonedDateTime llegadaLondres = salidaMadrid.plus(vuelo).withZoneSameInstant(london);

        ZonedDateTime llegadaConcierto = llegadaLondres.plusMinutes(45);

        ZonedDateTime inicioConcierto = ZonedDateTime.of(2026, 4, 5, 20, 0, 0, 0, london
        );

        Duration duracionConcierto = Duration.ofHours(2).plusMinutes(30);
        ZonedDateTime finConcierto = inicioConcierto.plus(duracionConcierto);

        ZonedDateTime vueloVuelta = ZonedDateTime.of(2026, 4, 5, 23, 45, 0, 0, london
        );

        ZonedDateTime llegadaAeropuerto = finConcierto.plusHours(1);

        System.out.println("Salida Madrid: " + salidaMadrid);
        System.out.println("Llegada Londres: " + llegadaLondres);
        System.out.println("Llegada al concierto: " + llegadaConcierto);

        if (!llegadaConcierto.isAfter(inicioConcierto)) {
            System.out.println("Llegas a tiempo al concierto");
        } else {
            System.out.println("Llegas tarde al concierto");
        }

        System.out.println("Fin del concierto: " + finConcierto);

        if (!llegadaAeropuerto.isAfter(vueloVuelta)) {
            System.out.println("Puedes coger el vuelo de vuelta a Madrid");
        } else {
            System.out.println("No llegas a tiempo al vuelo de vuelta");
        }
    }
}

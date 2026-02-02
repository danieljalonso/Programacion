package ProgramacionTema4.Fechas.Ejercicios_2;

/*
------Estás de merecidas vacaciones, y tienes que coger un vuelo para ir a Japón. Los tiempos son los siguientes.
--Sales el día 12 de abril del 2025 a las 20:45 de Madrid, y tienes 6:45 de vuelo hasta Doha.
--Tienes 1 h de tránsito en el aeropuerto (no tienes que coger las maletas porque has reservado
con la misma compañía el vuelo completo a Japón).
---Despegas de Doha y tienes 10:25 hasta el aeropuerto de Haneda (Tokio).
------Se pide:
--Calcular las horas locales a las que despegas y aterrizas.
--Como eres una persona responsable, quieres avisar a tu familia cuando aterrizas,
pero no quieres despertarlos, por eso si cuando aterrices es una hora respetable (9 am a 22 pm),
puedes llamar, si no mandas un WhatsApp. Calcula en los dos aterrizajes qué debes hacer.
--Calcula el tiempo total del viaje (incluida escala).
--Si llegas un sábado o domingo, avisa a tus amigos con un WhatsApp.
 */

import java.time.Duration;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ejercicio_1 {
    public static void main(String[] args) {

        ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZoneId doha = ZoneId.of("Asia/Qatar");
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");

        ZonedDateTime salidaMadrid = ZonedDateTime.of(2025, 4, 12, 20, 45, 0, 0, madrid
        );

        Duration vueloMadridDoha = Duration.ofHours(6).plusMinutes(45);
        ZonedDateTime llegadaDoha = salidaMadrid.plus(vueloMadridDoha).withZoneSameInstant(doha);

        ZonedDateTime salidaDoha = llegadaDoha.plusHours(1);

        Duration vueloDohaTokio = Duration.ofHours(10).plusMinutes(25);
        ZonedDateTime llegadaTokio = salidaDoha.plus(vueloDohaTokio).withZoneSameInstant(tokyo);

        System.out.println("Salida Madrid: " + salidaMadrid);
        System.out.println("Llegada Doha: " + llegadaDoha);
        System.out.println("Salida Doha: " + salidaDoha);
        System.out.println("Llegada Tokio: " + llegadaTokio);

        System.out.println("Al llegar a Doha: " + accionContacto(llegadaDoha));
        System.out.println("Al llegar a Tokio: " + accionContacto(llegadaTokio));

        Duration duracionTotal = Duration.between(salidaMadrid, llegadaTokio);

        long horas = duracionTotal.toHours();
        long minutos = duracionTotal.toMinutesPart();

        System.out.println("\nDuración total del viaje: " + horas + " horas y " + minutos + " minutos");

    }
    private static String accionContacto(ZonedDateTime llegada) {
        LocalTime hora = llegada.toLocalTime();

        if (!hora.isBefore(LocalTime.of(9, 0)) &&
                hora.isBefore(LocalTime.of(22, 0))) {
            return "Llamar a la familia";
        } else {
            return "Enviar WhatsApp";
        }
    }
}

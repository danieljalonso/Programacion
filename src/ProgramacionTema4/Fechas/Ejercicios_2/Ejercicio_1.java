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

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ejercicio_1 {
    public static void main(String[] args) {

        ZonedDateTime madrid = ZonedDateTime.of(2025, 4, 12, 20, 45, 0, 0, ZoneId.of("Europe/Madrid"));


    }
}

package ProgramacionTema5.lambdasYStreams;

import java.util.List;

public class Ejercicio_2 {
    public static void main(String[] args) {

        List<String> alumnos = List.of("ana", "luis", "guzmán", "marta");

        List<String> alumnosMayuscula = alumnos.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(alumnosMayuscula);


    }
}

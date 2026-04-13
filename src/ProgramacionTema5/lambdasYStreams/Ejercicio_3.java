package ProgramacionTema5.lambdasYStreams;

import java.util.Comparator;
import java.util.List;

public class Ejercicio_3 {
    public static void main(String[] args) {

        List<String> palabras = List.of("Java", "Programación", "Stream", "Código", "DAM");

        String mayor = palabras.stream()
                .max(Comparator.comparingInt(String::length))
                .get();
        System.out.println(mayor);

    }
}

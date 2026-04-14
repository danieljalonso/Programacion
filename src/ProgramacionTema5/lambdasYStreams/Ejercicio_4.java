package ProgramacionTema5.lambdasYStreams;

import java.util.List;

public class Ejercicio_4 {
    public static void main(String[] args) {

        List<Integer> numeros = List.of(10, 20, 30, 40, 50);

        int sumaTotal = numeros.stream()
                .mapToInt(n -> n)
                .sum();

        double media = numeros.stream()
                .mapToInt(n -> n)
                .average()
                .orElse(0);

        System.out.println("Suma: " + sumaTotal);
        System.out.println("Media: " + media);

    }
}

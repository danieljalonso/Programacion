package ProgramacionTema5.lambdasYStreams;

import java.util.Arrays;
import java.util.List;

public class Ejercicio_1 {
    public static void main(String[] args) {

        // Resultado esperado: 8, 5, 10, 7.

        List<Integer> notas = Arrays.asList(3, 8, 5, 2, 10, 7, 4);

        notas.stream()
                .filter(nota -> nota >= 5)
                .forEach(nota -> System.out.print(nota + " "));

    }
}

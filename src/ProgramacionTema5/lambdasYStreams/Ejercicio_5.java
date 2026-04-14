package ProgramacionTema5.lambdasYStreams;

import java.util.Comparator;
import java.util.List;

public class Ejercicio_5 {
    public static void main(String[] args) {

        List<Double> precios = List.of(19.99, 5.50, 45.0, 120.95, 89.0, 2.30);

        List<Long> preciosMasCaros = precios.stream()
                .map(Math::round)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();

        System.out.println(preciosMasCaros);

    }
}

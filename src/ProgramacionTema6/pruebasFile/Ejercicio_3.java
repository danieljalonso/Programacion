package ProgramacionTema6.pruebasFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {

        Path poema = Paths.get("poema.txt");

        try (Scanner sc = new Scanner(poema)) {
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero, " + e.getMessage());
        }

        System.out.println("----------------------------");

        try {
            System.out.println("Lineas totales: " + Files.lines(poema).count());
        } catch (IOException e) {
            System.out.println("Error al mostrar las lineas totales, " + e.getMessage());
        }

        System.out.println("----------------------------");

        try {
            long vocalesA = Files.lines(poema)
                            .flatMapToInt(String::chars)
                            .filter(c -> c == 'A' || c == 'a')
                            .count();
            System.out.println("'A/a' totales en el fichero: " + vocalesA);
        } catch (IOException e) {
            System.out.println("Error al contar las vocales, " + e.getMessage());
        }

    }
}

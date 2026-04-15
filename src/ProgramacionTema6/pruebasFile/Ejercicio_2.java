package ProgramacionTema6.pruebasFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {

        Path diario = Paths.get("diario.txt");
        try {
            if (!Files.exists(diario)) Files.createFile(diario);
        } catch (IOException e) {
            System.out.println("Error al crear el fichero, " + e.getMessage());
        }

        Scanner sc = new Scanner(System.in);
        String linea;

        do {
            System.out.println("Dime la linea para el diario");
            linea = sc.nextLine();

            try {
                Files.write(diario, Arrays.asList(linea), StandardOpenOption.APPEND);
            } catch (IOException e) {
                System.out.println("Error al escribir la linea, " + e.getMessage());
            }

        } while (!linea.equals("FIN"));

        try {
            List<String> lineas = Files.readAllLines(diario);
        } catch (IOException e) {
            System.out.println("Error al leer el fichero, " + e.getMessage());
        }

    }
}

package ProgramacionTema6.ejercicio_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Peonadas {
    public static void main(String[] args) {

        Path peonadas = Paths.get("src/ProgramacionTema6/ejercicio_2/peonadas.txt");

        try {
            List<String> lineas = Files.readAllLines(peonadas);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }




    }
}

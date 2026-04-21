package ProgramacionTema6.ejercicio_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Peonadas {
    public static void main(String[] args) {

        Path peonadas = Paths.get("src/ProgramacionTema6/ejercicio_2/peonadas.txt");
        Map<String, Map<String, int[]>> datos = new HashMap<>();

        try (Scanner sc = new  Scanner(peonadas)) {
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] partes = linea.split(";");
                String fecha = partes[0];

                String[] partesFecha = fecha.split("/");
                String anio = partesFecha[2];
                int mes = Integer.parseInt(partesFecha[1]) - 1;

                datos.putIfAbsent(anio, new HashMap<>());

                for (int i = 1; i < partes.length; i++) {
                    String trabajador = partes[i];

                    datos.get(anio).putIfAbsent(trabajador, new int[12]);
                    datos.get(anio).get(trabajador)[mes]++;
                }
            }
        } catch (IOException e) {
            System.err.println("Error, " + e.getMessage());
        }

        try {
            for (String anio: datos.keySet() ) {
                Path rutaAnio = Paths.get("src/ProgramacionTema6/ejercicio_2/peonadas/" + anio);
                Files.createDirectories(rutaAnio);

                for (String trabajador: datos.get(anio).keySet() ) {
                    String nombreTrabajador = trabajador.replace(" ", "_");
                    String nombreFichero = nombreTrabajador + "_" + anio + "_peonadas.txt";

                    Path fichero = Paths.get(rutaAnio + "/" + nombreFichero);
                    Files.createFile(fichero);

                    int[] meses = datos.get(anio).get(trabajador);
                    String[] nombresMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

                    List<String> lineasFichero = new ArrayList<>();
                    for (int i = 0; i < 12; i++) {
                         lineasFichero.add(nombresMeses[i] + " " + meses[i]);
                    }
                    Files.write(fichero, lineasFichero);
                }
            }
            System.out.println("Completado :)");
        } catch (IOException e) {
            System.err.println("Error, " + e.getMessage());
        }




    }
}

package ProgramacionTema6.pruebasFile;

import java.io.File;
import java.io.IOException;

public class Ejercicio_1 {
    public static void main(String[] args) {

        File carpeta = new File("MiDirectorioDAM");
        File datos = new File(carpeta, "datos.txt");
        File config = new File(carpeta, "config.ini");

        if (!carpeta.exists()) carpeta.mkdir();

        crearFichero(datos);
        crearFichero(config);

        File[] ficheros = carpeta.listFiles();

        for (File f : ficheros) {
            System.out.println(f.getName() + ": " + f.length());
        }

    }
    public static void crearFichero(File file) {
        try {
            if (!file.exists()) file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error al crear el fichero, " + e.getMessage());
        }
    }
}

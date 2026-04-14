package ProgramacionTema6.pruebasFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Pruebas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el nombre del fichero");
        String nombre = sc.next();

        File fichero = new File(nombre);

        try {
            if (!fichero.exists()) {
                fichero.createNewFile();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));) {
                System.out.println("escribiendo...");
                bw.write("Hola jeje");
                bw.newLine();
                bw.write("Adios juju");
            }

            try (Scanner scFile = new Scanner(fichero)) {
                System.out.println("mostrando...");
                while (scFile.hasNext()) {
                    System.out.println(scFile.nextLine());
                }
            }

        } catch (IOException e) {
            System.out.println("Error al crear el archivo, " + e.getMessage());
        }


        System.out.println("Tamaño: " + fichero.length());

    }
}

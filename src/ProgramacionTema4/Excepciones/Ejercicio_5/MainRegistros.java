package ProgramacionTema4.Excepciones.Ejercicio_5;

import java.util.ArrayList;
import java.util.Arrays;

public class MainRegistros {
    public static void main(String[] args) {

        ArrayList<Registro> registros = new ArrayList<>();

        Registro r;

        r = addRegistro(50);
        if (r != null) registros.add(r);
        r= addRegistro(130);
        if (r != null) registros.add(r);
        r = addRegistro(-10);
        if (r != null) registros.add(r);

        System.out.println("\n------------------------------------------------\n");

        int contador = 1;
        for (Registro reg : registros) {
            System.out.println("Registro " + contador + ": " + reg);
            contador++;
        }

    }

    public static Registro addRegistro(int edad) {
        try {
            return new Registro(edad);
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}

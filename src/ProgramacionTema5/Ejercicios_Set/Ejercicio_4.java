package ProgramacionTema5.Ejercicios_Set;

/*
Aprender a "limpiar" duplicados de una lista de forma eficiente.

Tarea: Crea un ArrayList<String> con los colores: "Rojo", "Azul", "Rojo", "Verde", "Azul".

Acción: Pasa todos los elementos del ArrayList a un HashSet (puedes usar el constructor del Set o un bucle).

Salida: Muestra la nueva colección sin colores repetidos.
 */

import java.util.ArrayList;
import java.util.HashSet;

public class Ejercicio_4 {
    public static void main(String[] args) {

        ArrayList<String> colores = new ArrayList<>();

        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");

        System.out.println(colores);

        HashSet<String> coloresNuevos = new HashSet<>();

        for (String c : colores) {
            coloresNuevos.add(c);
        }

        System.out.println(coloresNuevos);

    }
}

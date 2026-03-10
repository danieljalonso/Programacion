package ProgramacionTema5.Ejercicios_Set;

/*
Entender la diferencia entre un saco desordenado (HashSet) y uno que ordena automáticamente (TreeSet).

Tarea: Crea un TreeSet<Integer> para guardar los números premiados de una rifa.

Acción: Añade los números: 45, 12, 89, 3, 22.

Salida: Recorre el conjunto con un bucle for-each y observa cómo Java los muestra ordenados de menor a mayor
sin haber hecho nada extra.
 */

import java.util.TreeSet;

public class Ejercicio_3 {
    public static void main(String[] args) {

        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(45);
        numeros.add(12);
        numeros.add(89);
        numeros.add(3);
        numeros.add(22);

        for (Integer n : numeros) {
            System.out.println(n);
        }

    }
}

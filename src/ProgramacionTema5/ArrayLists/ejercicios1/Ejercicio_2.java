package ProgramacionTema5.ArrayLists.ejercicios1;

/*
Utilizando la lista del ejercicio anterior:

Pide un nombre por teclado y comprueba si el alumno existe en la lista.

Si existe, modifica su nombre para que aparezca todo en mayúsculas.

Muestra la lista completa utilizando un bucle for-each.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> alumnos = new ArrayList<>();

        alumnos.add("Angel");
        alumnos.add("Humberto");
        alumnos.add("Omar");
        alumnos.add("Pablo");
        alumnos.add("Hugo");
        alumnos.add(2, "Gabriel");

        System.out.println("Dime un nombre");
        String busqueda = sc.nextLine();
        System.out.println(alumnos.contains(busqueda) ? busqueda + " está en la lista" : busqueda + " NO está en la lista");

        if (alumnos.contains(busqueda)) {
            int pos = alumnos.indexOf(busqueda);
            alumnos.set(pos, alumnos.get(pos).toUpperCase());
        }

        for (String a : alumnos) {
            System.out.println(a);
        }

    }
}

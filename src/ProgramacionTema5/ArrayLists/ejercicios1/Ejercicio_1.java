package ProgramacionTema5.ArrayLists.ejercicios1;

/*
Crea un programa que gestione una lista de nombres de alumnos (String) utilizando un ArrayList.

Añade cinco nombres a la lista.

Inserta un nombre nuevo en la tercera posición (índice 2).

Muestra el tamaño actual de la lista utilizando el atributo o metodo correspondiente.

Elimina al alumno que esté en la última posición.
 */

import java.util.ArrayList;
import java.util.List;

public class Ejercicio_1 {
    public static void main(String[] args) {

        List<String> alumnos = new ArrayList<>();

        alumnos.add("Angel");
        alumnos.add("Humberto");
        alumnos.add("Omar");
        alumnos.add("Pablo");
        alumnos.add("Hugo");

        alumnos.add(2, "Gabriel");

        System.out.println(alumnos.size());

        alumnos.removeLast();

        System.out.println(alumnos);

    }
}

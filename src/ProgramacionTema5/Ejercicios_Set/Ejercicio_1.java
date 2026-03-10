package ProgramacionTema5.Ejercicios_Set;

/*
El objetivo es entender que un Set no permite duplicados.

Tarea: Crea un HashSet<String> llamado invitados.

Acción: Añade los nombres: "Ana", "Luis", "Ana", "Marta", "Luis".

Salida: Muestra el tamaño de la lista (size()) y comprueba que solo hay 3 nombres en total.
 */

import java.util.HashSet;

public class Ejercicio_1 {
    public static void main(String[] args) {

        HashSet<String> invitados = new HashSet<>();

        invitados.add("Ana");
        invitados.add("Luis");
        invitados.add("Ana");
        invitados.add("Marta");
        invitados.add("Luis");

        System.out.println(invitados.size());
        System.out.println(invitados);

    }
}

package ProgramacionTema5.Ejercicios_Set;

/*
Practicar la búsqueda rápida de elementos, una de las mayores ventajas de los conjuntos.

Tarea: Crea un HashSet<Integer> con una lista de 5 números de identificación (IDs) fijos.

Acción: Pide al usuario por teclado un número usando Scanner.

Salida: Indica mediante un boolean si ese ID tiene acceso (si está contenido en el Set) o no.
 */

import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<Integer> id = new HashSet<>();

        id.add(1);
        id.add(2);
        id.add(3);
        id.add(4);
        id.add(5);

        System.out.println("Dime un id");
        int idPedido = sc.nextInt();

        System.out.println(id.contains(idPedido) ? "El id está en la lista" : "El id NO está en la lista");

    }
}

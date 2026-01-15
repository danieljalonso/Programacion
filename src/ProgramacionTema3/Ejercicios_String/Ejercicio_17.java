package ProgramacionTema3.Ejercicios_String;

/*
Desarrolla un programa que averigüe cuantas asignaturas tiene aprobadas un alumno.
El programa debe leer un String con el nombre de las asignaturas y después otro
String con la lista de sus notas. Debe dar como resultado el nombre de las
asignaturas aprobadas. Tanto la lista de asignaturas como la lista de notas
utilizan el símbolo “:” como separador.

Ejemplo de funcionamiento del programa:

Escribe la lista de asignaturas: “Matemáticas:Literatura:Historia:Inglés”

Escribe la lista de notas: 7:4:10:3

Las asignaturas aprobadas son: Matemáticas Historia

Suponemos que las listas de asignaturas y de notas están bien formadas,
es decir siempre habrá unos 8:9 entre una asignatura y otra o una nota y otra.
Además siempre existirá el mismo número de notas que de asignaturas.
El número de asignaturas no es fijo, pueden ser 4, 5, 6 o más.
 */

import java.util.Scanner;

public class Ejercicio_17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime las asignaturas separadas con :");
        String asig = sc.nextLine();
        System.out.println("Dime las notas separadas con :");
        String not = sc.nextLine();

        String[] asignaturas = asig.split(":");
        String[] notas = not.split(":");

        System.out.print("Las asignaturas aprobadas son: ");
        for (int i = 0; i < asignaturas.length; i++) {
            if (Integer.parseInt(notas[i]) >= 5) {
                System.out.print(asignaturas[i] + " ");
            }
        }


    }
}

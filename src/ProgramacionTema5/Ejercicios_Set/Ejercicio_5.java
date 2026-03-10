package ProgramacionTema5.Ejercicios_Set;

/*
El metodo add() devuelve un valor booleano que indica si el elemento se añadió con éxito o no.

Tarea: Crea un Set<String> para matrículas de coches.

Acción: Intenta añadir dos veces la misma matrícula.
Lógica: Si el metodo add() devuelve false, muestra un mensaje por pantalla: "ERROR: La matrícula ya existe en el sistema"
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<String> matriculas = new HashSet<>();

        while (true) {
            String mat = sc.next();
            if (mat.equals("?")) break;
            boolean esta = (matriculas.add(mat));
            if (!esta) System.out.println("ERROR: La matricula ya existe en el sistema");
            else System.out.println("Matricula metida correctamente, actualmente hay estas: \n" + matriculas);
            System.out.println("---------------------------------------------------------");
        }

    }
}

package ProgramacionTema5.ArrayLists.ejercicios1;

/*
Dado el siguiente array de notas: int[] notasArray = {4, 9, 7, 5, 10};

Crea un ArrayList de objetos Integer.

Vuelca todos los datos del array a la lista utilizando un bucle.

Muestra la lista final formateada como un String.
 */

import java.util.ArrayList;
import java.util.List;

public class Ejercicio_4 {
    public static void main(String[] args) {

        int[] notasArray = {4, 9, 7, 5, 10};

        List<Integer> notas = new ArrayList<>();

        for (int n : notasArray) {
            notas.add(n);
        }

        for (int n : notas) {
            System.out.println(Integer.toString(n));
        }

    }
}

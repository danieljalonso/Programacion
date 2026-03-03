package ProgramacionTema5.ArrayLists.ejercicios1;

/*
Crea una lista de números enteros (Integer).

Rellena la lista con 10 números aleatorios entre 1 y 50.

Calcula la suma de todos los números de la lista recorriéndola con un bucle for clásico.

Muestra el número mayor encontrado en la lista.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio_3 {
    public static void main(String[] args) {

        Random r = new Random();

        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numeros.add(r.nextInt(50) + 1);
        }
        System.out.println(numeros);

        int total = 0;
        for (int i = 0; i < 10; i++) {
            total += numeros.get(i);
        }
        System.out.println(total);

        int mayor = 0;
        for (int n : numeros) {
            if (n >= mayor) mayor = n;
        }
        System.out.println("El mayor es: " + mayor);

    }
}

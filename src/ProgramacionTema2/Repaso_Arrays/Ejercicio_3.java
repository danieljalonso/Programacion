package ProgramacionTema2.Repaso_Arrays;

public class Ejercicio_3 {
    public static void main(String[] args) {

        int[] notas = {4, 9, 7, 5, 10};

        for (int nota : notas) {
            System.out.print(nota + " ");
        }
        System.out.println();
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }

        System.out.println("La media es: " + (suma / (double) notas.length));

    }
}

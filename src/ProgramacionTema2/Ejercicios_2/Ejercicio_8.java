package ProgramacionTema2.Ejercicios_2;

public class Ejercicio_8 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            int contador = 0;
            for (int a = 1; a <= i; a++) {
                if (i % a == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                System.out.println(i);
            }
        }
    }
}

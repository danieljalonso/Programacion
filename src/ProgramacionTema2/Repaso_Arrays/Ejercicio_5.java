package ProgramacionTema2.Repaso_Arrays;

import java.util.Arrays;

public class Ejercicio_5 {
    public static void main(String[] args) {

        int[] a = {3, 3, 3};
        int[] b = a;

        b[0] = 8;

        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));

        int[] c = {1, 2, 3};
        int[] d = {1, 2, 3};

        System.out.println("c == d: " + (c == d));
        System.out.println("c equals d: " + (c.equals(d)));
        System.out.println("c arrays equals d: " + (Arrays.equals(c, d)));

    }
}

package ProgramacionTema3.Pruebas;

import java.util.Random;

public class p1 {
    static void main() {

        String dni;
        Random r = new Random();

        int n = r.nextInt(90000000) + 10000000;
        dni = "" + n;
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        dni += letras[n % 23];

        System.out.println(dni);

        System.out.println(68326371 % 23);

    }
}

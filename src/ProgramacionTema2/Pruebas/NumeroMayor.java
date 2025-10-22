package ProgramacionTema2.Pruebas;

public class NumeroMayor {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = 15;

        System.out.println("El mayor es " + mayor(a, b, c));

    }

    static int mayor(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}

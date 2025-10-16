package ProgramacionTema1.Ejercicios_2;

    /*
    si el valor de C es positivo o negativo,
    si es par o impar,
    si es múltiplo de 5,
    si es múltiplo de 10 y
    si es mayor o menor que 100.
     */

public class Ejercicio_2 {
    public static void main(String[] args) {

        int C = 25;
        String a = "C es: ";
        String b = "multiplo de ";
        System.out.println(C >= 0 ? a + "positivo" : a + "negativo");
        System.out.println(C % 2 == 0 ? a + "par" : a + "impar");
        System.out.println(C % 5 == 0 ? a + b + "5" : "C no es: " + b + "5");
        System.out.println(C % 10 == 0 ? a + b + "5" : "C no es: " + b + "10");
        System.out.println(C >= 100 ? a + "mayor que 100" : a + "menor que 100");
    }
}

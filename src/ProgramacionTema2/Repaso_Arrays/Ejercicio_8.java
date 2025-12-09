package ProgramacionTema2.Repaso_Arrays;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la base");
        double base = sc.nextDouble();
        System.out.println("Dime la altura");
        double altura = sc.nextDouble();

        double area = areaRectangulo(base, altura);

        System.out.println("El area es: " + area);

        System.out.println("Dime un numero");
        int num = sc.nextInt();

        boolean par = esPar(num);

        System.out.println(par ? "Es par" : "Es impar");

    }
    static double areaRectangulo(double base, double altura) {
        return base * altura;
    }
    static boolean esPar(int num) {
        return num % 2 == 0;
    }
}

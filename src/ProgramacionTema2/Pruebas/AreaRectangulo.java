package ProgramacionTema2.Pruebas;

import java.util.Scanner;

//Escribe un metodo para calcular el area de un rectangulo dados base y altura.

public class AreaRectangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la base");
        double base = sc.nextDouble();
        System.out.println("Escribe la altura");
        double altura = sc.nextDouble();

        double areaRectangulo = calcularArea(base, altura);
        System.out.println("El area del rectangulo es: " + areaRectangulo);
    }

    static double calcularArea(double base, double altura) {
        return base * altura;
    }
}

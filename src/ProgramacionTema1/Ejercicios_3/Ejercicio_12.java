package ProgramacionTema1.Ejercicios_3;
import java.util.Scanner;
/*
Lee un número por teclado que pida el precio de un producto (puede tener decimales)
y calcule el precio final con IVA. El IVA será una constante del 21%.
 */

public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el precio del producto");
        double precio = scanner.nextDouble();
        System.out.println("El precio del producto con IVA es de " + (precio * 1.21) + "€");

    }
}

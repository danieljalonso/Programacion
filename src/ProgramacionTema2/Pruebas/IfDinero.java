package ProgramacionTema2.Pruebas;
import java.util.Scanner;

public class IfDinero {
    public static void main(String[] args) {

        String puedes = "Puedes comprarte";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuanto dinero tienes?");
        double dinero = scanner.nextDouble();

        if (dinero < 2) {
            System.out.printf("%s agua \n", puedes);
        } else if (dinero < 5) {
            System.out.printf("%s una cocacola \n", puedes);
        } else if (dinero < 7) {
            System.out.printf("%s agua y bocadillo \n", puedes);
        } else {
            System.out.printf("%s cocacola y bocadillo \n", puedes);
        }
        scanner.close();

    }
}

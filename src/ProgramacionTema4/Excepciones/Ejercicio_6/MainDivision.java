package ProgramacionTema4.Excepciones.Ejercicio_6;

public class MainDivision {
    public static void main(String[] args) {

        DivisionSimple d = new DivisionSimple();

        String n1 = "6";
        String n2 = "0";

        try {
            System.out.println("El resultado de " + n1 + " entre " + n2 + " es: " + d.realizarDivision(n1, n2));
        } catch (ArithmeticException e) {
            System.out.println("El resultado de " + n1 + " entre " + n2 + " es: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("No has introducido un numero valido: " + e.getMessage().substring(e.getMessage().indexOf("\"")));
        }

    }
}

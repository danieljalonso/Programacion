package ProgramacionTema4.Excepciones.Ejercicio_1;

public class CalculadoraSimple {

    public void dividir(int num1, int num2) {
        try {
            System.out.println("El resultado de la divison es: " + (double) num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero: " + e.getMessage());
        }
    }

}

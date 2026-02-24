package ProgramacionTema4.Excepciones.Ejercicio_6;

public class DivisionSimple {

    public double realizarDivision(String num1, String num2) {
        if (num2.equals("0")) {
            throw new ArithmeticException("No se puede dividir entre 0 paleto");
        }
        return (double) Integer.parseInt(num1) / Integer.parseInt(num2);
    }

}

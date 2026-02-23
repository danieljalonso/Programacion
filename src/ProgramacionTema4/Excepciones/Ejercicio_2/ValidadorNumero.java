package ProgramacionTema4.Excepciones.Ejercicio_2;

public class ValidadorNumero {

    public void validadPositivo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El numero no es positivo");
        }
        System.out.println("El numero es positivo");
    }

}

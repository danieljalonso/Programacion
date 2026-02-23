package ProgramacionTema4.Excepciones.Ejercicio_2;

public class NumerosMain {
    public static void main(String[] args) {

        ValidadorNumero validador = new ValidadorNumero();

        validador.validadPositivo(1);
        validador.validadPositivo(0);
        validador.validadPositivo(-1);

    }
}

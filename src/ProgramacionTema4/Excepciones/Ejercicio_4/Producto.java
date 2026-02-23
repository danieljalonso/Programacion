package ProgramacionTema4.Excepciones.Ejercicio_4;

public class Producto {

    public void establecerPrecio(double p) throws ValorInvalidoException{
        if (p < 0) {
            throw new ValorInvalidoException("El precio no puede ser negativo, bobo");
        }
        System.out.println("Precio establecido");
    }

}

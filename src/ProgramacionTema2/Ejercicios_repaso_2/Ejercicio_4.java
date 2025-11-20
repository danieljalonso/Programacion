package ProgramacionTema2.Ejercicios_repaso_2;

/*
Tenemos que calcular en una función la lógica de negocio de una biblioteca.
  Parámetros:
    Nombre libro
    Plazo de préstamo: días iniciales para hacer el cálculo
    Categoría: ficción (sí/no), referencia o infantil
    Novedad: sí/no
    Bestseller: sí/no
    Lenguaje: texto corto, ES para español, EN para inglés, FR para francés...
Función para calcular el plazo de préstamo:
    El plazo base del préstamo es de 12 días, pero personalizable.
    Si la categoría es referencia o infantil, el plazo aumenta en 5 días.
    Si es una novedad, el plazo máximo es de 10 días.
    Si es un bestseller, el plazo disminuye en 4 días.
    Si el lenguaje no es español el plazo aumenta en 3 días.
    Si el lenguaje es inglés y la categoría es ficción, el plazo disminuye 2 días.
    Las reducciones y aumentos son acumulativos.
    El plazo nunca puede ser menor de 3 días, independientemente de las reducciones.
    El plazo nunca puede ser mayor de 20 días, independientemente de los aumentos.
Función para calcular la multa. Una vez calculado el plazo de préstamo,
se crea una nueva función con todos los mismos parámetros, más dos,
uno es un entero con los días máximos de préstamo (calculado en la función previa),
el otro es el precio de compra del libro. La función devolverá un número que será el precio de la multa.
    La multa base es de 0.50€ por cada día de retraso.
    Si la categoría es referencia, aumenta la multa en 0.50€ por cada día de retraso.
    Si la categoría es infantil, aumenta la multa en 0.25€ por cada día de retraso.
    Si es una novedad, aumenta la multa en 0.40€ por cada día de retraso.
    Si es un bestseller, aumenta la multa en 0.75€ por cada día de retraso.
    La multa no puede ser mayor que el precio del libro.
 */

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {

        String nombre = "Don Quijote";
        boolean categoria = true;
        boolean novedad = false;
        boolean bestseller = true;
        String lenguaje = "ES";
        double precio = 19.99;
        double multaBase = 0.50;
        int plazoBase = 12;
        int diasTarde = 8;

        int plazoNuevo = calcularPlazo(categoria, novedad, bestseller, lenguaje, plazoBase);
        System.out.println("El plazo para entregar el libro " + nombre + " es de " + plazoNuevo + " días.");

        double multa = calcularMulta(categoria, novedad, bestseller, lenguaje, plazoNuevo, precio, diasTarde, multaBase);

    }
    static int calcularPlazo(boolean categoria, boolean novedad, boolean best, String idioma, int plazo) {
        int cambio = 0;

        if (!categoria) cambio += 5;
        if (best) cambio -= 4;
        if (!(idioma.equals("ES"))) cambio += 3;
        if (idioma.equals("EN") && categoria) cambio -= 2;

        cambio += plazo;

        if (cambio < 3) cambio = 3;
        if (cambio > 20) cambio = 20;
        if (novedad && cambio > 10) cambio = 10;

        return cambio;

    }

    static double calcularMulta(boolean categoria, boolean novedad, boolean best, String idioma, int plazo, double precio, int dias, double multa) {
        double cambio = 0;

        return 0;

    }
}

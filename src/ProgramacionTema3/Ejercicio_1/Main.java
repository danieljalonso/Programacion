package ProgramacionTema3.Ejercicio_1;

public class Main {
    static void main() {

        Rectangulo r1 = new Rectangulo(1, 8);
        Rectangulo r2 = new Rectangulo();
        Rectangulo r3 = new Rectangulo(6, 6);


        System.out.println(r1.mostrarValores());
        System.out.println(r2.mostrarValores());
        System.out.println(r3.mostrarValores());

        r1.orientacion();
        r2.orientacion();
        r3.orientacion();

        System.out.println(r1.calcularArea());
        System.out.println(r2.calcularArea());
        System.out.println(r3.calcularArea());

        System.out.println(r1.calcularPerimetro());
        System.out.println(r2.calcularPerimetro());
        System.out.println(r3.calcularPerimetro());

        r3.dibujar();

    }
}

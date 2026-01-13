package ProgramacionTema3.Ejercicios_3;

public class Biblioteca {
    public static void main(String[] args) {

        Autor a1 = new Autor("Miguel de Cervantes", "Española");

        Libro l1 = new Libro("Don Quijote", a1);

        l1.prestar();
        l1.prestar();

        l1.informacion();


    }
}

package ProgramacionTema3.Repaso.Ejercicio_2;

public class Alumno {

    // Atributos
    private String nombre;
    private double nota;

    // Constructores
    public Alumno(String nom, double not) {
        this.nombre = nom;
        this.nota = not;
    }
    public Alumno() {
        this("Sin nombre", 0);
    }

    //Metodos
    public void aprobar() {
        if (nota < 5) {
            nota = 5;
        }
    }

    public String toString() {
        return nombre + " ha sacado un " + nota;
    }
}

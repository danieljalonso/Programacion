package ProgramacionTema3.Ejercicios_3;

public class Autor {

    // Atributos
    private String nombre;
    private String nacionalidad;

    // Constructor
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    public String mostrarAutor() {
        return nombre + " (nacionalidad " + nacionalidad + ")";
    }

}

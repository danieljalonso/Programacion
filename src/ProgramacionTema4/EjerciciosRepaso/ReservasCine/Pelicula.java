package ProgramacionTema4.EjerciciosRepaso.ReservasCine;

public class Pelicula {

    String titulo;
    int duracion;
    String genero;

    public Pelicula(String titulo, int duracion, String genero) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return titulo + ", de " + genero + "(" + duracion + " minutos)";
    }
}

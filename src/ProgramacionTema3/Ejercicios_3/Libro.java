package ProgramacionTema3.Ejercicios_3;

public class Libro {

    private String titulo;
    private Autor escritor;
    private boolean prestado;

    public Libro (String titulo, Autor escritor) {
        this.titulo = titulo;
        this.escritor = escritor;
        this.prestado = false;
    }

    public void prestar() {
        if (prestado) {
            System.out.println("Error, " + titulo + " no está disponible");
        } else {
            System.out.println("Has alquilado " + titulo);
            prestado = true;
        }
    }

    public void devolver() {
        prestado = false;
    }

    public void informacion() {
        System.out.println("El libro se llama " + titulo + " y lo escribió " + escritor.mostrarAutor());
    }


}

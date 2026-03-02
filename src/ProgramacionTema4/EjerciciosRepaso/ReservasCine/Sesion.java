package ProgramacionTema4.EjerciciosRepaso.ReservasCine;

public class Sesion {

    Pelicula pelicula;
    String hora;
    int entradasDisponibles;

    public Sesion(Pelicula pelicula, String hora, int entradasDisponibles) {
        this.pelicula = pelicula;
        this.hora = hora;
        this.entradasDisponibles = entradasDisponibles;
    }

    public void reservar(int n) throws Exception {
        if (entradasDisponibles < n) {
            throw new Exception("No hay entradas suficientes");
        } else {
            entradasDisponibles -= n;
            System.out.println("Entradas reservadas");
        }
    }

    @Override
    public String toString() {
        return "La sesion de las " + hora + ", " + pelicula + ", tiene " + entradasDisponibles + " entradas disponibles";
    }
}

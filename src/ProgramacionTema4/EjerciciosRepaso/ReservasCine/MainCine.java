package ProgramacionTema4.EjerciciosRepaso.ReservasCine;

public class MainCine {
    public static void main(String[] args) {

        Pelicula p1 = new Pelicula("Guzman apruebame", 118, "fantasia");
        Sesion s1 = new Sesion(p1, "18:05", 65);

        System.out.println(s1);

        try {
            s1.reservar(55);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            s1.reservar(15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

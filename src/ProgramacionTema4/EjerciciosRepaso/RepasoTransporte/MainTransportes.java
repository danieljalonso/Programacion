package ProgramacionTema4.EjerciciosRepaso.RepasoTransporte;

public class MainTransportes {
    public static void main(String[] args) {

        Camion camion = null;
        Autobus autobus = null;
        Burro burro = null;

        try {
            camion = new Camion("1234 AB", 2000);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            autobus = new Autobus("1234 AB", 20);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            burro = new Burro("Faustino", 180);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // VIAJAR

        viajar(camion, 35);
        viajar(autobus, 35);
        viajar(burro, 35);


    }

    public static void viajar (Transportable t, int dis) {
        try {
            t.viajar(dis);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

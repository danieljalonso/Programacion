package ProgramacionTema1.Pruebas;

public class Booleans {
    public static void main(String[] args) {

        //AND
        boolean tengoDinero = true;
        boolean tengoUnaHoraLibre = true;

        System.out.println(tengoDinero && tengoUnaHoraLibre);

        //OR
        boolean tengoEfectivo = false;
        boolean tengoTarjeta = true;

        System.out.println("Puedo pagar: " + (tengoEfectivo || tengoTarjeta));

        //
        boolean hagoEjercicio = true;
        System.out.println("hagoEjercicio: " + hagoEjercicio);
        System.out.println("hagoEjercicio: " + !hagoEjercicio);

    }
}

package ProgramacionTema1.Pruebas;

public class OperadorTernario {
    public static void main(String[] args) {
        boolean tengoEfectivo = false;
        boolean tengoTarjeta = true;

        String puedoPagar = tengoEfectivo || tengoTarjeta ? "si" : "no";
        System.out.println("Puedo pagar: "+ puedoPagar);
    }
}

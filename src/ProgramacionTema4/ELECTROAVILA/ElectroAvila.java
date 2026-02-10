package ProgramacionTema4.ELECTROAVILA;

public class ElectroAvila {
    public static void main(String[] args) {

        Electrodomestico[] electrodomesticos = {
            new Lavadora(200, "Negro", 'B', 65.7, 22),
            new Television(319.99, "Gris", 'E', 15, 45, true),
            new Lavadora(170, "Amarillo", 'A', 74.75, 35),
            new Television(89.95, "Azul", 'D', 18, 25, false)
        };


        for (Electrodomestico e : electrodomesticos) {
            System.out.println(e);
        }

        System.out.println("\n----------------------------------------------------------\n");

        double precioTotal = 0;
        double precioLavadoras = 0;
        double precioTelevisiones = 0;
        for (Electrodomestico e : electrodomesticos) {

            if (e instanceof Lavadora) {
                precioLavadoras += e.getPrecioFinal();
            } else {
                precioTelevisiones += e.getPrecioFinal();
            }
            precioTotal += e.getPrecioFinal();
        }

        System.out.printf("El dinero ganado con las lavadoras es de %.2f€\n", precioLavadoras);
        System.out.printf("El dinero ganado con las televisiones es de %.2f€\n", precioTelevisiones);
        System.out.printf("El dinero ganado en total es de %.2f€\n", precioTotal);

    }
}

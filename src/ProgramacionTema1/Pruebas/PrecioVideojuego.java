package ProgramacionTema1.Pruebas;

public class PrecioVideojuego {
    public static void main(String[] args) {

        double ahorros = 2000;
        double precioVideojuego1 = 79.90;

        System.out.println("Tengo " + ahorros + " ahorrado");
        System.out.println("Me voy a comprar un videojuego que cuesta " + precioVideojuego1);
        ahorros = ahorros - precioVideojuego1;
        System.out.println("Al comprarlo, me quedaría con " + ahorros + "€");

    }
}

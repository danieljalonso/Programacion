package ProgramacionTema5.TiendaVideojuegos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainVideojuegos {
    public static void main(String[] args) {

        Tienda tienda = Tienda.newInstance();

        // VIDEOJUEGOS
        tienda.addVideojuego("Call of Duty", "PS5", "Acción", 69.99, 10);
        tienda.addVideojuego("GTA V", "PC", "Acción", 29.99, 15);
        tienda.addVideojuego("The Witcher 3", "PC", "RPG", 39.99, 8);
        tienda.addVideojuego("Final Fantasy XVI", "PS5", "RPG", 79.99, 5);
        tienda.addVideojuego("FIFA 24", "PS5", "Deportes", 59.99, 20);
        tienda.addVideojuego("NBA 2K24", "Xbox", "Deportes", 59.99, 12);
        tienda.addVideojuego("Zelda: Breath of the Wild", "Switch", "Aventura", 59.99, 7);
        tienda.addVideojuego("Uncharted 4", "PS4", "Aventura", 19.99, 6);
        tienda.addVideojuego("The Sims 4", "PC", "Simulación", 0.00, 25);
        tienda.addVideojuego("Microsoft Flight Simulator", "PC", "Simulación", 69.99, 4);
        tienda.addVideojuego("Minecraft", "PC", "Sandbox", 26.95, 30);
        tienda.addVideojuego("Stardew Valley", "Switch", "Indie", 14.99, 18);
        tienda.addVideojuego("God of War", "PS5", "Mitologia", 59.99, 15);

        // CLIENTES
        tienda.addCliente("Juan", "Pérez García", "Calle Mayor 12", "juan@gmail.com", 1);
        tienda.addCliente("María", "López Sánchez", "Avenida España 45", "maria@gmail.com", 2);
        tienda.addCliente("Carlos", "Ruiz Martín", "Calle Sol 8", "carlos@gmail.com", 3);
        tienda.addCliente("Lucía", "Fernández Díaz", "Plaza Castilla 3", "lucia@gmail.com", 4);
        tienda.addCliente("David", "Gómez Torres", "Calle Luna 22", "david@gmail.com", 5);
        tienda.addCliente("Ana", "Martínez Ruiz", "Avenida Europa 10", "ana@gmail.com", 6);
        tienda.addCliente("Sergio", "Navarro Gil", "Calle Norte 5", "sergio@gmail.com", 7);
        tienda.addCliente("Laura", "Ortega Cano", "Calle Sur 14", "laura@gmail.com", 8);


        // COMPROBACIONES
        System.out.println("-----------PRUEBAS DE VIDEOJUEGOS-----------");
        System.out.println(tienda.mostrarInventario());
        System.out.println(tienda.consultarTitulo("The Sims 4"));
        System.out.println(tienda.consultarStock("Stardew Valley"));

        System.out.println("-----------PRUEBAS DE CLIENTES-----------");
        System.out.println(tienda.buscarCliente("Juan"));
        System.out.println(tienda.buscarCliente("carlos@gmail.com"));
        System.out.println(tienda.buscarCliente("7"));

        System.out.println("-----------PRUEBAS DE VENTAS-----------");
        List<Videojuego> venta1 = new ArrayList<>();
        venta1.add(tienda.consultarTitulo("The Sims 4"));
        venta1.add(tienda.consultarTitulo("FIFA 24"));
        venta1.add(tienda.consultarTitulo("GTA V"));
        tienda.registrarVenta(tienda.buscarCliente("1"), venta1);

        List<Videojuego> venta2 = new ArrayList<>();
        venta2.add(tienda.consultarTitulo("FIFA 24"));
        venta2.add(tienda.consultarTitulo("Call of Duty"));
        tienda.registrarVenta(tienda.buscarCliente("2"), venta2);

        List<Videojuego> venta3 = new ArrayList<>();
        venta3.add(tienda.consultarTitulo("Minecraft"));
        venta3.add(tienda.consultarTitulo("FIFA 24"));
        venta3.add(tienda.consultarTitulo("The Witcher 3"));
        tienda.registrarVenta(tienda.buscarCliente("3"), venta3);

        List<Videojuego> venta4 = new ArrayList<>();
        venta4.add(tienda.consultarTitulo("GTA V"));
        venta4.add(tienda.consultarTitulo("NBA 2K24"));
        tienda.registrarVenta(tienda.buscarCliente("4"), venta4);

        List<Videojuego> venta5 = new ArrayList<>();
        venta5.add(tienda.consultarTitulo("FIFA 24"));
        venta5.add(tienda.consultarTitulo("Minecraft"));
        tienda.registrarVenta(tienda.buscarCliente("5"), venta5);

        tienda.historialVentas();
        tienda.historialFecha(LocalDate.of(2026, 3, 20));

        System.out.println("-----------PRUEBAS DE BOLA EXTRA-----------");
        tienda.ventasPorPlataforma();
        tienda.ventasPorGenero();
        tienda.tituloMasVendido();
        tienda.mejorDiaVentas();

    }
}

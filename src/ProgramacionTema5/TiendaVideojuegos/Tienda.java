package ProgramacionTema5.TiendaVideojuegos;

import java.time.LocalDate;
import java.util.*;

public class Tienda {

    private static Tienda instance = null;

    List<Videojuego> videojuegos = new ArrayList<>();
    List<Cliente> clientes = new ArrayList<>();
    List<Venta> ventas = new ArrayList<>();

    public void addVideojuego(String titulo, String plataforma, String genero, double precio, int stock) {
        videojuegos.add(new Videojuego(titulo, plataforma, genero, precio, stock));
    }

    public void addCliente(String nombre, String apellidos, String direccion, String email, int codigo) {
        clientes.add(new Cliente(nombre, apellidos, direccion, email, codigo));
    }

    public List<Videojuego> mostrarInventario() {
        return videojuegos;
    }

    public Videojuego consultarTitulo(String busqueda) {
        for (Videojuego v : videojuegos) {
            if (v.codigo.equals(busqueda) || v.titulo.equals(busqueda)) {
                return v;
            }
        }

        return null;
    }

    public int consultarStock(String busqueda) {
        return consultarTitulo(busqueda).stock;
    }

    public Cliente buscarCliente(String busqueda) {
        for (Cliente c : clientes) {
            if (String.valueOf(c.codigo).equals(busqueda) || c.nombre.equals(busqueda) || c.apellidos.equals(busqueda) || c.email.equals(busqueda)) {
                return c;
            }
        }

        return null;
    }

    public void registrarVenta(Cliente cliente, List<Videojuego> videojuegos) {
        ventas.add(new Venta(cliente, videojuegos, LocalDate.now()));
        for (Videojuego v : videojuegos) {
            v.stock--;
        }
    }

    public void historialVentas() {
        for (Venta v : ventas) {
            System.out.println(v);
        }
    }

    public void historialFecha(LocalDate fecha) {
        for (Venta v : ventas) {
            if (v.fecha.equals(fecha)) {
                System.out.println(v);
            }
        }
    }

    public void ventasPorPlataforma() {
        Map<String, Integer> ventasPorP = new HashMap<>();

        for (Venta v : ventas) {
            for (Videojuego vi : v.videojuegos) {
                ventasPorP.put(vi.plataforma, ventasPorP.getOrDefault(vi.plataforma, 0) + 1);
            }
        }

        for (String p : ventasPorP.keySet()) {
            System.out.println(p + ": " + ventasPorP.get(p));
        }
    }

    public void ventasPorGenero() {
        Map<String, Integer> ventasPorG = new HashMap<>();

        for (Venta v : ventas) {
            for (Videojuego vi : v.videojuegos) {
                ventasPorG.put(vi.genero, ventasPorG.getOrDefault(vi.genero, 0) + 1);
            }
        }

        for (String g : ventasPorG.keySet()) {
            System.out.println(g + ": " + ventasPorG.get(g));
        }
    }

    public void tituloMasVendido() {
        Map<String, Integer> ventasPorT = new HashMap<>();

        for (Venta v : ventas) {
            for (Videojuego vi : v.videojuegos) {
                ventasPorT.put(vi.titulo, ventasPorT.getOrDefault(vi.titulo, 0) + 1);
            }
        }

        String masVendido = "";
        int max = 0;

        for (String titulo : ventasPorT.keySet()) {
            if (ventasPorT.get(titulo) > max) {
                max = ventasPorT.get(titulo);
                masVendido = titulo;
            }
        }

        System.out.println("Más vendido: " + masVendido + " (" + max + " ventas)");
    }

    public void mejorDiaVentas() {
        Map<LocalDate, Integer> ventasPorD = new HashMap<>();

        for (Venta v : ventas) {
            int cantidad = v.videojuegos.size();
            ventasPorD.put(v.fecha, ventasPorD.getOrDefault(v.fecha, 0) + cantidad);
        }

        LocalDate mejorDia = null;
        int max = 0;

        for (LocalDate fecha : ventasPorD.keySet()) {
            if (ventasPorD.get(fecha) > max) {
                max = ventasPorD.get(fecha);
                mejorDia = fecha;
            }
        }

        System.out.println("Mejor día: " + mejorDia + " (" + max + " ventas)");
    }

    public static Tienda newInstance() {
        if (instance == null) {
            instance = new Tienda();
            return instance;
        }

        return instance;
    }

}

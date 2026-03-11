package ProgramacionTema5.TiendaVideojuegos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venta {

    Cliente cliente;
    List<Videojuego> videojuegos;
    LocalDate fecha;

    static List<Venta> ventas = new ArrayList<>();

    public Venta(Cliente cliente, List<Videojuego> videojuegos, LocalDate fecha) {
        this.cliente = cliente;
        this.videojuegos = videojuegos;
        this.fecha = fecha;
        ventas.add(this);
        registrarVenta();
    }

    private void registrarVenta() {
        for (Videojuego v: videojuegos) {
            v.comprar();
        }
    }

    public static List<Venta> mostrarHistorialCompleto() {
        return ventas;
    }

    public static List<Venta> mostrarHistorialFecha(LocalDate fecha) {
        List<Venta> ventasFecha = new ArrayList<>();
        for (Venta v : ventas) {
            if (v.fecha.equals(fecha)) {
                ventasFecha.add(v);
            }
        }

        return ventasFecha;
    }

}

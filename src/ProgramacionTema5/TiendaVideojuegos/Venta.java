package ProgramacionTema5.TiendaVideojuegos;

import java.time.LocalDate;
import java.util.List;

public class Venta {

    Cliente cliente;
    List<Videojuego> videojuegos;
    LocalDate fecha;

    public Venta(Cliente cliente, List<Videojuego> videojuegos, LocalDate fecha) {
        this.cliente = cliente;
        this.videojuegos = videojuegos;
        this.fecha = fecha;
    }

}

package ProgramacionTema5.TiendaVideojuegos;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private static Tienda instance = null;

    List<Videojuego> videojuegos = new ArrayList<>();
    List<Cliente> clientes = new ArrayList<>();
    List<Venta> ventas = new ArrayList<>();

    public Tienda newInstance() {
        if (instance == null) {
            instance = new Tienda();
            return instance;
        }

        return instance;
    }

}

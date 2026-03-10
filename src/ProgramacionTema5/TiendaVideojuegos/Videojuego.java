package ProgramacionTema5.TiendaVideojuegos;

import java.util.UUID;

public class Videojuego {

    String titulo;
    String plataforma;
    String genero;
    double precio;
    boolean stock;
    UUID codigo;

    public Videojuego(String titulo, String plataforma, String genero, double precio, boolean stock) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.genero = genero;
        this.precio = precio;
        this.stock = stock;
        this.codigo = generarCodigo();
    }

    private UUID generarCodigo() {
        return UUID.randomUUID();
    }

}

package ProgramacionTema5.TiendaVideojuegos;

import java.util.UUID;

public class Videojuego {

    String titulo;
    String plataforma;
    String genero;
    double precio;
    int stock;
    UUID codigo;

    public Videojuego(String titulo, String plataforma, String genero, double precio, int stock) {
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

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", genero='" + genero + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", codigo=" + codigo +
                '}';
    }
}

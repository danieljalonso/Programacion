package ProgramacionTema5.Videoclub;

import java.util.ArrayList;
import java.util.List;

public class Videoclub {

    List<Cliente> clientes;
    List<Pelicula> peliculas;
    List<Prestamo> prestamos;

    public Videoclub() {
        this.clientes = new ArrayList<>();
        this.peliculas = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public void anadirCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void anadirPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public void anadirPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public Pelicula buscarPelicula(int codigo) {
        for (Pelicula p : peliculas) {
            if (codigo == p.getCodigo()) {
                return p;
            }
        }

        return null;
    }



}

package ProgramacionTema5.Videoclub;

import java.time.LocalDate;

public class Prestamo {

    Cliente cliente;
    Pelicula pelicula;
    LocalDate fechaPrestamo;
    int fechaDevolucion;

    public Prestamo(Cliente cliente, Pelicula pelicula, LocalDate fechaPrestamo) {
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = 2;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public int getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(int fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}

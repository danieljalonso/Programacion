package ProgramacionTema5.TiendaVideojuegos;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    String nombre;
    String apellidos;
    String direccion;
    String email;
    int codigo;

    public Cliente(String nombre, String apellidos, String direccion, String email, int codigo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.email = email;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", codigo=" + codigo +
                '}';
    }
}

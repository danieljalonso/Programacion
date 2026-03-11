package ProgramacionTema5.TiendaVideojuegos;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    String nombre;
    String apellidos;
    String direccion;
    String email;
    int codigo;

    static List<Cliente> clientes = new ArrayList<>();

    public Cliente(String nombre, String apellidos, String direccion, String email, int codigo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.email = email;
        this.codigo = codigo;
        clientes.add(this);
    }

    public static Cliente buscarPorCodigo(int codigo) {
        for (Cliente c : clientes) {
            if (c.codigo == codigo) {
                return c;
            }
        }

        return null;
    }

    public static Cliente buscarPorNombre(String nombre) {
        for (Cliente c : clientes) {
            if (c.nombre.equalsIgnoreCase(nombre)) {
                return c;
            }
        }

        return null;
    }

    public static Cliente buscarPorApellidos(String apellidos) {
        for (Cliente c : clientes) {
            if (c.apellidos.equalsIgnoreCase(apellidos)) {
                return c;
            }
        }

        return null;
    }

    public static Cliente buscarPorEmail(String email) {
        for (Cliente c : clientes) {
            if (c.email.equalsIgnoreCase(email)) {
                return c;
            }
        }

        return null;
    }

}

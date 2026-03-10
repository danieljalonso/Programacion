package ProgramacionTema5.TiendaVideojuegos;

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
}

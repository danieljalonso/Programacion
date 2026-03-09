package ProgramacionTema5.Videoclub;

public class Cliente {

    int numeroCarnet;
    String nombre;

    public Cliente(int numeroCarnet, String nombre) {
        this.numeroCarnet = numeroCarnet;
        this.nombre = nombre;
    }

    public int getNumeroCarnet() {
        return numeroCarnet;
    }

    public void setNumeroCarnet(int numeroCarnet) {
        this.numeroCarnet = numeroCarnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

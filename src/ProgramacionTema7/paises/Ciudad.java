package ProgramacionTema7.paises;

public class Ciudad {
    private int id;
    private String nombre;
    private int poblacion;
    private int idPais;

    public Ciudad() {}

    public Ciudad(int id, String nombre, int poblacion, int idPais) {
        this.id = id;
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.idPais = idPais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    @Override
    public String toString() {
        return "Ciudad: " + nombre + ", Población: " + poblacion + ", PaísID: " + idPais;
    }
}

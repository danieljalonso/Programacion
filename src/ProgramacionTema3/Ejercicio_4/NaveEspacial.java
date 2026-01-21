package ProgramacionTema3.Ejercicio_4;

public class NaveEspacial {

    // Atributos
    private String nombre;
    private int combustible;
    private double capacidadCarga;
    private boolean enMision;

    // Constructor
    public NaveEspacial(String nombre, double capacidadCarga) {
        this.nombre = nombre;
        this.capacidadCarga = capacidadCarga;
        this.combustible = 100;
        this.enMision = false;
    }
    public NaveEspacial(String nombre) {
        this(nombre, 6);
    }

    // Métodos
    public void viajar(int distancia) {
        if ((combustible - distancia * 2) < 0) {
            System.out.println("Combustible insuficiente para la mision de la nave " + nombre);
        } else {
            enMision = true;
            combustible -= distancia * 2;
        }
    }
    public void repostar() {
        combustible = 100;
        enMision = false;
    }
    public void mostrarEstado() {
        System.out.printf("Nombre: %s \\ Capacidad de carga: %f \\ Combustible: %d \\ enMision: %b\n", nombre, capacidadCarga, combustible, enMision);
    }

    public int getCombustible() {
        return combustible;
    }
}

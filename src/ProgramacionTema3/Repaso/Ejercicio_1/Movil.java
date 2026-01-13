package ProgramacionTema3.Repaso.Ejercicio_1;

public class Movil {

    // Atributos
    private String marca;
    private int bateria;
    private boolean estaBloqueado;

    // Definido
    public Movil(String marcaRecibida, int bateriaRecibida) {
        this.marca = marcaRecibida;
        this.bateria = bateriaRecibida;
    }
    // Generico
    public Movil() {
        this.marca = "Genérico";
        this.bateria = 100;
    }

    //Metodo
    static void llamar() {
        System.out.println("Llamando...");
    }

}

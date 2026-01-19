package ProgramacionTema3.Ejercicio_5;

public class Torneo {
    public static void main(String[] args) {

        Robot r1 = new Robot("Mazinger", "Roomba X200");
        Robot r2 = new Robot("Optimus", "Motorola 3000");

        r1.mostrarEstadisticas();
        r2.mostrarEstadisticas();

        while (r1.estaVivo() && r2.estaVivo()) {
            System.out.println("------------------------");
            r1.atacar(r2);
            if (r2.estaVivo()) {
                r2.atacar(r1);
            }
            System.out.println("Mazinger: " + r1.getVida() + " puntos de vida");
            System.out.println("Optimus: " + r2.getVida() + " puntos de vida");
            System.out.println("------------------------");
        }

        if (r1.estaVivo()) {
            System.out.println("El ganador es Mazinger");
        } else {
            System.out.println("El ganador es Optimus");
        }

    }
}

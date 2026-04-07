package ProgramacionTema3.ahorcado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 1;
        int win = 0;
        int lose = 0;

        System.out.println("╔════════════════════╗");
        System.out.println("║     AHORCADO       ║");
        System.out.println("╚════════════════════╝");



        while (n != 2){
            System.out.println("\n1 para jugar o 2 para salir");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    boolean resultado = juego.iniciar();
                    if (resultado) win++;
                    else lose++;
                    break;
                case 2:
                    System.out.println("Ya te rindes, jajaja, pringao!");
                    System.out.println("------------------------------");
                    System.out.println("ESTADISTICAS:\nVictorias: " + win + "\nDerrotas: " + lose);
                    System.out.println();
                    break;
                default:
                    System.out.println("Operacion incorrecta!");
                    break;
            }
        }

    }
}

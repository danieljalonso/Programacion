package ProgramacionTema3.ahorcado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 1;

        while (n != 2){
            System.out.println("1 para jugar o 2 para salir");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    juego.iniciar();
                    break;
                case 2:
                    System.out.println("Okey, adios!!!");
                    break;
                default:
                    System.out.println("Operacion incorrecta!");
                    break;
            }
        }

    }
}

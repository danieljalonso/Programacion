package ProgramacionTema2.Ejercicios_1;

import java.util.Scanner;

public class Ejercicio_21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double suma = 0;
        int veces = 0;
        String sigScan = "0";
        boolean fin = false;

        while (!fin) {
            System.out.println("Escribe un numero o escribe exit para finalizar");
            sigScan = sc.nextLine();
            if (!sigScan.equals("exit")){
                veces++;
                int sigNum = Integer.parseInt(sigScan);
                suma += sigNum;
            } else {
                System.out.println(suma / veces);
                fin = true;
            }
        }
        sc.close();
    }
}

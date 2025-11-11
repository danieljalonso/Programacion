package ProgramacionTema2.Pruebas;

import java.util.Scanner;

public class ArraysNombresyTelefonos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nombres = new String[3];
        int[] telefonos = new int[3];

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Dime el nombre: ");
            nombres[i] = sc.next();
            System.out.print("Y su telefono: ");
            telefonos[i] = sc.nextInt();
            System.out.println("** CONTACTO GUARDADO EN LA AGENDA ** \n");
        }
        System.out.println("Cargando Agenda ........ \n ");

        sc.close();

        System.out.println("--------AGENDA--------");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + ": " + telefonos[i] + "  <LLAMAR>  <MENSAJE>");
        }
        System.out.println("\n<SALIR>             <OPCIONES>");

    }
}

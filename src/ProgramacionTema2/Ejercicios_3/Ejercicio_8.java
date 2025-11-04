package ProgramacionTema2.Ejercicios_3;

import java.util.Scanner;

/*
Haz dos métodos, una para cifrar() y otro para descifrar() una cadena de caracteres.
Estos métodos reciben un String y retornan ese String ya cifrado o descifrado.
Para hacer el cifrado de un String, se cambia cada letra por la que está dos puestos
mas adelante( la a se cambia por la c), teniendo en cuenta que el cambio es circular,
es decir, la z se cambiará por la b. El proceso de descifrado es el contrario.
Los caracteres que no sean alfabéticos no registrarán ningún cambio.
 */

public class Ejercicio_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cifrado = "";
        String descifrado = "";

        System.out.print("Escribe la cadena para cifrar: ");
        String cadena = sc.nextLine();

        System.out.println("Qué quieres hacer?  cifrar=0 ; descifrar=1");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 0:
                cifrado = cifrar(cadena);
                System.out.println("Cifrado: " + cifrado);
                break;
            case 1:
                descifrado = descifrar(cadena);
                System.out.println("Descirado: " + descifrado);
                break;
            default:
                System.out.println("Opcion no válida");
        }
        sc.close();
    }

    static String cifrar(String cadena) {
        String cifrado = "";
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) ('a' + (c - 'a' + 2) % 26);
            } else if (c >= 'A' && c <= 'Z') {
                c = (char) ('A' + (c - 'A' + 2) % 26);
            }
            cifrado += c;
        }
        return cifrado;
    }

    static String descifrar(String cadena) {
        String descifrado = "";
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) ('a' + (c - 'a' - 2 + 26) % 26);
            } else if (c >= 'A' && c <= 'Z') {
                c = (char) ('A' + (c - 'A' - 2 + 26) % 26);
            }
            descifrado += c;
        }
        return descifrado;
    }
}

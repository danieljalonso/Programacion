package ProgramacionTema2.Ejercicios_5;

/*
Crea un programa que pase un String a mayúsculas y diga cuántas letras han cambiado.

Introduciendo: “Hola a Todos”

Da como salida: “HOLA A TODOS” 8 cambios
 */

public class Ejercicio_1 {
    public static void main(String[] args) {

        String cadena = "Hola a Todos";
        String cadenaMayus = cadena.toUpperCase();

        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena en mayusculas: " + cadenaMayus);

        // Comprobar cambios
        int cambios = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != cadenaMayus.charAt(i)) {
                cambios++;
            }
        }

        System.out.println("Se han cambiado " + cambios + " letras");

    }
}

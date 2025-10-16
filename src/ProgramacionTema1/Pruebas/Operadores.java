package ProgramacionTema1.Pruebas;

public class Operadores {
    public static void main(String[] args) {

        //Pruebas.Operadores aritméticos
        /*
            Entrada número
            Saluda número
         */
        int numero1 = 13;
        numero1 = numero1 + 2;
        numero1 = numero1 * 2;
        numero1 = numero1 - 50 / 2;
        System.out.println("numero1 vale " + numero1);
        numero1 = numero1 + 5;

        //Ahora numero1 vale 10
        int numero2 = numero1 % 3;

        //Pruebas.Operadores de asignacion
        int otroNumero = 3;
        otroNumero -= 2;
        System.out.println("otroNumero: " + otroNumero);

        //Pruebas.Operadores de incremento
        int edad = 22;
        System.out.println("Edad: " + edad);
        edad++;
        System.out.println("Edad: " + edad);
        System.out.println("Edad: " + ++edad);
        System.out.println("Edad: " + edad);


    }
}

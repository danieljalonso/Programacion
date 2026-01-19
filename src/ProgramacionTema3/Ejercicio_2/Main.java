package ProgramacionTema3.Ejercicio_2;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);

        // Crear 3 objetos persona
        System.out.println("Dime el nombre de la persona 1:");
        String nombre = sc.next();
        System.out.println("Dime la edad de la persona 1:");
        int edad = sc.nextInt();
        System.out.println("Dime el sexo (H/M) de la persona 1:");
        char sexo = sc.next().charAt(0);
        System.out.println("Dime el peso en kg de la persona 1:");
        double peso = sc.nextDouble();
        System.out.println("Dime la altura en metros de la persona 1:");
        double altura = sc.nextDouble();

        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);

        System.out.println("Dime el nombre de la persona 2:");
        nombre = sc.next();
        System.out.println("Dime la edad de la persona 2:");
        edad = sc.nextInt();
        System.out.println("Dime el sexo (H/M) de la persona 2:");
        sexo = sc.next().charAt(0);

        Persona p2 = new Persona(nombre, edad, sexo);

        System.out.println("Dime el nombre de la persona 3:");
        nombre = sc.next();

        Persona p3 = new Persona(nombre);


        // Comprobar IMC
        int[] imc = new int[3];
        imc[0] = p1.calcularIMC();
        imc[1] = p2.calcularIMC();
        imc[2] = p3.calcularIMC();

        for (int i = 1; i <= imc.length; i++) {
            if (imc[i - 1] == -1) {
                System.out.println("La persona numero " + i + " está en infrapeso");
            } else if (imc[i - 1] == 0) {
                System.out.println("La persona numero " + i + " está en peso normal");
            } else {
                System.out.println("La persona numero " + i + " está en sobrepeso");
            }
        }

        // Comprobar si es mayor de edad
        System.out.println(p1.getNombre() + " es mayor de edad: " + p1.esMayorDeEdad());
        System.out.println(p2.getNombre() + " es mayor de edad: " + p2.esMayorDeEdad());
        System.out.println(p2.getNombre() + " es mayor de edad: " + p2.esMayorDeEdad());

        // Mostrar la informacion completa de todos
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

    }
}

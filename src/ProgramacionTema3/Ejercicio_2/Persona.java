package ProgramacionTema3.Ejercicio_2;

import java.util.Random;

public class Persona {

    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    // Constructores
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.dni = generaDNI();
    }
    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 75, 1.75);
    }
    public Persona(String nombre) {
        this(nombre, 20, 'H', 75, 1.75);
    }

    // Métodos
    public int calcularIMC() {
        double imc = peso/(altura*altura);
        if (imc < 20) {
            return -1;
        } else if (imc > 25) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean esMayorDeEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public char comprobarSexo(char sexo) {
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = 'H';
            return this.sexo;
        } else {
            return sexo;
        }
    }

    public String toString() {
        return "Nombre: " + nombre + " \\ Edad: " + edad + " \\ Sexo: " + sexo + " \\ Peso: " + peso + " \\ Altura: " + altura + " \\ DNI: " + dni;
    }

    private String generaDNI() {
        String dni;
        Random r = new Random();

        int n = r.nextInt(90000000) + 10000000;
        dni = "" + n;
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        dni += letras[n % 23];

        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

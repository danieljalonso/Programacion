package ProgramacionTema3.Ejercicio_1;

public class Rectangulo {

    private  int largo;
    private  int ancho;

    public Rectangulo(int largo, int ancho) {
        if (largo > 0 && ancho > 0) {
            this.largo = largo;
            this.ancho = ancho;
        } else {
            this.largo = 7;
            this.ancho = 3;
        }
    }
    public Rectangulo() {
        this(7, 3);
    }


    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        if (largo > 0) {
            this.largo = largo;
        }
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        if (ancho > 0) {
            this.ancho = ancho;
        }
    }

    public int calcularArea() {
        return largo * ancho;
    }

    public int calcularPerimetro() {
        return (largo + ancho) * 2;
    }

    public void orientacion() {
        if (largo > ancho) {
            System.out.println("El rectangulo es horizontal");
        } else if (largo < ancho) {
            System.out.println("El rectangulo es vertical");
        } else {
            System.out.println("El rectangulo es un cuadrado");
        }
    }

    public void dibujar() {
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < largo; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public String mostrarValores() {
        return "largo: " + largo + " \\ ancho: " + ancho;
    }
}

package ProgramacionTema4.Herencia1.practica1;

public class MainFiguras {
    public static void main(String[] args) {

        FiguraTriangulo tr1 = new FiguraTriangulo("verde", 7, 8);
        FiguraCuadrado cu1 = new FiguraCuadrado("rojo", 4);
        FiguraCirculo ci1 = new FiguraCirculo("azul", 2.5);

        System.out.println(tr1);
        System.out.println(cu1);
        System.out.println(ci1);


    }
}

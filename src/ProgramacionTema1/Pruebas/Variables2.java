package ProgramacionTema1.Pruebas;

public class Variables2 {
    public static void main(String[] args) {

        long dinero = 10000000000000000L;

        float saldo = 12345.89f;

        System.out.println(dinero);

        final int notaFinalDeCurso;
        int examen1 = 8;
        double examen2 = 5.4;
        double media = (examen1 + examen2) / 2;
        System.out.println("La media sería " + media);

        //CASTING (moldear un numero para que quite los decimales)
        notaFinalDeCurso = (int) media;
        System.out.println("Y la nota final sería un " + notaFinalDeCurso);

        //Caracteres
        char inicial= 'D';
        System.out.println("Tu inicial es " + (byte) inicial);


    }
}

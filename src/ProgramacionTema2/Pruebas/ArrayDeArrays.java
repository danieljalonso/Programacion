package ProgramacionTema2.Pruebas;

import java.util.Arrays;

public class ArrayDeArrays {
    public static void main(String[] args) {

        String[] datosF = {"Felipe", "Garcia", "Avda. La Palmera 1"};
        String[] datosL = {"Laura", "Rodriguez", "Calle del Chopo 43"};
        String[] datosA = {"Abraham", "Moreno", "El Grande S/N"};

        System.out.println(Arrays.toString(datosF));
        System.out.println(Arrays.toString(datosL));
        System.out.println(Arrays.toString(datosA));

        String[][] alumnos = {datosF, datosL, datosA};
        System.out.println("ARRAY DE ARRAYS");
        for (String[] alumno : alumnos) {
            System.out.println(Arrays.toString(alumno));
        }

    }
}

package ProgramacionTema1.Pruebas;

public class nose {
    static void main() {

        int day = 7;

        System.out.print("Los siguientes dias de la semana son: ");

        switch (day) {
            case 1:
                System.out.print("Martes ");
            case 2:
                System.out.print("Miercoles ");
            case 3:
                System.out.print("Jueves ");
            case 4:
                System.out.print("Viernes ");
            case 5:
                System.out.print("Sabado ");
            case 6:
                System.out.print("Domingo ");
                break;
            case 7:
                System.out.print("Ninguno, ya es domingo ");
                break;
            default:
                System.out.println("Numero incorrecto (solo del 1 al 7)");
        }

    }
}

package ProgramacionTema2.Cadenas_repaso;

public class Ejercicio_2 {
    public static void main(String[] args) {

        String texto = "java es facil";
        System.out.println("Original: " + texto);

        String textoMayus = texto.toUpperCase();
        System.out.println("Mayusculas: " + textoMayus);

        String textoRemp = texto.replace("facil", "poderoso");
        System.out.println("Reemplazo: " + textoRemp);

        String textoExt = texto.substring(0, 4);
        System.out.println("Extraccion: " + textoExt);

        String textoInv = new StringBuilder(texto).reverse().toString();
        System.out.println("Invertido: " + textoInv);

    }
}

package ProgramacionTema2.Cadenas_repaso;

import java.math.BigInteger;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {

        StringBuilder num = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            num.append(i);
            if (i < 10) num.append("-");
        }

        System.out.println(num);

    }
}

package ProgramacionTema1.Random;

public class NumerosPrimos {
    public static void main(String[] args) {

        int num = 104;
        while (true) {
            boolean primo = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(num + ": es primo!!!");
            }
            else {
                System.out.println(num + ": no");
            }
            num++;
        }
    }
}

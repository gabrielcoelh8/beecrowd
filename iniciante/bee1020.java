package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 * 
 */
public class bee1020 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int valor = read.nextInt();
        int anos = valor/365;
        int meses = (valor%365)/30;
        int dias = (valor%365)%30;
        System.out.printf(
                "%d ano(s)\n" +
                "%d mes(es)\n" +
                "%d dia(s)\n", 
                anos, meses, dias);
    }
}

package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 *
*/
public class bee1046 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String line1 = read.nextLine();
        String[] numbers = line1.split("\\s");
        int A = Integer.parseInt(numbers[0]);
        int B = Integer.parseInt(numbers[1]);

        if (A == B) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else if (A > B) {
            int duracao = (24 - A) + B;
            System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);
        } else {
            int duracao = B - A;
            System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);
        }
    }
}

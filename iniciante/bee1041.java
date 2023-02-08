package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 *
*/
public class bee1041 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String line1 = read.nextLine();
        String[] numbers = line1.split("\\s");
        float X = Float.parseFloat(numbers[0]);
        float Y = Float.parseFloat(numbers[1]);

        if (X == 0 && X == Y) {
            System.out.println("Origem");
        } else if (X == 0 && Y != 0) {
            System.out.println("Eixo Y");
        } else if (Y == 0 && X != 0) {
            System.out.println("Eixo X");
        } else if (Y > 0) {
            if (X > 0) {
                System.out.println("Q1");
            } else if (X < 0) {
                System.out.println("Q2");
            }
        } else if (Y < 0) {
            if (X > 0) {
                System.out.println("Q4");
            } else if (X < 0) {
                System.out.println("Q3");
            }
        }

        /*
        Q1 = Y++   X++
        Q2 = Y++   X--
        Q3 = Y--    X--
        Q4 = Y--    X++
         */
    }
}

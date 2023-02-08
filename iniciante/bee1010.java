package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 * 
*/
public class bee1010 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String line1 = read.nextLine();
        String line2 = read.nextLine();
        String[] words1 = line1.split("\\s");
        String[] words2 = line2.split("\\s");
        double total = 0;
        total += Integer.parseInt(words1[1]) * Double.parseDouble(words1[2]);
        total += Integer.parseInt(words2[1]) * Double.parseDouble(words2[2]);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
    }
}

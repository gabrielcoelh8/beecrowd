package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 * 
*/
public class bee1013 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String line1 = read.nextLine();
        String[] words1 = line1.split("\\s");
        int A = Integer.parseInt(words1[0]);
        int B = Integer.parseInt(words1[1]);
        int C = Integer.parseInt(words1[2]);
        int AB = (A+B+Math.abs(A - B))/2;
        int AC = (A+C+Math.abs(A - C))/2;
        int MAIOR = (AB+AC+Math.abs(AB - AC))/2;
        System.out.printf("%d eh o maior%n", MAIOR);
    }
}

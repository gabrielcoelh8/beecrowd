package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 * 
*/
public class bee1014 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int X = read.nextInt();
        float Y = read.nextFloat();
        float out = X/Y;
        System.out.printf("%.3f km/l%n",out);
    }
}

package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 * 
*/
public class bee1011 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double PI = 3.14159;
        double R = read.nextDouble();
        double VOLUME  = (4.0/3.0) * PI * Math.pow(R, 3);
        System.out.printf("VOLUME = %.3f%n", VOLUME);
    }
}

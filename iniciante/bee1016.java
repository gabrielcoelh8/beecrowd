package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 * 
*/
public class bee1016 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int DISTANCIA = read.nextInt();
        DISTANCIA *= 2;
        System.out.printf("%d minutos%n", DISTANCIA);
    }
}

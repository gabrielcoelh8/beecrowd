package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho]
 * 
*/
public class bee1017 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int TEMPO = read.nextInt();
        int VELOCIDADE = read.nextInt();
        float OUT = (float) (VELOCIDADE*TEMPO)/12;
        System.out.printf("%.3f%n", OUT);
    }
}

package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 */
public class bee1080 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int posicao = 1;
        
        for (int i = 1; i <= 100; i++) {
            int value = read.nextInt();
            if(value>maior) {
                maior = value;
                posicao = i;
            }
        }
        System.out.println(maior+"\n"+posicao);
    }
}

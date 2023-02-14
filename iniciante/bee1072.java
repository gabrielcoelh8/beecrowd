package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 */
public class bee1072 {
    public static void main(String[] args) {
        Scanner read  = new Scanner(System.in);
        int interator = read.nextInt();
        int in = 0;
        int out = 0;
        
        for (int i = 0; i < interator; i++) {
            int ler = read.nextInt();
            
            if(ler>=10 && ler<=20) {
                in++;
            } else {
                out++;
            }
        }
        
        System.out.printf("%d in\n%d out\n", in, out);
    }
}

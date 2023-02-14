package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 */
public class bee1065 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int cont = 0;
        for (int i = 0; i < 5; i++) {
            int leitura = read.nextInt();
            if(leitura%2==0) {
                cont++;
            }
        }
        System.out.printf("%d valores pares\n", cont);
    }
}

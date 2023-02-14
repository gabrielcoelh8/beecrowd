package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 */
public class bee1073 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        
        for (int i = 2; i <= n; i=i+2) {
            System.out.printf("%d^2 = %d\n",i, (i*i));
        }
                
    }
}

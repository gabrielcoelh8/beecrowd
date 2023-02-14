package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 */
public class bee1067 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        
        for (int i = 1; i <= x; i++) {
            if(i%2==1) System.out.println(i);
        }
    }
}

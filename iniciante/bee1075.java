package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 */
public class bee1075 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int N = read.nextInt();
        
        for (int i = 0; i < 10000; i++) {
            if(i%N==2) System.out.println(i);
        }
    }
}

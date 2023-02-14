package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 */
public class bee1070 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        int interator = 0;
        int loop = x;
        
        while(interator!=6){
            if(loop%2==1) {
                System.out.println(loop);
                interator++;
            }
            loop++;
        }
    }
}

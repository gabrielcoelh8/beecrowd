package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 */
public class bee1071 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        int y = read.nextInt();
        int sum = 0;
        
        if(y<x){
            int aux = x;
            x = y;
            y = aux;
        }
       
        for (int i = (x+1); i < y; i++) {
            if(i%2!=0) {
                sum += i;
            }
        }
        
        System.out.println(sum);
    }
}

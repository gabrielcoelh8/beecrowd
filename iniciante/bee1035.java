package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 * 
*/
public class bee1035 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String line1 = read.nextLine();
        String[] numbers = line1.split("\\s");
        int A = Integer.parseInt(numbers[0]);
        int B = Integer.parseInt(numbers[1]);
        int C = Integer.parseInt(numbers[2]);
        int D = Integer.parseInt(numbers[3]);
        
        if((B > C) && (D > A) && ((C+D)>(A+B)) && (C>0) && (D>0) && (A%2==0)){
            System.out.println("Valores aceitos"); 
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}

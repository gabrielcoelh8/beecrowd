package beecrowd.iniciante;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 */
public class bee1115 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        LinkedList<String> outputs = new LinkedList<>();
        float X, Y;

        do {
            String[] numbers = read.nextLine().split("\\s");
            X = Float.parseFloat(numbers[0]);
            Y = Float.parseFloat(numbers[1]);
            
            if(Y>0) {
                if(X>0) {
                    outputs.add("primeiro");
                } else if (X<0) {
                    outputs.add("segundo");
                }
            } 
            else if(Y<0) {
                if(X<0){
                    outputs.add("terceiro");
                } else if (X>0) {
                    outputs.add("quarto");
                }
            }
        } while (X!=0 && Y!=0);
        
        outputs.stream().forEach(System.out::println);
        
        /*
        Q1 = Y++   X++
        Q2 = Y++   X--
        Q3 = Y--    X--
        Q4 = Y--    X++
         */
    }
}

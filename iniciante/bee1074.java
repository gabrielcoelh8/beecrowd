package beecrowd.iniciante;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 */
public class bee1074 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int interator = read.nextInt();
        LinkedList<String> numbers = new LinkedList<>();

        for (int i = 0; i < interator; i++) {
            int number = read.nextInt();
            String type = "";
            
            if(number == 0){
                type += "NULL";
                numbers.add(type);
                continue;
            } else if(number%2==0) {
                type += "EVEN ";
            } else {
                type += "ODD ";
            }
            
            if(number>0){
                type += "POSITIVE";
            } else if(number<0) {
                type += "NEGATIVE";
            }
            
            numbers.add(type);
        }
        numbers.forEach(System.out::println);
    }
}

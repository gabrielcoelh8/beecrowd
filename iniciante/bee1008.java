package beecrowd.iniciante;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 * 
 */
public class bee1008 {


    public static void main(String[] args) {
        LinkedList<String> lista  = new LinkedList<>();
        Scanner read = new Scanner(System.in);
        int NUMBER;
        int HRS;
        float VAL;
        float SALARY;
        
        NUMBER = read.nextInt();
        HRS = read.nextInt();
        VAL = read.nextFloat();
        
        SALARY = VAL * HRS;
        
        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", NUMBER, SALARY);
    }
    
}

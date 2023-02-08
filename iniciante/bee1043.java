package beecrowd.iniciante;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author gabrielcoelho
 * 
*/
public class bee1043 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String line1 = read.nextLine();
        List<Double> numbers = Arrays.stream(line1.split("\\s")).map(Double::parseDouble).collect(Collectors.toList());
        double A = numbers.get(0);
        double B = numbers.get(1);
        double C = numbers.get(2);
      
        if((Math.abs(B-C) < A && A < (B+C))&&(Math.abs(A-C) < B && B < (A+C))&&(Math.abs(A-B) < C && C < (A+B))){
            double P = A + B + C;
            System.out.printf("Perimetro = %.1f%n", P);
        } else {
            double T = ((A+B)*C)/2;
            System.out.printf("Area = %.1f%n",T);
        }
    }
}

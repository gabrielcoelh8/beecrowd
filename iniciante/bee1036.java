package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 * 
*/
public class bee1036 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String line1 = read.nextLine();
        String[] numbers = line1.split("\\s");
        double A = Double.parseDouble(numbers[0]);
        double B = Double.parseDouble(numbers[1]);
        double C = Double.parseDouble(numbers[2]);
        
        double delta = (Math.pow(B, 2)) - (4*A*C);
        
        if(delta>=0 && A!=0){
            double R1 = (-B + Math.sqrt(delta))/(2*A);
            double R2 = (-B - Math.sqrt(delta))/(2*A);
            
            System.out.printf("R1 = %.5f\n" +
                                        "R2 = %.5f\n",
                                        R1, R2);
        } else {
            System.out.println("Impossivel calcular");
        }
    }
}

package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 *
 */
public class bee1048 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String line1 = read.nextLine();
        float ABC = Float.parseFloat(line1);
        double salario = ABC;
        double reajuste = 0;
        int percentual = 0;
        
        if(ABC>=0 && ABC<=400.0) {
            percentual = 15;
        } else if(ABC<=800.0) {
            percentual = 12;
        } else if(ABC<=1200.0) {
            percentual = 10;
        } else if(ABC<=2000.0) {
            percentual = 7;
        } else if(ABC>2000.0) {
            percentual = 4;
        }
        
        reajuste = ABC * (percentual * Math.pow(10, -2)); //15 *10^-2
        salario += reajuste;
        
        System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%\n", salario, reajuste, percentual);
    }
}

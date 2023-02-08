package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 */
public class bee1051 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float number = read.nextFloat();
        float imposto = 0;
        
        if(number<=2000.00){
            System.out.println("Isento");
            return;
        } else if(number<=3000.00){
            float aux = number - 2000;
            imposto += (aux*0.08);
        } else if(number<=4500.00){
            float aux = number - 3000;
            imposto += 80 + (aux*0.18);
        } else if(number>4500.00){
            float aux = number - 4500;
            imposto += 350 + (aux*0.28); 
        }
        
        System.out.printf("R$ %.2f\n", imposto);
    }
}

/*
  	0000 -> 2000 -- 00
	2000 -> 3000 -- 08 = 80
	3000 -> 4500 -- 18 = 270 + 80 = 350
	4500 -> .... -- 28

*/

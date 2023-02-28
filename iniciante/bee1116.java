package beecrowd.iniciante;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 */
public class bee1116 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int interator = Integer.parseInt(read.nextLine());
        Map<Integer, String> dados = new HashMap<>();
        float output = 0;

        for (int i = 1; i <= interator; i++) {
            String leitura = read.nextLine();
            dados.put(i, leitura);
        }
        
        for (int i = 1; i <= dados.size(); i++) {
            String splitter[] = dados.get(i).split("\\s");
            float num1 = Float.parseFloat(splitter[0]);
            float num2 = Float.parseFloat(splitter[1]);
            output  = num1 / num2;
            
            if(Float.isFinite(output)) {  ///IEEE 754
                System.out.printf("%.1f%n", output);
            } else {
                System.out.println("divisao impossivel");
            }
        }
    }
}

           /* try {
               output  = num1 / num2; //integers
               System.out.println(Float.isInfinite(output));
            } catch (ArithmeticException e) {
                System.out.println("divisao impossivel");
            }

            https://www.javatpoint.com/exception-handling-in-java
*/

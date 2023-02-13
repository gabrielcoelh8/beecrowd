package beecrowd.iniciante;
import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 */
public class bee1064 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double sum = 0;
        int cont = 6;
        for (int i = 0; i < 6; i++) {
            double leitura = read.nextDouble();
            if(leitura>0) {
                sum+= leitura;
            } else {
                cont--;
            }
        }
        double mediaSum = sum/cont;
        System.out.printf("%d valores positivos\n%.1f\n", cont, mediaSum);
    }
}

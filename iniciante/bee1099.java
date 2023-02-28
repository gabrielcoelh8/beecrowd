package beecrowd.iniciante;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 */
public class bee1099 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int qtdcasos = Integer.parseInt(read.nextLine());
        LinkedList<Integer> sums = new LinkedList<>();

        for (int i = 0; i < qtdcasos; i++) {
            String leitura[] = read.nextLine().split("\\s");
            int inicio = Integer.parseInt(leitura[0]);
            int fim = Integer.parseInt(leitura[1]);
            int sum = 0;
            
            if(inicio>fim){
                int aux = inicio;
                inicio = fim;
                fim = aux;
            }
            
            for (int j = inicio + 1; j < fim; j++) {
                if (j % 2 == 1) {
                    sum += j;
                }
            }
            sums.add(sum);
        }
        
        sums.stream().forEach(System.out::println);
    }
}

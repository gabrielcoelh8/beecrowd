package beecrowd.iniciante;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 */
public class bee1101 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int inicio, fim;
        LinkedList<String> valores = new LinkedList<>();

        do {
            String leitura[] = read.nextLine().split("\\s");
            inicio = Integer.parseInt(leitura[0]);
            fim = Integer.parseInt(leitura[1]);
            String line = "";

            if (inicio > fim) {
                int aux = inicio;
                inicio = fim;
                fim = aux;
            }

            int sum = 0;

            for (int j = inicio; j <= fim; j++) {
                line = line.concat(j + " ");
                sum += j;
            }

            line = line.concat("Sum=" + sum);

            if (inicio > 0 && fim > 0) {
                valores.add(line);
            }

        } while (inicio > 0 && fim > 0);

        valores.stream().forEach(System.out::println);
    }
}

package beecrowd.iniciante;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 */
public class bee1113 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int inicio, fim;
        LinkedList<String> ordens  = new LinkedList<>();

        do {
            String leitura[] = read.nextLine().split("\\s");
            inicio = Integer.parseInt(leitura[0]);
            fim = Integer.parseInt(leitura[1]);

            if (inicio != fim && inicio > fim) {
                ordens.add("Decrescente");
            } else if (inicio != fim && inicio < fim){
                ordens.add("Crescente");
            }
        } while (inicio != fim);

        ordens.stream().forEach(System.out::println);
    }
}

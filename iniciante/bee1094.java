package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 */
public class bee1094 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int interator = Integer.parseInt(read.nextLine());
        int contCoelho = 0;
        int contSapo = 0;
        int contRato = 0;

        for (int i = 0; i < interator; i++) {
            String ler[] = read.nextLine().split("\\s");

            if (ler[1].equals("C")) {
                contCoelho += Integer.parseInt(ler[0]);
            } else if (ler[1].equals("R")) {
                contRato += Integer.parseInt(ler[0]);
            } else if (ler[1].equals("S")) {
                contSapo += Integer.parseInt(ler[0]);
            }
        }

        int total = contCoelho + contSapo + contRato;
        double percentualCoelho = (double) (100 * contCoelho) / total;
        double percentualSapo = (double) (100 * contSapo) / total;
        double percentualRato = (double) (100 * contRato) / total;

        System.out.printf("Total: %d cobaias\n"
                + "Total de coelhos: %d\n"
                + "Total de ratos: %d\n"
                + "Total de sapos: %d\n"
                + "Percentual de coelhos: %.2f %%\n"
                + "Percentual de ratos: %.2f %%\n"
                + "Percentual de sapos: %.2f %%\n",
                total, contCoelho, contRato, contSapo,
                percentualCoelho, percentualRato, percentualSapo);

    }
}

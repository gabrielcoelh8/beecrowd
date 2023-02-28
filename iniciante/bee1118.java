package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 */
public class bee1118 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int cont = 0;
        double sum = 0;
        double media;
        int op;

        do {
            double X = Double.parseDouble(read.nextLine());

            if (X >= 0 && X <= 10) {
                sum += X;
                cont++;
            } else {
                System.out.println("nota invalida");
            }

            if (cont == 2) {
                media = sum / cont;
                System.out.printf("media = %.2f%n", media);

                do {
                    System.out.println("novo calculo (1-sim 2-nao)");
                    op = Integer.parseInt(read.nextLine());

                    if (op == 1) {
                        cont = 0;
                        sum = 0;
                    }

                } while (op < 1 || op > 2);
            }

        } while (cont < 2);
    }
}

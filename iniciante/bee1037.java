package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 *
*/
public class bee1037 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String num = read.nextLine();
        float valor = Float.parseFloat(num);
        int intervalos[][] = {{0, 25}, {25, 50}, {50, 75}, {75, 100}};
        int cont = 1;

        if (valor >= 0.0 && valor <= 25.0) {
            System.out.println("Intervalo [" + intervalos[0][0] + "," + intervalos[0][1] + "]");
            return;
        }

        int fim = intervalos.length;

        while (cont != fim) {
            if (valor > (float) intervalos[cont][0] && valor <= (float) intervalos[cont][1]) {
                System.out.println("Intervalo (" + intervalos[cont][0] + "," + intervalos[cont][1] + "]");
                return;
            }
            cont++;
        }

        System.out.println("Fora de intervalo");
    }
}

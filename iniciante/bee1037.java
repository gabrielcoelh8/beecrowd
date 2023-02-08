package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 *
 * Você deve fazer um programa que leia um valor qualquer e apresente uma
 * mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75],
 * (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum
 * destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
 *
 * O símbolo ( representa "maior que". Por exemplo: [0,25] indica valores entre
 * 0 e 25.0000, inclusive eles. (25,50] indica valores maiores que 25 Ex:
 * 25.00001 até o valor 50.0000000
 *
 * Entrada O arquivo de entrada contém um número com ponto flutuante qualquer.
 *
 * Saída A saída deve ser uma mensagem conforme exemplo abaixo.
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

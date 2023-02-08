package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 *
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
 * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
 * uma duração mínima de 1 hora e máxima de 24 horas.
 *
 * Entrada A entrada contém dois valores inteiros representando a hora de início
 * e a hora de fim do jogo.
 *
 * Saída Apresente a duração do jogo conforme exemplo abaixo.
 */
public class bee1046 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String line1 = read.nextLine();
        String[] numbers = line1.split("\\s");
        int A = Integer.parseInt(numbers[0]);
        int B = Integer.parseInt(numbers[1]);

        if (A == B) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else if (A > B) {
            int duracao = (24 - A) + B;
            System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);
        } else {
            int duracao = B - A;
            System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);
        }
    }
}

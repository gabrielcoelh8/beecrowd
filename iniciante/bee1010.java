package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 * 
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
 */
public class bee1010 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String line1 = read.nextLine();
        String line2 = read.nextLine();
        String[] words1 = line1.split("\\s");
        String[] words2 = line2.split("\\s");
        double total = 0;
        total += Integer.parseInt(words1[1]) * Double.parseDouble(words1[2]);
        total += Integer.parseInt(words2[1]) * Double.parseDouble(words2[2]);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
    }
}

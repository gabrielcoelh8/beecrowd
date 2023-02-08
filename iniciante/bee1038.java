package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 *
 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
 *
 * Entrada O arquivo de entrada contém dois valores inteiros correspondentes ao
 * código e à quantidade de um item conforme tabela acima.
 *
 * Saída O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo
 * valor a ser pago, com 2 casas após o ponto decimal.
 */
public class bee1038 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String line1 = read.nextLine();
        String[] numbers = line1.split("\\s");
        int A = Integer.parseInt(numbers[0]); //ID
        int B = Integer.parseInt(numbers[1]);
        double[] precos = {4.00, 4.50, 5.00, 2.00, 1.50}; //preços by ID
        double total = B * precos[A - 1];

        System.out.printf("Total: R$ %.2f%n", total);
    }
}

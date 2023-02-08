package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 *
 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
 * múltiplos entre si.
 *
 * Entrada A entrada contém valores inteiros.
 *
 * Saída A saída deve conter uma das mensagens conforme descrito acima.
 */
public class bee1044 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String line1 = read.nextLine();
        String[] numbers = line1.split("\\s");
        int A = Integer.parseInt(numbers[0]);
        int B = Integer.parseInt(numbers[1]);
        
        
        if ((B > A && B % A == 0) || (B < A && A % B == 0)) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}

package beecrowd.iniciante;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author gabrielcoelho
 *
 * Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente,
 * de modo que o lado A representa o maior dos 3 lados. A seguir, determine o
 * tipo de triângulo que estes três lados formam, com base nos seguintes casos,
 * sempre escrevendo uma mensagem adequada: se A ≥ B+C, apresente a mensagem:
 * NAO FORMA TRIANGULO se A2 = B2 + C2, apresente a mensagem: TRIANGULO
 * RETANGULO se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO se A2
 * < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO se os três lados forem
 * iguais, apresente a mensagem: TRIANGULO EQUILATERO se apenas dois dos lados
 * forem iguais, apresente a mensagem: TRIANGULO ISOSCELES Entrada A entrada
 * contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 <
 * B) e C (0 < C).
 *
 * Saída Imprima todas as classificações do triângulo especificado na entrada.
 */
public class bee1045 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String line1 = read.nextLine();
        List<Float> numbers = Arrays.stream(line1.split("\\s")).map(Float::parseFloat).sorted(Collections.reverseOrder()).collect(Collectors.toList());
        float A = numbers.get(0);
        float B = numbers.get(1);
        float C = numbers.get(2);

        if (A >= (B + C)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (Math.pow(A, 2) == (Math.pow(B, 2) + Math.pow(C, 2))) {
                System.out.println("TRIANGULO RETANGULO");
            }

            if (Math.pow(A, 2) > (Math.pow(B, 2) + Math.pow(C, 2))) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }

            if (Math.pow(A, 2) < (Math.pow(B, 2) + Math.pow(C, 2))) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (A == B && C == A) {
                System.out.println("TRIANGULO EQUILATERO");
            }

            if (((A == B || A == C) || (B == C)) && (A != B || A != C)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

    }
}

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

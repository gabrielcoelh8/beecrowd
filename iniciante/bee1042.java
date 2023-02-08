package beecrowd.iniciante;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author gabrielcoelho
 *
 * Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os
 * valores em ordem crescente, uma linha em branco e em seguida, os valores na
 * sequência como foram lidos.
 *
 * Entrada A entrada contem três números inteiros.
 *
 * Saída Imprima a saída conforme foi especificado.
 */
public class bee1042 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String line1 = read.nextLine();
        List<Integer> numbersList = Arrays.stream(line1.split("\\s")).map(Integer::parseInt).collect(Collectors.toList());
        
        numbersList.stream().sorted().forEach(System.out::println);
        System.out.println("");
        numbersList.stream().forEach(System.out::println);
    }
}

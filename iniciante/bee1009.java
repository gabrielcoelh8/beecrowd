package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 * 
 * 
 */
public class bee1009 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String nome = read.nextLine();
        double salario = read.nextDouble();
        double totalVendas = read.nextDouble();
        double total = salario+(totalVendas*0.15);
        System.out.printf("TOTAL = R$ %.2f%n", total);
    }
}

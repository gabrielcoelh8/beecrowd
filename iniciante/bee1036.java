package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 * 
Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes, 
mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, 
com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.
 */
public class bee1036 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String line1 = read.nextLine();
        String[] numbers = line1.split("\\s");
        double A = Double.parseDouble(numbers[0]);
        double B = Double.parseDouble(numbers[1]);
        double C = Double.parseDouble(numbers[2]);
        
        double delta = (Math.pow(B, 2)) - (4*A*C);
        
        if(delta>=0 && A!=0){
            double R1 = (-B + Math.sqrt(delta))/(2*A);
            double R2 = (-B - Math.sqrt(delta))/(2*A);
            
            System.out.printf("R1 = %.5f\n" +
                                        "R2 = %.5f\n",
                                        R1, R2);
        } else {
            System.out.println("Impossivel calcular");
        }
    }
}

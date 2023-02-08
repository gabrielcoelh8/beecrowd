package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 *
 * A empresa ABC resolveu conceder um aumento de salários a seus funcionários de
 * acordo com a tabela abaixo: Salário Percentual de Reajuste 0 - 400.00 400.01
 * - 800.00 800.01 - 1200.00 1200.01 - 2000.00 Acima de 2000.00
 *
 * 15% 12% 10% 7% 4% Leia o salário do funcionário e calcule e mostre o novo
 * salário, bem como o valor de reajuste ganho e o índice reajustado, em
 * percentual.
 *
 * Entrada A entrada contém apenas um valor de ponto flutuante, com duas casas
 * decimais.
 *
 * Saída Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste
 * (ambos devem ser apresentados com 2 casas decimais) e o percentual de
 * reajuste ganho, conforme exemplo abaixo.
 *
 *
 */
public class bee1048 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String line1 = read.nextLine();
        float ABC = Float.parseFloat(line1);
        double salario = ABC;
        double reajuste = 0;
        int percentual = 0;
        
        if(ABC>=0 && ABC<=400.0) {
            percentual = 15;
        } else if(ABC<=800.0) {
            percentual = 12;
        } else if(ABC<=1200.0) {
            percentual = 10;
        } else if(ABC<=2000.0) {
            percentual = 7;
        } else if(ABC>2000.0) {
            percentual = 4;
        }
        
        reajuste = ABC * (percentual * Math.pow(10, -2)); //15 *10^-2
        salario += reajuste;
        
        System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%\n", salario, reajuste, percentual);
    }
}

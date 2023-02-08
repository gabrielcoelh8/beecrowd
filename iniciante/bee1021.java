package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 * 
*/
public class bee1021 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float valor = read.nextFloat();
        valor*=100;
        int converter = (int) valor; //usar valores x100 para não dar erro de precisão
        int valores[] = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};
        int qtd[] = new int[12];
        int cont = 0;
        int aux = converter;
        
        while (cont<valores.length){
            qtd[cont] = aux/valores[cont];
            aux %= valores[cont];
            cont++;
        }
       
        System.out.printf("NOTAS:\n"
                + "%d nota(s) de R$ 100.00\n"
                + "%d nota(s) de R$ 50.00\n"
                + "%d nota(s) de R$ 20.00\n"
                + "%d nota(s) de R$ 10.00\n"
                + "%d nota(s) de R$ 5.00\n"
                + "%d nota(s) de R$ 2.00\n"
                +"MOEDAS:\n"
                + "%d moeda(s) de R$ 1.00\n"
                + "%d moeda(s) de R$ 0.50\n"
                + "%d moeda(s) de R$ 0.25\n"
                + "%d moeda(s) de R$ 0.10\n"
                + "%d moeda(s) de R$ 0.05\n"
                + "%d moeda(s) de R$ 0.01\n",
                qtd[0], qtd[1], qtd[2], qtd[3], 
                qtd[4], qtd[5], qtd[6], qtd[7],
                qtd[8], qtd[9], qtd[10], qtd[11]
        );
    }
}

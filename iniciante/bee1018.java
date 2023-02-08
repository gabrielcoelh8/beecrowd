package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 *
*/
public class bee1018 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int valor = read.nextInt();
        int notas[] = {100, 50, 20, 10, 5, 2, 1};
        int qtd[] = new int[7];
        int cont = 0;
        int aux = valor;
        
        while (cont<notas.length){
            qtd[cont] = aux/notas[cont];
            aux %= notas[cont];
            cont++;
        }
       
        System.out.printf("%d\n"
                + "%d nota(s) de R$ 100,00\n"
                + "%d nota(s) de R$ 50,00\n"
                + "%d nota(s) de R$ 20,00\n"
                + "%d nota(s) de R$ 10,00\n"
                + "%d nota(s) de R$ 5,00\n"
                + "%d nota(s) de R$ 2,00\n"
                + "%d nota(s) de R$ 1,00\n",
                valor, qtd[0], qtd[1], qtd[2], qtd[3], 
                qtd[4], qtd[5], qtd[6]);
    }
}

package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 */
public class bee1050 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int ddd = read.nextInt();
        String[][] ddds = {
            {"61", "Brasilia"},
            {"71", "Salvador"},
            {"11", "Sao Paulo"},
            {"21", "Rio de Janeiro"},
            {"32", "Juiz de Fora"},
            {"19", "Campinas"},
            {"27", "Vitoria"},
            {"31", "Belo Horizonte"}
        };
        int rows = ddds.length;
        //int columns = ddds[0].length;
        
        for (int i = 0; i < rows; i++) {
           int aux = Integer.parseInt(ddds[i][0]);
            if(aux == ddd){
                System.out.println(ddds[i][1]);
                return;
           } else if (i==rows-1){
               System.out.println("DDD nao cadastrado");
           }
        }
    }
}

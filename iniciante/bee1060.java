package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 */
public class bee1060 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int cont = 0;
        for (int i = 0; i < 6; i++) {
            if(read.nextDouble()>0){
                cont++;
            }
        }
        System.out.println(cont+" valores positivos");
    }
}

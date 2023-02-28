package beecrowd.iniciante;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 */
public class bee1114 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        LinkedList<String> outputs = new LinkedList<>();
        int senha = 2002;
        int leitura;

        do {
            leitura = read.nextInt();

            if (leitura == senha) {
                outputs.add("Acesso Permitido");
            } else {
                outputs.add("Senha Invalida");
            }
        } while (leitura != senha);
        
        outputs.stream().forEach(System.out::println);
    }
}

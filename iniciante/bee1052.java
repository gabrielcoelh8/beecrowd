package beecrowd.iniciante;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 */
public class bee1052 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Integer valor = read.nextInt();
        String parse = valor < 10 ? "0" + valor : String.valueOf(valor);
        LocalDate d04 = LocalDate.parse("2000-" + parse + "-01");
        String saida = d04.getMonth().toString();
        saida = saida.toLowerCase();
        saida = saida.substring(0, 1).toUpperCase().concat(saida.substring(1));

        System.out.println(saida);
    }
}

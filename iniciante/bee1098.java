package beecrowd.iniciante;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author gabrielcoelho
 */
public class bee1098 {

    public static void main(String[] args) {
        NumberFormat form = new DecimalFormat("##.#"); //só mostra decimais quando necessario
        float aux = 1;
        for (float i = 0; i <= 2.2; i += 0.2) {
            for (float j = aux; j < (aux + 3); j += 1) {
                System.out.println("I=" + form.format(i) + " J=" + form.format(j));
            }
            aux += 0.2;
        }
    }

    //////////System.out.printf("I=%.1f J=%.1f\n", i, j);
}

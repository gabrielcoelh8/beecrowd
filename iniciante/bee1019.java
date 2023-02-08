package beecrowd.iniciante;

import java.time.Duration;
import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 *
*/
public class bee1019 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int valor = read.nextInt();
        Duration total = Duration.ofSeconds(valor);
        System.out.printf("%d:%d:%d\n", total.toHours(), total.toMinutesPart(), total.toSecondsPart());
    }
}

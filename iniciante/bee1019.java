package beecrowd.iniciante;

import java.time.Duration;
import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 *
 * Leia um valor inteiro, que é o tempo de duração em segundos de um determinado
 * evento em uma fábrica, e informe-o expresso no formato
 * horas:minutos:segundos.
 *
 * Entrada O arquivo de entrada contém um valor inteiro N.
 *
 * Saída Imprima o tempo lido no arquivo de entrada (segundos), convertido para
 * horas:minutos:segundos, conforme exemplo fornecido.
 */
public class bee1019 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int valor = read.nextInt();
        Duration total = Duration.ofSeconds(valor);
        System.out.printf("%d:%d:%d\n", total.toHours(), total.toMinutesPart(), total.toSecondsPart());
    }
}

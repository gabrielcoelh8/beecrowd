package beecrowd.iniciante;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 *
 * Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A
 * seguir calcule a duração do jogo.
 *
 * Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.
 *
 * Entrada Quatro números inteiros representando a hora de início e fim do jogo.
 *
 * Saída Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)”
 * .
 */
public class bee1047 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String line1 = read.nextLine();
        String[] numbers = line1.split("\\s");
        int A = Integer.parseInt(numbers[0]);
        int B = Integer.parseInt(numbers[1]);
        int C = Integer.parseInt(numbers[2]);
        int D = Integer.parseInt(numbers[3]);
        LocalDateTime d1 = LocalDateTime.of(2022, 1, 1, A, B);
        LocalDateTime d2 = LocalDateTime.of(2022, 1, 1, C, D);
        if((A==C && B==D) || (A==C && B>D) || (A>C && B<D) || (A>C && B>D) || (A>C && B==D)) d2 = d2.plusDays(1);
        Duration t2 = Duration.between(d1, d2);
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n",t2.toHours(), t2.toMinutesPart());
        //tester();
    }
    
    public static void tester() {
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        int A = 7;                                                                                                         //hora inicial
        int B = 0;                                                                                                          //minutos iniciais
        LocalDateTime d1 = LocalDateTime.of(2022, 1, 1, A, B);                              //conversão
        //boolean condicional = ((A==C && B==D) || (A==C && B>D) || (A>C && B<D) || (A>C && B>D) || (A>C && B==D));
        
        for (int C = 0; C < 24; C++) { //testa todas as horas do dia
            for (int D = 0; D < 60; D += 15) { //incrementando de 15 em 15 minutos
                LocalDateTime d2 = LocalDateTime.of(2022, 1, 1, C, D);
                
                if((A==C && B==D) || (A==C && B>D) || (A>C && B<D) || (A>C && B>D) || (A>C && B==D)){ //todas as possibilidades
                    d2 = d2.plusDays(1);
                }
                
                Duration timer = Duration.between(d1, d2);
                System.out.printf("d1 =  '%s' d2 = '%s'\n tempo = %s:%s\n\n", fmt2.format(d1), fmt2.format(d2), timer.toHours(), timer.toMinutesPart());
            }
        }
    }
}

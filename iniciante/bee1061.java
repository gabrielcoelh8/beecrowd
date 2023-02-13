package beecrowd.iniciante;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 */
public class bee1061 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in); //read.nextLine();
        String line1 = "Dia 5";
        String line2 = "08 : 12 : 23";
        String line3 = "Dia 9";
        String line4 = "06 : 13 : 23";
        
        int dia1 = Integer.parseInt(line1.substring(4));
        String format1 = String.format("%02d", dia1);
        
        LocalDateTime dataInicial = LocalDateTime.parse("2022-04-"+format1+"T"+ line2.replace(" ", "")); //replace tira o espaço, toString() para verificar
        
        int dia2 = Integer.parseInt(line3.substring(4));
        String format2 = String.format("%02d", dia2);
        
        LocalDateTime dataFinal = LocalDateTime.parse("2022-04-"+format2+"T"+line4.replace(" ", ""));
        
        Duration duracao = Duration.between(dataInicial, dataFinal);  //calcula a diferença entre dois dateTime
        
        System.out.printf("%d dia(s)\n"
                + "%d hora(s)\n"
                + "%d minuto(s)\n"
                + "%d segundo(s)\n", 
                duracao.toDaysPart(), duracao.toHoursPart(), duracao.toMinutesPart(), duracao.toSecondsPart());
    }
}

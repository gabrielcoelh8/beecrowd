package beecrowd.iniciante;

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
        
        LocalDateTime dataInicial = LocalDateTime.parse("2022-"+format1+"-20T"+ line2.replace(" ", ""));
        
        int dia2 = Integer.parseInt(line3.substring(4));
        String format2 = String.format("%02d", dia2);
        
        LocalDateTime dataFinal = LocalDateTime.parse("2022-"+format2+"-20T"+line4.replace(" ", ""));
        
        
        System.out.println(format1);
        
        /*System.out.printf("3 dia(s)\n"
                + "22 hora(s)\n"
                + "1 minuto(s)\n"
                + "0 segundo(s)\n");*/
    }
}

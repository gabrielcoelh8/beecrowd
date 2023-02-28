package beecrowd.iniciante;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 */
public class bee1117 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        LinkedList<String> outputs = new LinkedList<>();
        int cont = 0;
        double sum = 0;
        
        while(cont<2) {
           double num = Double.parseDouble(read.nextLine());
           
           if(num>=0 && num<= 10) {
               sum += num;
               cont++;
           } else {
               outputs.add("nota invalida");
           }
        }
        
        double media = sum/cont;
        NumberFormat form = new DecimalFormat("##.##");
        outputs.add("media = "+form.format(media));
        outputs.stream().forEach(System.out::println);
    }
}

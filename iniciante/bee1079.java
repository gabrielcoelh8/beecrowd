package beecrowd.iniciante;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 */
public class bee1079 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int N = Integer.parseInt(read.nextLine());
        LinkedList<String> leituras = new LinkedList<>();
        
        for (int i = 0; i < N; i++) {
            String line = read.nextLine();
            leituras.add(line);
        }
    
        for (int i = 0; i < leituras.size(); i++) {
            String get = leituras.get(i);
            String[] notas = get.split("\\s");
            double n1 = Double.parseDouble(notas[0]);
            double n2 = Double.parseDouble(notas[1]);
            double n3 = Double.parseDouble(notas[2]);
            double mediaPonderada = ((n1*2) + (n2*3) + (n3*5))/10;
            System.out.printf("%.1f\n",mediaPonderada);
        }
    }
}

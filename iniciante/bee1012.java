package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 * 
*/
public class bee1012 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String line1 = read.nextLine();
        String[] words1 = line1.split("\\s");
        double A = Double.parseDouble(words1[0]);
        double B = Double.parseDouble(words1[1]);
        double C = Double.parseDouble(words1[2]);
        double TRIANGULO = (A*C)/2;
        double CIRCULO = 3.14159 * Math.pow(C,2);
        double TRAPEZIO = ((A+B)*C)/2;
        double QUADRADO = Math.pow(B, 2);
        double RETANGULO = A*B;
        
        System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO);
    }
}

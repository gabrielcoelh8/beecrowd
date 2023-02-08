package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 * 
Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. 
O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.
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

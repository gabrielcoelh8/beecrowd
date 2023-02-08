package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 *
 * Leia os quatro valores correspondentes aos eixos x e y de dois pontos
 * quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles,
 * mostrando 4 casas decimais após a vírgula, segundo a fórmula:
 *
 * Entrada 
 * O arquivo de entrada contém duas linhas de dados. A primeira linha
 * contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois
 * valores de ponto flutuante x2 y2.
 *
 * Saída 
 * Calcule e imprima o valor da distância segundo a fórmula fornecida, com
 * 4 casas após o ponto decimal.
 */
public class bee1015 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        String line1 = read.nextLine();
        String[] words1 = line1.split("\\s");
        float x1 = Float.parseFloat(words1[0]);
        float y1 = Float.parseFloat(words1[1]);
        
        String line2 = read.nextLine();
        String[] words2 = line2.split("\\s");
        float x2 = Float.parseFloat(words2[0]);
        float y2 = Float.parseFloat(words2[1]);
        
        float out = (float) Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        
        System.out.printf("%.4f%n", out);
    }
}

package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 *
*/
public class bee1040 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String line1 = read.nextLine();
        String[] numbers = line1.split("\\s");
        float N1 = Float.parseFloat(numbers[0]);
        float N2 = Float.parseFloat(numbers[1]);
        float N3 = Float.parseFloat(numbers[2]);
        float N4 = Float.parseFloat(numbers[3]);

        float media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;

        if (media >= 7.0) {
            System.out.printf("Media: %.1f%nAluno aprovado.%n", media);
        } else if (media >= 5.0) {
            float N5 = Float.parseFloat(read.nextLine());
            System.out.printf("Media: %.1f%n", media);
            media = (media + N5) / 2;
            if (media >= 5.0) {
                System.out.printf("Aluno em exame.%nNota do exame: %.1f%nAluno aprovado.%nMedia final: %.1f%n", N5, media);
            } else {
                System.out.printf("Aluno em exame.%nNota do exame: %.1f%nAluno reprovado.%nMedia final: %.1f%n", N5, media);
            }
        } else {
            System.out.printf("Media: %.1f%nAluno reprovado.%n", media);
        }
    }
}


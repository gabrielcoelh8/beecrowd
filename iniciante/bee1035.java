package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 * 
Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D, ambos, 
forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

Entrada
Quatro números inteiros A, B, C e D.

Saída
Mostre a respectiva mensagem após a validação dos valores.
* 
* 
B>C
D>A
C+D > A+B
C & D > 0
A (PAR)
 */
public class bee1035 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String line1 = read.nextLine();
        String[] numbers = line1.split("\\s");
        int A = Integer.parseInt(numbers[0]);
        int B = Integer.parseInt(numbers[1]);
        int C = Integer.parseInt(numbers[2]);
        int D = Integer.parseInt(numbers[3]);
        
        if((B > C) && (D > A) && ((C+D)>(A+B)) && (C>0) && (D>0) && (A%2==0)){
            System.out.println("Valores aceitos"); 
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}

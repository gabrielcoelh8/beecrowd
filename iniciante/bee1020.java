package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 * 
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido.
 */
public class bee1020 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int valor = read.nextInt();
        int anos = valor/365;
        int meses = (valor%365)/30;
        int dias = (valor%365)%30;
        System.out.printf(
                "%d ano(s)\n" +
                "%d mes(es)\n" +
                "%d dia(s)\n", 
                anos, meses, dias);
    }
}

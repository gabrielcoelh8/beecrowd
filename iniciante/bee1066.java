package beecrowd.iniciante;
import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 */
public class bee1066 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int contPar = 0, contImpar = 0, contPositivo = 0, contNegativo = 0;
        
        for (int i = 0; i < 5; i++) {
            double leitura = read.nextDouble();
            
            if(leitura>0) {
                contPositivo++;
            } else if(leitura<0) {
                contNegativo++;
            }
            
            if(leitura%2==0){
                contPar++;
            } else if(leitura%2!=0){
                contImpar++;
            }
        }
        
        System.out.printf("%d valor(es) par(es)\n"
                                + "%d valor(es) impar(es)\n"
                                + "%d valor(es) positivo(s)\n"
                                + "%d valor(es) negativo(s)\n",
                                contPar, contImpar, contPositivo, contNegativo);
    }
}

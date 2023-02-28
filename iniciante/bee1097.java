package beecrowd.iniciante;

/**
 *
 * @author gabrielcoelho
 */
public class bee1097 {
    public static void main(String[] args) {
        int aux = 7;
        for (int i = 1; i <= 9; i+=2) {
            for (int j = aux; j >= (aux-2); j--) {
                System.out.printf("I=%d J=%d\n", i, j);
            }
            aux+=2;
        }
    }
}

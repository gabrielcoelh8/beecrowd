package beecrowd.iniciante;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author gabrielcoelho
 *
*/
public class bee1042 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String line1 = read.nextLine();
        List<Integer> numbersList = Arrays.stream(line1.split("\\s")).map(Integer::parseInt).collect(Collectors.toList());
        
        numbersList.stream().sorted().forEach(System.out::println);
        System.out.println("");
        numbersList.stream().forEach(System.out::println);
    }
}

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - PACKAGE_NAME
 * Date: June / 2022
 */
public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> mayores = new ArrayList<>();

        int suma = 0;
        for (Integer number : numbers) {
            suma += number;
        }
        double media = suma * 1.0 / numbers.size();
        for (Integer number : numbers) {
            if (number > media) {
                mayores.add(number);
            }
        }


        if (mayores.isEmpty()) {
            System.out.println("No");
        } else {
            Collections.sort(mayores);
            Collections.reverse(mayores);
            for (int i = 0; i < mayores.size(); i++) {
                System.out.print(mayores.get(i) + " ");
                if (i ==4){
                    break;
                }
            }
        }


    }
}

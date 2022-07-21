package List_Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - List_Lab
 * Date: June / 2022
 */
public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                numbers.set(i, numbers.get(i) + numbers.get(i + 1));
                numbers.remove(i + 1);
                i = -1;
            }
        }

        String output = joinElementsByDelimiter(numbers, " ");
        System.out.println(output);

    }

    private static String joinElementsByDelimiter(List<Double> items, String delimiter) {
        String result = "";
        for (Double num : items) {
            //DecimalFormat df = new DecimalFormat("0.#");
           // String numFormat = df.format(num) + delimiter;
            //result += numFormat;
            result += (new DecimalFormat("0.#").format(num)) + delimiter;

        }
        return result;
    }
}

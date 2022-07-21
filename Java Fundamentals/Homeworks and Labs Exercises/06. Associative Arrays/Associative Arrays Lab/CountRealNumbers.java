package Associative_Arrays_Lab;

import java.text.DecimalFormat;
import java.util.*;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Associative_Arrays_Lab
 * Date: July / 2022
 * <p>
 * Read a list of real numbers and print them in ascending order along with their number of occurrences.
 */
public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();


        TreeMap<Double, Integer> counts = new TreeMap<>();


        for (double number : numbers) {
            if (!counts.containsKey(number)) {
                counts.put(number, 1);
            } else {
                counts.put(number, counts.get(number) + 1);
            }
        }

        for (Map.Entry<Double, Integer> item : counts.entrySet()) {
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            System.out.printf("%.0f -> %d%n", item.getKey(), item.getValue());
        }


    }
}

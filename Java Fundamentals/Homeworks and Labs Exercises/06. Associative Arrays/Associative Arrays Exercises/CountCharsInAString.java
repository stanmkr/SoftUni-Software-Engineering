package Associative_Arrays_Exercises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Associative_Arrays_Exercises
 * Date: July / 2022
 */
public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String texto = scanner.nextLine();
        Map<Character, Integer> occurrences = new LinkedHashMap<>();

        for (char letra : texto.toCharArray()) {
            if (letra != ' ') {
                if (!occurrences.containsKey(letra)) {
                    occurrences.put(letra, 1);
                } else {
                    occurrences.put(letra, occurrences.get(letra) + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }

        // VARIANT 2 WITH LAMBDA
       // occurrences.entrySet().forEach(entry -> System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue()));

    }
}

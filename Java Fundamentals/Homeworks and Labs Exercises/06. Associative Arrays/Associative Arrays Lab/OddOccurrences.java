package Associative_Arrays_Lab;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Associative_Arrays_Lab
 * Date: July / 2022
 * <p>
 * Write a program that extracts from a given sequence of words all elements that are present in it an odd number of times (case-insensitive).
 */
public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> palabras = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());


        List<String> repetidas = new ArrayList<>();

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String palabra : palabras) {
            String palabraMinuscula = palabra.toLowerCase();
            if (!map.containsKey(palabraMinuscula)) {
                map.put(palabraMinuscula, 1);
            } else {
                map.put(palabraMinuscula, map.get(palabraMinuscula) + 1);
            }
        }


        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                repetidas.add(entry.getKey());
            }
        }

        System.out.print(String.join(", ", repetidas));


    }
}

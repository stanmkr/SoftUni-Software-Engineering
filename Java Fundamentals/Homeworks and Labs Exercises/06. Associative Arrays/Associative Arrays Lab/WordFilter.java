package Associative_Arrays_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Associative_Arrays_Lab
 * Date: July / 2022
 * <p>
 * Read an array of strings, take only words which length is even. Print each word on a new line.
 */
public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> palabras = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .filter(palabra -> palabra.length() % 2 == 0)
                .collect(Collectors.toList());


        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}

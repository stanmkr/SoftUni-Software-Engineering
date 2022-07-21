package List_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - List_Lab
 * Date: June / 2022
 */
public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int size = numbers.size() / 2;
        for (int i = 0; i < size; i++) {
            int primerNumero = numbers.get(i);
            int segundoNumero = numbers.get(numbers.size() - 1);
            int sum = primerNumero + segundoNumero;
            numbers.set(i, sum);
            numbers.remove(numbers.size() - 1);
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}

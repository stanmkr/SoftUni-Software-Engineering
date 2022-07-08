package List_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - List_Exercise
 * Date: June / 2022
 */
public class BombNumbers {
    public static void main(String[] args) {

        /*
        Write a program that reads a sequence of numbers and a special bomb number with a certain power.
        Your task is to detonate every occurrence of the special bomb number and according to its power - his neighbors
        from left and right. Detonations are performed from left to right and all detonated numbers disappear.
        Finally, print the sum of the remaining elements in the sequence.
         */
        Scanner scanner = new Scanner(System.in);

        List<Integer> sequence = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int specialNumber = numbers.get(0);
        int power = numbers.get(1);
        int sum = 0;

        while (sequence.contains(specialNumber)) {
            int index = sequence.indexOf(specialNumber);
            int left = Math.max(0, index - power);
            int right = Math.min(index + power, sequence.size() - 1);

            for (int i = right; i >= left; i--) {
                sequence.remove(i);
            }

        }

        for (Integer item : sequence) {
            sum += item;
        }
        System.out.println(sum);

    }
}

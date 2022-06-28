package Arrays_exercises;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Arrays_exercises
 * Date: June / 2022
 */

import java.util.Arrays;

import java.util.Scanner;


public class equal_sums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine() //"1 2 3 3"
                        .split(" "))  //["1", "2", "3", "3"]
                .mapToInt(Integer::parseInt)  //[1, 2, 3, 3]
                .toArray();

        boolean isFound = false;

        for (int index = 0; index <= numbers.length - 1; index++) {
            int leftSum = 0;
            int rightSum = 0;


            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum += numbers[leftIndex];
            }


            for (int rightIndex = index + 1; rightIndex <= numbers.length - 1; rightIndex++) {
                rightSum += numbers[rightIndex];
            }

            if (leftSum == rightSum) {
                System.out.println(index);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("no");
        }

    }
}

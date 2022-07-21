package Arrays_exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Arrays_exercises
 * Date: June / 2022
 */
public class top_integers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> topIntegers = new ArrayList<>();
        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i <= array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i] + " ");
                break;
            }
            boolean esTop = false;

            for (int j = i + 1; j <= array.length - 1; j++) {
                if (array[i] > array[j]) {
                    esTop = true;
                } else {
                    esTop = false;
                    break;
                }
            }
            if (esTop) {
                System.out.print(array[i] + " ");
            }
        }

    }
}

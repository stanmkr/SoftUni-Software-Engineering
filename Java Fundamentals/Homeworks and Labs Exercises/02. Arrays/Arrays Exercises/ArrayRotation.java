package Arrays_exercises;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Arrays_exercises
 * Date: June / 2022
 */
public class array_rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rotation = scanner.nextInt(); // number of rotation
        if (rotation == array.length) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            for (int i = 1; i <= rotation; i++) {
                int first_element = array[0];
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = first_element;
            }
            for (int i : array) {
                System.out.print(i + " ");
            }
        }
    }
}

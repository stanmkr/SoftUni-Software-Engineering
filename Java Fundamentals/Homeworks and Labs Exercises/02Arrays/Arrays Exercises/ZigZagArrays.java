package Arrays_exercises;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Arrays_exercises
 * Date: June / 2022
 */
public class zig_zag_arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrays_size = scanner.nextInt();
        scanner.nextLine();
        int[] first_array = new int[arrays_size];
        int[] second_array = new int[arrays_size];
        for (int i = 1; i <= arrays_size; i++) {
            String numbers = scanner.nextLine();
            int first_number = Integer.parseInt(numbers.split(" ")[0]);
            int second_number = Integer.parseInt(numbers.split(" ")[1]);

            if (i % 2 == 0) { // cheten red
                second_array[i - 1] = first_number;
                first_array[i - 1] = second_number;
            } else { // necheten red
                second_array[i - 1] = second_number;
                first_array[i - 1] = first_number;
            }
        }
        for (int i = 0; i < first_array.length; i++) {
            System.out.print(first_array[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < second_array.length; i++) {
            System.out.print(second_array[i] + " ");
        }

    }
}

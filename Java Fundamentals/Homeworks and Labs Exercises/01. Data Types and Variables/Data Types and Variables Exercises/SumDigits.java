package Data_Types_and_Variables_exercises;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Data_Types_and_Variables - Data_Types_and_Variables_exercises
 * Date:  / 2022
 */
public class sum_digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int singleInteger = scanner.nextInt();
        int sum = 0;
        while (singleInteger > 0) {
            int last_digit = singleInteger % 10;
            sum += last_digit;
            singleInteger = singleInteger / 10;
        }
        System.out.println(sum);
    }
}

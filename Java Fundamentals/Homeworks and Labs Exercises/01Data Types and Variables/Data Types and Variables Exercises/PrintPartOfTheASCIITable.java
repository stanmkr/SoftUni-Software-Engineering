package Data_Types_and_Variables_exercises;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Data_Types_and_Variables - Data_Types_and_Variables_exercises
 * Date:  / 2022
 */
public class print_part_of_the_ascii_table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        for (int i = start; i <= end; i++) {
            char ascii = (char) i;
            System.out.print(ascii + " ");
        }
    }
}

package Data_Types_and_Variables_exercises;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Data_Types_and_Variables - Data_Types_and_Variables_exercises
 * Date:  / 2022
 */
public class triples_of_latin_letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (char letter1 = 'a'; letter1 < 'a' + n; letter1++) {
            for (char letter2 = 'a'; letter2 < 'a' + n; letter2++) {
                for (char letter3 = 'a'; letter3 < 'a' + n; letter3++) {
                    System.out.printf("%c%c%c%n", letter1, letter2, letter3);
                }
            }
        }


    }
}

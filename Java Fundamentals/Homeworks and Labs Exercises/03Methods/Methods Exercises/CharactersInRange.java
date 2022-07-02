package Methods_Exercises;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Methods_Exercises
 * Date: June / 2022
 */
public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char character1 = scanner.nextLine().charAt(0);
        char character2 = scanner.nextLine().charAt(0);
        printingChars(character1, character2);

    }

    private static void printingChars(char start, char end) {
        if (start > end) {
            for (int i = end + 1; i < start; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = start + 1; i < end; i++) {
                System.out.print((char) i + " ");
            }
        }


    }
}

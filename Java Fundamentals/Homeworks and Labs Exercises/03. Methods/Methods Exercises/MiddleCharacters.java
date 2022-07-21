package Methods_Exercises;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Methods_Exercises
 * Date: June / 2022
 */
public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        printsMiddleCharacter(text);


    }

    private static void printsMiddleCharacter(String text) {
        if (text.length() % 2 != 0) {
            int indexMiddle = text.length() / 2;
            System.out.println(text.charAt(indexMiddle));

        } else {
            int indexFirstMidChar = (text.length() / 2) - 1;
            int indexSecondMidChar = text.length() / 2;
            System.out.println("" + text.charAt(indexFirstMidChar) + text.charAt(indexSecondMidChar));
        }

    }

}

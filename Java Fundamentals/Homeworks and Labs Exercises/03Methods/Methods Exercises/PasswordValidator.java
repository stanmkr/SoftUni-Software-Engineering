package Methods_Exercises;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Methods_Exercises
 * Date: June / 2022
 */
public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (validLength(password) && validAtLeast2Digits(password) && validLettersDigits(password)) {
            System.out.println("Password is valid");
        }
        if (!validLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!validLettersDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!validAtLeast2Digits(password)) {
            System.out.println("Password must have at least 2 digits");
        }


    }


    private static boolean validAtLeast2Digits(String password) {
        int digitCount = 0;
        char[] array = password.toCharArray();
        for (int i = 0; i < array.length; i++) {

            if (Character.isDigit(array[i])) {
                digitCount++;
            }
        }
        return digitCount >= 2;

    }

    private static boolean validLettersDigits(String password) {
        boolean valid = false;
        char[] array = password.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (Character.isAlphabetic(array[i]) || Character.isDigit(array[i])) {
                valid = true;
            } else {
                valid = false;
                break;
            }
        }
        return valid;

    }

    private static boolean validLength(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }
}

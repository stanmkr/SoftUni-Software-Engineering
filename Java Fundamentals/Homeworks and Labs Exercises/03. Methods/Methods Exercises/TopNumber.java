package Methods_Exercises;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Methods_Exercises
 * Date: June / 2022
 */
public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            if (isSumDigitsDivisibleBy8(i) && itContainsOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isSumDigitsDivisibleBy8(int num) {
        int sumDigits = 0;
        while (num > 0) {
            sumDigits = sumDigits + (num % 10);
            num = num / 10;
        }

        return sumDigits % 8 == 0;

    }

    private static boolean itContainsOddDigit(int num) {
        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit % 2 != 0) {
                return true;
            } else {
                num = num / 10;
            }
        }
        return false;

    }

}

package TextProcessing_Exercises;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - TextProcessing_Exercises
 * Date: July / 2022
 */
public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger num1  = scanner.nextBigInteger();
        BigInteger num2 = scanner.nextBigInteger();

        System.out.println(num1.multiply(num2));
    }
}

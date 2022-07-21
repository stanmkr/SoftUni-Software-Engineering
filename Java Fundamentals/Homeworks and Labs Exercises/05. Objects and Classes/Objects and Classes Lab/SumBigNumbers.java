package Objects_and_Classes_LAB;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Objects_and_Classes_LAB
 * Date: July / 2022
 */
public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger num1 = new BigInteger(scanner.nextLine());
        BigInteger num2 = new BigInteger(scanner.nextLine());

        BigInteger suma = num1.add(num2);
        System.out.println(suma);
    }
}

package Methods_Exercises;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Methods_Exercises
 * Date: June / 2022
 */
public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        long fact1 = factorial(num1);
        long fact2 = factorial(num2);

        System.out.printf("%.2f",division(fact1,fact2));

    }

    private static long factorial(int num) {
        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    private static double division(double num1, double num2) {
        return num1 / num2;
    }

}

package Methods_Lab;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Methods_Lab
 * Date: junio / 2022
 */
public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int num2 = Integer.parseInt(scanner.nextLine());
        switch (operator) {
            case "*":
                System.out.println(getMultiply(num1, num2));
                break;
            case "/":
                System.out.println(getDivision(num1, num2));
                break;
            case "+":
                System.out.println(getSum(num1, num2));
                break;
            case "-":
                System.out.println(getRest(num1, num2));
                break;

        }

    }

    public static int getMultiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int getSum(int num1, int num2) {
        return num1 + num2;
    }

    public static int getDivision(int num1, int num2) {
        return num1 / num2;
    }

    public static int getRest(int num1, int num2) {
        return num1 - num2;
    }
}

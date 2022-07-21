package Methods_Lab;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Methods_Lab
 * Date: June / 2022
 */
public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actionInput = scanner.nextLine();
        int firstNumInput = Integer.parseInt(scanner.nextLine());
        int secondNumInput = Integer.parseInt(scanner.nextLine());

        switch (actionInput) {
            case "add":
                printAddNumbers(firstNumInput, secondNumInput);
                break;
            case "multiply":
                printMultiplyNumbers(firstNumInput, secondNumInput);
                break;
            case "subtract":
                printSubtractNumbers(firstNumInput, secondNumInput);
                break;
            case "divide":
                printDivideNumbers(firstNumInput, secondNumInput);
                break;
        }
    }

    public static void printAddNumbers(int firstNum, int secondNum) {
        int result = firstNum + secondNum;
        System.out.println(result);
    }

    public static void printMultiplyNumbers(int firstNum, int secondNum) {
        int result = firstNum * secondNum;
        System.out.println(result);
    }

    public static void printSubtractNumbers(int firstNum, int secondNum) {
        int result = firstNum - secondNum;
        System.out.println(result);
    }

    public static void printDivideNumbers(int firstNum, int secondNum) {
        int result = firstNum / secondNum;
        System.out.println(result);
    }
}


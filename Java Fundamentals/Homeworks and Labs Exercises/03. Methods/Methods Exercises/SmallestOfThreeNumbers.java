package Methods_Exercises;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Methods_Exercises
 * Date: June / 2022
 */
public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        getSmallestNumbr(number1,number2,number3);

    }

    private static void getSmallestNumbr (int num1, int num2, int num3){
        if (num1 <= num2 && num1 <= num3){
            System.out.println(num1);

        }else if (num2 <= num1 && num2 <= num3){
            System.out.println(num2);
        }else if (num3 <= num1 && num3 <= num2){
            System.out.println(num3);
        }
    }
}

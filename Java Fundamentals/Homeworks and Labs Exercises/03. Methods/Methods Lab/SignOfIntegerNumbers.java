package Methods_Lab;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Methods_Lab
 * Date: June / 2022
 */
public class sign_of_integer_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        signOfInteger(number);
    }

    public static void signOfInteger (int num){
        if (num > 0){
            System.out.printf("The number %d is positive.",num);
        } else if (num <0) {
            System.out.printf("The number %d is negative.",num);
        }else {
            System.out.printf("The number %d is zero.",num);
        }
    }
}

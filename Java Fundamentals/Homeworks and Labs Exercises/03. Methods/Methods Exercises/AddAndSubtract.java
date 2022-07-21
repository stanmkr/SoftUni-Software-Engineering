package Methods_Exercises;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Methods_Exercises
 * Date: June / 2022
 */
public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.println(restar(sum(num1,num2),num3));


    }
    private static int sum (int num1, int num2){
        return num1+num2;
    }
    private static int restar (int num1, int num2) {
        return num1-num2;
    }

}

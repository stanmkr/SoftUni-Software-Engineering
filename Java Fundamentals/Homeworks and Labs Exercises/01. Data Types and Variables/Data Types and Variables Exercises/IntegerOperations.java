package Data_Types_and_Variables_exercises;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Data_Types_and_Variables - Data_Types_and_Variables_exercises
 * Date:  / 2022
 */
public class integer_operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1,num2,num3,num4,result;
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        num4 = scanner.nextInt();
        result = ((num1+num2)/num3) * num4;
        System.out.println(result);




    }
}

package Data_Types_and_Variables_exercises;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Data_Types_and_Variables - Data_Types_and_Variables_exercises
 * Date:  / 2022
 */
public class elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number_people = scanner.nextInt();
        int capacity = scanner.nextInt();
        //курсове = хората / капацитета -> дробно число -> нагоре -> отпечатвам
        int courses =  (int)Math.ceil(number_people *1.0 / capacity);

        System.out.println(courses);
    }
}

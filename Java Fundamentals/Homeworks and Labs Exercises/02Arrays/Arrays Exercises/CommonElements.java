package Arrays_exercises;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Arrays.Arrays_exercises
 * Date: June / 2022
 */
public class common_elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String first_input = scanner.nextLine();

        String second_input = scanner.nextLine();


        String[] first_elements = first_input.split(" ");
        String[] second_elements = second_input.split(" ");

        for (String firstElement : first_elements) {
            for (String second_element : second_elements) {
                if (firstElement.equals(second_element)){
                    System.out.print(firstElement+ " ");
                    break;
                }
            }
        }

    }
}

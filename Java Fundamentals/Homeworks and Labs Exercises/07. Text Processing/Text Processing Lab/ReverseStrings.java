package TextProcessing_Lab;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - TextProcessing_Lab
 * Date: July / 2022
 */
public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String reverse = "";
            for (int i = input.length()-1; i >= 0; i--) {
                reverse += input.charAt(i);
            }
            System.out.printf("%s = %s%n", input, reverse);
            input = scanner.nextLine();
        }
    }
}

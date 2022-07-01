package Methods_Lab;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Methods_Lab
 * Date: June / 2022
 */
public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(repeat(scanner.nextLine(), scanner.nextInt()));

    }

    public static String repeat(String text, int num) {
        String result = "";
        for (int i = 0; i < num; i++) {
            result += text;
        }
        return result;
    }
}

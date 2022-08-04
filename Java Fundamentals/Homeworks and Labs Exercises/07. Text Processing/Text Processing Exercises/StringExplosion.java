package TextProcessing_Exercises;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - TextProcessing_Exercises
 * Date: July / 2022
 */
public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());
        char explosion = '>';
        int fuerzaTotal = 0;
        for (int i = 0; i < input.length(); i++) {
            char simbolo = input.charAt(i);
            if (simbolo == explosion) {
                int fuerza = Integer.parseInt(input.charAt(i + 1) + "");
                fuerzaTotal += fuerza;
            } else if (simbolo != explosion && fuerzaTotal > 0) {
                input.deleteCharAt(i);
                fuerzaTotal--;
                i--;
            }
        }
        System.out.println(input);
    }
}

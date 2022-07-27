package TextProcessing_Lab;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - TextProcessing_Lab
 * Date: July / 2022
 */
public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrayStrings = scanner.nextLine().split(" ");
        StringBuilder result = new StringBuilder();
        String resultado = "";
        for (String palabra : arrayStrings) {
            int length = palabra.length();
            for (int i = 0; i < length; i++) {
                result.append(palabra);
            }
        }

        System.out.println(result);
//        for (int i = 0; i < arrayStrings.length; i++) {
//            int length = arrayStrings[i].length();
//            for (int j = 0; j < length; j++) {
//                resultado += arrayStrings[i];
//            }
//        }
//        System.out.println(resultado);

    }
}

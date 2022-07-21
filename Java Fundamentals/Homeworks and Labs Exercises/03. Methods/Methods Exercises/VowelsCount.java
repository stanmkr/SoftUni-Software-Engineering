package Methods_Exercises;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Methods_Exercises
 * Date: June / 2022
 */
public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();
        System.out.println(getVowels(text));

    }

    private static int getVowels(String text){
        int count = 0;
        char[] letras = text.toCharArray();
        for (int i = 0; i < letras.length ; i++) {
            switch (letras[i]){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
            }
        }
        return count;

    }
}

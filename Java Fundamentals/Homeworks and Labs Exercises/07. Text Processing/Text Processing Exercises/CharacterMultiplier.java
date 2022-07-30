package TextProcessing_Exercises;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - TextProcessing_Exercises
 * Date: July / 2022
 */
public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(CharMultiplier(input.split(" ")[0], input.split(" ")[1]));


    }


    static long CharMultiplier(String input1, String input2) {
        long suma = 0;
        char[] primerInput = input1.toCharArray();
        char[] segundoInput = input2.toCharArray();
        int longitudMinima = Math.min(primerInput.length, segundoInput.length);
        int longitudMaxima = Math.max(primerInput.length, segundoInput.length);

        for (int i = 0; i < longitudMinima; i++) {
            suma += primerInput[i] * segundoInput[i];
        }
        if (longitudMaxima == primerInput.length) {
            for (int i = longitudMinima; i < longitudMaxima; i++) {
                suma += primerInput[i];
            }
        } else {
            for (int i = longitudMinima; i < longitudMaxima; i++) {
                suma += segundoInput[i];
            }
        }
        return suma;
    }
}

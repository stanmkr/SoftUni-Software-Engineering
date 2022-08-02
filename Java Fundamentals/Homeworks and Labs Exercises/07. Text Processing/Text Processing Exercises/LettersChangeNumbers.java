package TextProcessing_Exercises;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - TextProcessing_Exercises
 * Date: July / 2022
 */
public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] codes = scanner.nextLine().split("\\s+");

        double totalSum = 0;
        for (String code : codes) {
            double numero = getNumeroModificado(code);
            totalSum += numero;
        }

        System.out.printf("%.2f", totalSum);
    }

    private static double getNumeroModificado(String code) {
        // kod: {bukva} {chislo} {bukva}
        char primeraLetra = code.charAt(0);
        char segundaLetra = code.charAt(code.length() - 1);

        double number = Double.parseDouble(code.replace(primeraLetra, ' ') // 12b
                .replace(segundaLetra, ' ') // " 12 "
                .trim()); //"12" -> 12

        if (Character.isUpperCase(primeraLetra)) {
            //ascii: [65:90]
            int posicionLetraMayuscula = (int) primeraLetra - 64;
            number /= posicionLetraMayuscula;
        } else {
            // ascii: [97:122]
            int posicionLetraMinuscula = (int) primeraLetra - 96;
            number *= posicionLetraMinuscula;
        }

        if (Character.isUpperCase(segundaLetra)) {
            //ascii: [65:90]
            int posicionLetraMayuscula = (int) segundaLetra - 64;
            number -= posicionLetraMayuscula;
        } else {
            // ascii: [97:122]
            int posicionLetraMinuscula = (int) segundaLetra - 96;
            number += posicionLetraMinuscula;
        }
        return number;

    }
}

package Methods_Lab;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Methods_Lab
 * Date: junio / 2022
 */
public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Math.abs(scanner.nextInt());
        System.out.println(getEvenOddsMultiply(sumaPares(number),sumaImares(number)));
    }


    public static int getEvenOddsMultiply(int sumaPares, int sumaImpares) {
        return sumaPares * sumaImpares;
    }

    public static int sumaPares(int number) {
        int suma = 0;
        int digit;
        while (number > 0) {
            digit = number % 10;
            if (digit % 2 == 0) {
                suma += digit;
            }
            number = number / 10;
        }

        return suma;
    }

    public static int sumaImares(int number) {
        int suma = 0;
        int digit;
        while (number > 0) {
            digit = number % 10;
            if (digit % 2 != 0) {
                suma += number % 10;
            }
            number = number / 10;
        }

        return suma;
    }
}

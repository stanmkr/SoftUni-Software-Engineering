package Methods_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Methods_Lab
 * Date: June / 2022
 */
public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.####");
        System.out.printf(decimalFormat.format(mathPower(scanner.nextDouble(), scanner.nextDouble())));

    }

    public static double mathPower(double num1, double num2) {
        return Math.pow(num1, num2);
    }
}

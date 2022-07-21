package Methods_Lab;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Methods_Lab
 * Date: June / 2022
 */
public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double widthInput = Double.parseDouble(scanner.nextLine());
        double lengthInput = Double.parseDouble(scanner.nextLine());

        double area = calculateRectangleArea(widthInput, lengthInput);

        System.out.printf("%.0f", area);
    }

    public static double calculateRectangleArea(double width, double length) {
        return width * length;
    }
}

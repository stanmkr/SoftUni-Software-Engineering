package Methods_Lab;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Methods_Lab
 * Date: June / 2022
 */
public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        printingTriangle(num);
    }

    public static void printingTriangle(int num) {
        for (int i = 1; i <= num; i++) {
            line(1, i);
        }
        for (int i = num - 1; i >= 1; i--) {
            line(1, i);
        }
    }

    public static void line(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

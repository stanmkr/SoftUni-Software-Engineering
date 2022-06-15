package JAVA.PROGRAMMING_BASICS.Conditional_Statements.Excercises;

import java.util.Scanner;

public class Time15minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalTime = minutes + (60 * hours);


    }
}

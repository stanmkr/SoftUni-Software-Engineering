package JAVA.PROGRAMMING_BASICS.Conditional_Statements.Excercises;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstRacer = Integer.parseInt(scanner.nextLine());
        int secondRacer = Integer.parseInt(scanner.nextLine());
        int thirdRacer = Integer.parseInt(scanner.nextLine());
        int totalTime = firstRacer + secondRacer + thirdRacer;

        int minutes = totalTime / 60;
        int seconds = totalTime % 60;
        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
        // DOS FORMAS DE HACER FORMATEO __________________
        System.out.printf("%d:%02d", minutes, seconds);
    }
}

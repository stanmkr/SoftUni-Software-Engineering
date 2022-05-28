package JAVA.PROGRAMMING_BASICS.Conditional_Statements.Excercises;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0;
        if (number <= 100) {
            bonusPoints = bonusPoints + 5;
        } else if (number > 1000) {
            bonusPoints = number * 0.1;
        } else {
            bonusPoints = number * 0.2;
        }
        if (number % 2 == 0) {
            bonusPoints = bonusPoints +1;
        } else if (number % 5 == 0) {
            bonusPoints += 2;
        }

        System.out.println(bonusPoints);
        System.out.println(bonusPoints + number);

    }
}

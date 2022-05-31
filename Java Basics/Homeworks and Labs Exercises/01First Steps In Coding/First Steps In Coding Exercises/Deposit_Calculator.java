package JAVA.PROGRAMMING_BASICS.First_Steps_In_Coding.EXCERCISES;

import java.util.Scanner;

public class Deposit_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposited = Double.parseDouble(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());
        double interestRateMonthly = deposited * (interestRate / 100) / 12;
        double totalSum = deposited + month * interestRateMonthly;
        System.out.println(totalSum);
    }
}

package JAVA.PROGRAMMING_BASICS.Conditional_Statements.Lab;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = Integer.parseInt(scanner.nextLine());
        int secondGrade = Integer.parseInt(scanner.nextLine());

        if (grade > secondGrade) {
            System.out.println(grade);
        } else {
            System.out.println(secondGrade);
        }
    }
}

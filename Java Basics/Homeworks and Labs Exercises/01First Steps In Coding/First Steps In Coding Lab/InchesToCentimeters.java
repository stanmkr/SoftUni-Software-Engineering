package JAVA.PROGRAMMING_BASICS.First_Steps_In_Coding.LAB;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        double currentCmConvertion = 2.54;
        Scanner scanner = new Scanner(System.in);
        double inches = Double.parseDouble(scanner.nextLine());
        double convertingInchToCm = inches * currentCmConvertion;
        System.out.println(convertingInchToCm);
    }
}



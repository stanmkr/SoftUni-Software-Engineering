package JAVA.PROGRAMMING_BASICS.First_Steps_In_Coding.LAB;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        double pricePerCubicMeter = 7.61;
        Scanner scanner = new Scanner(System.in);
        double cubicMeters = Double.parseDouble(scanner.nextLine());
        double priceMetersWithoutDiscount = cubicMeters * pricePerCubicMeter;
        double discount = priceMetersWithoutDiscount * 0.18;
        double finalPrice = priceMetersWithoutDiscount - discount;
        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");

    }
}

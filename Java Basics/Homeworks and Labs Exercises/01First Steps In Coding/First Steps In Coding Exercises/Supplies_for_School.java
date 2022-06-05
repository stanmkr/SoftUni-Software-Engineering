package JAVA.PROGRAMMING_BASICS.First_Steps_In_Coding.EXCERCISES;

import java.util.Scanner;

public class Supplies_for_School {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double packagePen = 5.8;
        double packageMarker = 7.2;
        double cleanerPerLiter = 1.2;
        int countPen = Integer.parseInt(scanner.nextLine());
        int countPackageMarker = Integer.parseInt(scanner.nextLine());
        int liters = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        double totalPen = packagePen * countPen;
        double totalMarker = packageMarker * countPackageMarker;
        double totalCleaner = cleanerPerLiter * liters;
        double total = totalPen + totalMarker + totalCleaner;
        double totalWithDiscount = total - ((discount * 1.0 / 100) * total);
        System.out.println(totalWithDiscount);


    }
}

package JAVA.PROGRAMMING_BASICS.First_Steps_In_Coding.EXCERCISES;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        double safetyPlastic = 1.5;
        double paintingPerLiter = 14.5;
        double razreditel = 5;
        double bags = 0.4;
        Scanner scanner = new Scanner(System.in);
        double neededPlastic = Double.parseDouble(scanner.nextLine());
        double neededPaint = Double.parseDouble(scanner.nextLine());
        double neededRazreditel = Double.parseDouble(scanner.nextLine());
        double hoursNeeded = Double.parseDouble(scanner.nextLine());

        double sumPlastic = (neededPlastic + 2) * safetyPlastic;
        double sumPainting = (neededPaint + neededPaint * 0.10) * paintingPerLiter;
        double sumRazreditel = razreditel * neededRazreditel;
        double sumMaterials = sumPlastic + sumPainting + sumRazreditel + bags;
        double sumMaistori = (sumMaterials * 0.3) * hoursNeeded;
        double finalSum = sumMaistori + sumMaterials;
        System.out.println(finalSum);
    }
}

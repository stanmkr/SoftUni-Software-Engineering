package JAVA.PROGRAMMING_BASICS.Conditional_Statements.Excercises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        int meters = Integer.parseInt(scanner.nextLine());
        double secondsPerMeter= Double.parseDouble(scanner.nextLine());

        double time = meters * secondsPerMeter;
        double timePlus = (meters / 15) * 12.5;

        double totalTime = time + timePlus;

        if (totalTime < recordInSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - recordInSeconds);
        }


    }
}

package JAVA.PROGRAMMING_BASICS.Conditional_Statements.Excercises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gpu = 250;

        double budget = Double.parseDouble(scanner.nextLine());
        double gpuCount = Double.parseDouble(scanner.nextLine());
        double cpuCount = Double.parseDouble(scanner.nextLine());
        double ramCount = Double.parseDouble(scanner.nextLine());

        double gpuTotal = gpu * gpuCount;
        double cpu = gpuTotal * 0.35;
        double cpuTotal = cpu * cpuCount;
        double ram = gpuTotal * 0.1;
        double ramTotal = ram * ramCount;

        double totalSum = ramTotal + cpuTotal + gpuTotal;

        if (gpuCount > cpuCount) {
            totalSum *= 0.85;
        }
        if (budget >= totalSum) {
            System.out.printf("You have %.2f leva left!", budget - totalSum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!",totalSum - budget );
        }

    }
}

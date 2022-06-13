package JAVA.PROGRAMMING_BASICS.Conditional_Statements.Excercises;

import java.util.Scanner;

public class GodzillaVSKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  Декорът за филма е на стойност 10% от бюджета.
        // При повече от 150 статиста, има отстъпка за облеклото на стойност 10%.

        double budget = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.1;

        int numberStatists = Integer.parseInt(scanner.nextLine());
        double priceDressStatists = Double.parseDouble(scanner.nextLine());
        double totalDress = numberStatists * priceDressStatists;

        if (numberStatists > 150) {
            totalDress = totalDress - ( totalDress * 0.1);
        }

        double totalPriceFilm = decor + totalDress;

        if (budget >= totalPriceFilm  ) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - totalPriceFilm);
        }
            else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalPriceFilm - budget);
        }

    }
}

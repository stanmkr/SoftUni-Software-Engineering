package JAVA.PROGRAMMING_BASICS.Conditional_Statements.Excercises;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double puzzle = 2.6;
        double doll = 3;
        double teddyBear = 4.1;
        double minion = 8.2;
        double truck = 2;
        double discount;
        double rent = 0.1;
        double excursion = Double.parseDouble(scanner.nextLine());
        int countPuzzle = Integer.parseInt(scanner.nextLine());
        int countDoll = Integer.parseInt(scanner.nextLine());
        int countTeddyBear = Integer.parseInt(scanner.nextLine());
        int countMinion = Integer.parseInt(scanner.nextLine());
        int countTruck = Integer.parseInt(scanner.nextLine());
        int totalCount = countPuzzle + countDoll + countTeddyBear + countMinion + countTruck + countTruck;

        double totalPrice = countPuzzle * puzzle + countDoll * doll + countMinion * minion + countTruck * truck + countTeddyBear * teddyBear;

        if (totalCount >= 50) {
            discount = 0.25;
            totalPrice = totalPrice - (totalPrice * discount);
        }
        totalPrice = totalPrice - (totalPrice * rent);

        if (totalPrice >= excursion) {
            System.out.printf("Yes! %.2f lv left.", totalPrice - excursion);
        }
            else {
                System.out.printf("Not enough money! %.2f lv needed.", excursion - totalPrice);
            }
    }
}

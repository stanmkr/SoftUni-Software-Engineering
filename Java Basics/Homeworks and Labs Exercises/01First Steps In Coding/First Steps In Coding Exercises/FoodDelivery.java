package JAVA.PROGRAMMING_BASICS.First_Steps_In_Coding.EXCERCISES;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        double menuChicken = 10.35;
        double menuFish = 12.40;
        double menuVegetarian = 8.15;
        double delivery = 2.5;
        Scanner scanner = new Scanner(System.in);
        double countMenuChicken = Double.parseDouble(scanner.nextLine());
        double countMenuFish = Double.parseDouble(scanner.nextLine());
        double countMenuVegetarian = Double.parseDouble(scanner.nextLine());

        double sumMenuChicken = (countMenuChicken * menuChicken);
        double sumMenuFish = (countMenuFish * menuFish);
        double sumMenuVegetarian = (countMenuVegetarian * menuVegetarian);
        double sumMenus = (sumMenuChicken + sumMenuFish + sumMenuVegetarian);
        double desert = sumMenus * 0.20;
        double priceOrder = sumMenus + desert + delivery;
        System.out.println(priceOrder);

    }
}

package JAVA.PROGRAMMING_BASICS.Conditional_Statements_Advanced.Lab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        if (product.equals("coffee")) {
            if (city.equals("Sofia")) {
                System.out.println(quantity * 0.5);
            } else if (city.equals("Plovdiv")) {
                System.out.println(quantity*0.4);
            } else if (city.equals("Varna")){
                System.out.println(quantity*0.45);
            }
        } else if (product.equals("water")){
            if (city.equals("Sofia")) {
                System.out.println(quantity * 0.8);
            } else if (city.equals("Plovdiv")) {
                System.out.println(quantity*0.7);
            } else if (city.equals("Varna")){
                System.out.println(quantity*0.7);
            }
        } else if (product.equals("beer")){
            if (city.equals("Sofia")) {
                System.out.println(quantity * 1.2);
            } else if (city.equals("Plovdiv")) {
                System.out.println(quantity*1.15);
            } else if (city.equals("Varna")){
                System.out.println(quantity*1.1);
            }
        } else if (product.equals("sweets")){
            if (city.equals("Sofia")) {
                System.out.println(quantity * 1.45);
            } else if (city.equals("Plovdiv")) {
                System.out.println(quantity*1.3);
            } else if (city.equals("Varna")){
                System.out.println(quantity*1.35);
            }
        } else if (product.equals("peanuts")){
            if (city.equals("Sofia")) {
                System.out.println(quantity * 1.6);
            } else if (city.equals("Plovdiv")) {
                System.out.println(quantity*1.5);
            } else if (city.equals("Varna")){
                System.out.println(quantity*1.55);
            }
        }

    }
}
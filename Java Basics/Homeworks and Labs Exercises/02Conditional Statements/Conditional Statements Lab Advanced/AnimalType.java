package JAVA.PROGRAMMING_BASICS.Conditional_Statements_Advanced.Lab;

import java.util.Scanner;

public class AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        switch (type) {
            case "dog":
                System.out.println("mammal");
                break;
            case "snake":
            case "crocodile":
            case "tortoise":
            System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}

package JAVA.PROGRAMMING_BASICS.First_Steps_In_Coding.LAB;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        double dogCan = 2.5;
        double catCan = 4;
        Scanner scanner = new Scanner(System.in);
        int numberDogCan = Integer.parseInt(scanner.nextLine());
        int numberCatCan = Integer.parseInt(scanner.nextLine());
        double total_dog = numberDogCan * dogCan;
        double total_cat = numberCatCan * catCan;
        double total = total_cat + total_dog;
        System.out.println(total + " lv.");

    }
}

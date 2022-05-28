package JAVA.PROGRAMMING_BASICS.First_Steps_In_Coding.EXCERCISES;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double yearTax = Double.parseDouble(scanner.nextLine());
        double basketballSneakers = yearTax - (yearTax * 0.4);
        double basketballEquipment = basketballSneakers - (basketballSneakers * 0.2 );
        double basketballBall = basketballEquipment * 0.25;
        double basketballAccesories = basketballBall * 0.2;
        double totalSum = yearTax +basketballSneakers + basketballEquipment + basketballBall + basketballAccesories;
        System.out.printf("%.2f", totalSum);
    }
}

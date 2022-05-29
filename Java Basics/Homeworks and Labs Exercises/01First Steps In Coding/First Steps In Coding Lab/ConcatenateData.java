package JAVA.PROGRAMMING_BASICS.First_Steps_In_Coding.LAB;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String familyName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String city = (scanner.nextLine());
        System.out.println("You are " + name + " " + familyName + ", a " + age + "-years old person from " + city+".");

    }
}



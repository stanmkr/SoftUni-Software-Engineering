package JAVA.PROGRAMMING_BASICS.First_Steps_In_Coding.EXCERCISES;

import java.util.Scanner;

public class USD_TO_BGN {
    public static void main(String[] args) {
        double currentUSD = 1.79549;
        Scanner scanner = new Scanner(System.in);
        double BGN = Double.parseDouble(scanner.nextLine());
        double converter = currentUSD * BGN;
        System.out.println(converter);
    }
}

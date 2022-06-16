package JAVA.PROGRAMMING_BASICS.Conditional_Statements.Lab;

import java.util.Scanner;

public class GuessPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String goodPassword = "s3cr3t!P@ssw0rd";
        String password = scanner.nextLine();
        if (password.equals(goodPassword)){
            System.out.println("Welcome");
        }else {
            System.out.println("Wrong password!");
        }
    }
}

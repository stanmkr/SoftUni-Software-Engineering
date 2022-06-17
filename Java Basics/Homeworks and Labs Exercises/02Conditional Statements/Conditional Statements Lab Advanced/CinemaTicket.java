package JAVA.PROGRAMMING_BASICS.Conditional_Statements_Advanced.Lab;

import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayOfTheWeek = scanner.nextLine();

        if (dayOfTheWeek.equals("Monday") || dayOfTheWeek.equals("Tuesday") || dayOfTheWeek.equals("Friday")){
            System.out.println("12");
        } else if (dayOfTheWeek.equals("Wednesday") ||dayOfTheWeek.equals("Thursday")) {
            System.out.println("14");
        } else if (dayOfTheWeek.equals("Saturday") || dayOfTheWeek.equals("Sunday")){
            System.out.println("16");
        }
    }
}

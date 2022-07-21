package Data_Types_and_Variables_exercises;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Data_Types_and_Variables_exercises
 * Date: May / 2022
 */
public class spice_must_flow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = scanner.nextInt();
        int days = 0;
        int especiasTotales = 0;
        while (startingYield >= 100) {
            int especias = startingYield - 26; // dobiv
            especiasTotales += especias;
            days++;
            startingYield -= 10;
        }
        System.out.println(days);
        if (especiasTotales >= 26) {
            especiasTotales -= 26;
        }
        System.out.println(especiasTotales);
    }

}

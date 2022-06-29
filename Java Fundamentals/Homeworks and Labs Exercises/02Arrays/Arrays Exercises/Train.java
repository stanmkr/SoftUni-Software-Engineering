package Arrays_exercises;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Arrays.Arrays_exercises
 * Date: June / 2022
 */
public class train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma_persona = 0;
        int wagons = scanner.nextInt();
        int [] people = new int[wagons];
        for (int i = 0; i < people.length ; i++) {
            people[i] = scanner.nextInt();
            suma_persona+=people[i];
        }
        for (int i = 0; i < people.length ; i++) {
            System.out.print(people[i] + " ");
        }
        System.out.println();
        System.out.println(suma_persona);


    }
}

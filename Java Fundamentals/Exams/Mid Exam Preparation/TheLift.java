import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Arrays_exercises
 * Date: June / 2022
 */
public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int personas = Integer.parseInt(scanner.nextLine());

        int max = 4;
        int[] estadoLift = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        boolean lleno = false;
        int personasEnCola = 0;
        for (int i = 0; i < estadoLift.length; i++) {
            if (estadoLift[i] == max || estadoLift[i] > max) {
                continue;
            } else {
                while (estadoLift[i] < max) {
                    if (personas == 0) break;
                    estadoLift[i] += 1;
                    personas--;
                }
            }
        }

        for (int i = 0; i < estadoLift.length; i++) {
            if (estadoLift[i] == max || estadoLift[i] > max) {
                lleno = true;
            } else {
                lleno = false;
            }
        }

        if (lleno) {
            if (personas == 0) {
                for (int i : estadoLift) {
                    System.out.print(i + " ");
                }
            } else {
                System.out.printf("There isn't enough space! %d people in a queue!\n", personas);
                for (int i : estadoLift) {
                    System.out.print(i + " ");
                }

            }
        } else {
            System.out.println("The lift has empty spots!");
            for (int i : estadoLift) {
                System.out.print(i + " ");
            }
        }
    }
}

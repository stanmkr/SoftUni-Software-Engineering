package List_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - List_Exercise
 * Date: June / 2022
 */
public class HouseParty {
    public static void main(String[] args) {
        /*
        Write a program that keeps track of the guests that are going to a house party.

        On the first input line, you are going to receive how many commands you are going to have. On the next lines you are going to receive some of the following inputs:

        · "{name} is going!"

        · "{name} is not going!"

        If you receive the first type of input, you have to add the person if he/she is not on the list.
        (If he/she is in the list print on the console: "{name} is already in the list!").
        If you receive the second type of input, you have to remove the person if he/she is on the list.
        (If not print: "{name} is not in the list!"). At the end print all guests.
         */
        Scanner scanner = new Scanner(System.in);

        int numeroComandos = Integer.parseInt(scanner.nextLine());
        String comando;
        List<String> nombres = new ArrayList<>();

        for (int i = 0; i < numeroComandos; i++) {
            comando = scanner.nextLine();
            String[] partes = comando.split(" ");
            if (partes[2].equals("going!")) {
                if (nombres.contains((partes[0]))){
                    System.out.printf("%s is already in the list!%n",partes[0]);
                }else {
                    nombres.add(partes[0]);
                }

            } else if (partes[2].equals("not")) {
                if (!nombres.contains((partes[0]))){
                    System.out.printf("%s is not in the list!%n",partes[0]);
                }else {
                    nombres.remove(partes[0]);
                }
            }


        }

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

    }
}

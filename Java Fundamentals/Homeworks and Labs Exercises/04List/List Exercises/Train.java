package List_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - List_Exercise
 * Date: June / 2022
 */
public class Train {
    public static void main(String[] args) {
        /*
         * *********** EXERCISE DESCRIPTION *************
         *
         * On the first line, you will be given a list of wagons (integers). Each integer represents the number of passengers that are currently in each wagon. On the next line, you will get the max capacity of each wagon (single integer). Until you receive "end" you will be given two types of input:
         *
         * · Add {passengers} - add a wagon to the end with the given number of passengers
         *
         * · {passengers} - find an existing wagon to fit all the passengers (starting from the first wagon)
         *
         * At the end print the final state of the train (all the wagons separated by a space)
         */
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int capacidadMaxima = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] comandos = command.split(" ");
            if (comandos[0].equals("Add")) {
                wagons.add(Integer.parseInt(comandos[1]));
            } else {
                int pasajerosParaAñadir = Integer.parseInt(comandos[0]);

                for (int i = 0; i < wagons.size(); i++) {
                    int currentWagon = wagons.get(i);
                    if (currentWagon + pasajerosParaAñadir <= capacidadMaxima) {
                        wagons.set(i, currentWagon + pasajerosParaAñadir);
                        break;
                    }
                }
            }
            command = scanner.nextLine();

        }

        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");
        }


    }
}

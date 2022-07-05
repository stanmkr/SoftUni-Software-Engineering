package List_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - List_Lab
 * Date: June / 2022
 */
public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] parametros = command.split(" ");
            switch (parametros[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(parametros[1]));
                    break;
                case "Remove":
                    int item = Integer.parseInt(parametros[1]);
                    numbers.remove(Integer.valueOf(item));
                    break;
                case "RemoveAt":
                    numbers.remove(Integer.parseInt(parametros[1]));
                    break;
                case "Insert":
                    item = Integer.parseInt(parametros[1]);
                    int index = Integer.parseInt(parametros[2]);
                    numbers.add(index,item);
                    break;

            }
            command = scanner.nextLine();
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }


    }


}

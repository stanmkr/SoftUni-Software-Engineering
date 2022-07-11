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
public class ChangeList {
    public static void main(String[] args) {
        /*
        ****** EXERCISE DESCRIPTION ******
        * Write a program, which reads a list of integers from the console and receives commands,
        *  which manipulate the list. Your program may receive the following commands:
        · Delete {element} - delete all elements in the array, which are equal to the given element
        · Insert {element} {position} - insert element at the given position
         */
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String comando = scanner.nextLine();
        while (!comando.equals("end")) {
            String[] partes = comando.split(" ");
            switch (partes[0]) {
                case "Delete":
                    numbers.removeAll(Arrays.asList(Integer.parseInt(partes[1])));
                    break;
                case "Insert":
                    numbers.add(Integer.parseInt(partes[2]), Integer.parseInt(partes[1]));
                    break;
            }
            comando = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}

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
public class PokemonDontGO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> distance = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sumRemoved = 0;

        while (distance.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index < 0) {
                int firstElement = distance.get(0); // first index value
                sumRemoved += firstElement;
                int lastElement = distance.get(distance.size() - 1);
                distance.set(0, lastElement); //
                modifyList(distance, firstElement);

            } else if (index > distance.size() - 1) {
                int firstElement = distance.get(0);
                int lastElement = distance.get(distance.size() - 1); // las index value
                sumRemoved += lastElement;
                distance.set(distance.size() - 1, firstElement);
                modifyList(distance, lastElement);

            } else if (index >= 0 && index <= distance.size() - 1) {
                int removedElement = distance.get(index);
                sumRemoved += removedElement;
                distance.remove(index);
                modifyList(distance, removedElement);

            }


        }
        System.out.println(sumRemoved);

    }

    private static void modifyList(List<Integer> list, int removedElement) {
        for (int index = 0; index <= list.size() - 1; index++) {
            int valueActualElement = list.get(index);
            if (valueActualElement <= removedElement) {
                valueActualElement += removedElement;
            } else {
                valueActualElement -= removedElement;
            }
            list.set(index, valueActualElement);
        }
    }
}

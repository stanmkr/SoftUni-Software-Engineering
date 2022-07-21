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
public class ListOperations {
    public static void main(String[] args) {
        /*
        You will be given numbers (list of integers) on the first input line. Until you receive "End"
         you will be given operations you have to apply on the list. The possible commands are:

        · Add {number} - add number at the end

        · Insert {number} {index} - insert number at given index

        · Remove {index} - remove that index

        · Shift left {count} - first number becomes last 'count' times

        · Shift right {count} - last number becomes first 'count' times

        Note: The index given may be outside of the bounds of the array. In that case print "Invalid index".
         */
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int index, number;
        String operaciones = scanner.nextLine();
        while (!operaciones.equals("End")) {
            String[] partes = operaciones.split(" ");
            switch (partes[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(partes[1]));
                    break;
                case "Remove":
                    index = Integer.parseInt(partes[1]);
                    if (isValidIndex(numbers.size(), index)) {
                        numbers.remove(index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Insert":
                    index = Integer.parseInt(partes[2]);
                    number = Integer.parseInt(partes[1]);
                    if (isValidIndex(numbers.size(), index)) {
                        numbers.add(index, number);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    if (partes[1].equals("right")) {
                        int countRight = Integer.parseInt(partes[2]);
                        for (int i = 1; i <= countRight; i++) {
                            // last number becomes first
                            int lastNumber =  numbers.get(numbers.size()-1);
                            numbers.add(0,lastNumber);
                            numbers.remove(numbers.size()-1);
                        }
                    } else if (partes[1].equals("left")) {
                        int countLeft = Integer.parseInt(partes[2]);
                        for (int i = 1; i <= countLeft; i++) {
                            // first number becomes last
                            int firstNumber =  numbers.get(0);
                            numbers.add(firstNumber);
                            numbers.remove(0);
                        }
                    }
                    break;
            }
            operaciones = scanner.nextLine();
        }

        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
    }

    private static boolean isValidIndex(int listSize, int index) {
        return index <= listSize - 1 && index >= 0;
    }

}

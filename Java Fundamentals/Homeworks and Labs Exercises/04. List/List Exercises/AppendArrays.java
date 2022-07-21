package List_Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - List_Exercise
 * Date: June / 2022
 */
public class AppendArrays {
    public static void main(String[] args) {
        /*
        Write a program to append several arrays of numbers.
        · Arrays are separated by "|".
        · Values are separated by spaces (" ", one or several).
        · Order the arrays from the last to the first, and their values from left to right.
         */
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> listSeparatedByPipe = Arrays.stream(input.split("\\|")).collect(Collectors.toList());
        //"1 2 3 |4 5 6 |  7  8" -> split -> ["1 2 3 ", "4 5 6 ", "  7  8"] -> {"1 2 3 ", "4 5 6 ", "  7  8"}

        Collections.reverse(listSeparatedByPipe);
        System.out.println(listSeparatedByPipe.toString()
                .replace("[", "") //"  7  8, 4 5 6 , 1 2 3 ]"
                .replace("]", "") //"  7  8, 4 5 6 , 1 2 3 "
                .trim() //  "7  8, 4 5 6 , 1 2 3"
                .replaceAll(",", "")
                .replaceAll("\\s+", " ")
        );

    }
}

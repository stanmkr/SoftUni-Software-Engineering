package List_Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - List_Lab
 * Date: June / 2022
 */
public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        int item;
        String parameter;
        while (!command.equals("end")) {
            String[] parametros = command.split(" ");
            switch (parametros[0]) {
                case "Contains":
                    item = Integer.parseInt(parametros[1]);
                    if (numbers.contains(item)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    parameter = parametros[1];

                    if (parameter.equals("even")) {
                        List<Integer> list = numPares(numbers);
                        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
                    } else if (parameter.equals("odd")) {
                        List<Integer> list = numImpares(numbers);
                        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
                    }
                    break;
                case "Get":
                    parameter = parametros[1];
                    if (parameter.equals("sum")) {
                        int sum = 0;
                        for (int i = 0; i < numbers.size(); i++) {
                            sum += numbers.get(i);
                        }
                        System.out.println(sum);
                    }
                    break;
                case "Filter":
                    parameter = parametros[1];
                    item = Integer.parseInt(parametros[2]);
                    List<Integer> lista = filterCondition(numbers, parameter, item);
                    System.out.println(lista.toString().replaceAll("[\\[\\],]", ""));
                    break;


            }
            command = scanner.nextLine();
        }


    }

    private static List<Integer> filterCondition(List<Integer> numbers, String condition, int number) {
        List<Integer> listResultado = new ArrayList<>();
        switch (condition) {
            case "<":
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) < number) {
                        listResultado.add(numbers.get(i));
                    }
                }
                break;
            case ">":
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) > number) {
                        listResultado.add(numbers.get(i));
                    }
                }
                break;
            case ">=":
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) >= number) {
                        listResultado.add(numbers.get(i));
                    }
                }
                break;
            case "<=":
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) <= number) {
                        listResultado.add(numbers.get(i));
                    }
                }
                break;
        }
        return listResultado;
    }

    private static List<Integer> numPares(List<Integer> numbers) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                list.add(numbers.get(i));
            }
        }
        return list;
    }

    private static List<Integer> numImpares(List<Integer> numbers) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                list.add(numbers.get(i));
            }
        }
        return list;
    }

}

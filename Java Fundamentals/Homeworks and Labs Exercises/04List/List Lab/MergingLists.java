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
public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> numbers2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> resultado = new ArrayList<>();

        int min = Math.min(numbers1.size(), numbers2.size());

        for (int i = 0; i < min; i++) {
            int primerNumero = numbers1.get(i);
            int segundoNumero = numbers2.get(i);
            resultado.add(primerNumero);
            resultado.add(segundoNumero);

        }

        if (numbers1.size()>numbers2.size()){
            resultado.addAll(numbers1.subList(numbers2.size(),numbers1.size()));
        } else  {
            resultado.addAll(numbers2.subList(numbers1.size(),numbers2.size()));

        }

        for (Integer numero : resultado) {
            System.out.print(numero+" ");
        }
    }
}

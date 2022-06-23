import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - PACKAGE_NAME
 * Date: June / 2022
 */
public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("End")) {
            String command = inputLine.split(" ")[0];
            int index = Integer.parseInt(inputLine.split(" ")[1]);
            int value = Integer.parseInt(inputLine.split(" ")[2]);

            switch (command) {
                case "Shoot":
                    if (isValidIndex(targets, index)) {
                        int target = targets.get(index);
                        target = target - value;
                        if (target > 0) {
                            targets.set(index, target);
                        } else {
                            targets.remove(index);
                        }
                    }
                    break;
                case "Add":
                    if (isValidIndex(targets, index)) {
                        targets.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    if (index >= 0 && index <= targets.size() - 1 && index - value >= 0 && index + value <= targets.size() - 1) {
                        int radius = value * 2 + 1;
                        for (int i = 0; i < radius; i++) {
                            targets.remove(index-value);
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }

            inputLine = scanner.nextLine();
        }

        List<String> resultado = new ArrayList<>();
        for (Integer target : targets) {
            resultado.add(String.valueOf(target));
        }
        System.out.println(String.join("|",resultado));


    }

    private static boolean isValidIndex(List<Integer> list, int index) {
        return index >= 0 && index <= list.size() - 1;

    }
}

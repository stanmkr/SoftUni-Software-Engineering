import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - PACKAGE_NAME
 * Date: June / 2022
 */
public class DeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> cartas = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        int numeroComandos = Integer.parseInt(scanner.nextLine());

        String inputLine;
        for (int i = 1; i <= numeroComandos; i++) {
            inputLine = scanner.nextLine();
            String[] inputLineSeparado = inputLine.split(", ");
            String comando = inputLineSeparado[0];
            switch (comando) {
                case "Add":
                    String carta = inputLineSeparado[1];
                    if (cartas.contains(carta)) {
                        System.out.println("Card is already in the deck");
                    } else {
                        cartas.add(carta);
                        System.out.println("Card successfully added");
                    }
                    break;
                case "Remove":
                    carta = inputLineSeparado[1];
                    if (!cartas.contains(carta)) {
                        System.out.println("Card not found");
                    } else {
                        cartas.remove(carta);
                        System.out.println("Card successfully removed");
                    }
                    break;
                case "Remove At":
                    int index = Integer.parseInt(inputLineSeparado[1]);
                    if (isValidIndex(cartas, index)) {
                        cartas.remove(index);
                        System.out.println("Card successfully removed");
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
                case "Insert":
                    index = Integer.parseInt(inputLineSeparado[1]);
                    carta = inputLineSeparado[2];
                    if (!isValidIndex(cartas, index)) {
                        System.out.println("Index out of range");
                    } else {
                        if (cartas.contains(carta)) {
                            System.out.println("Card is already added");
                        } else {
                            cartas.add(index, carta);
                            System.out.println("Card successfully added");
                        }
                    }

                    break;

            }
        }
        System.out.println(String.join(", ",cartas));

    }

    private static boolean isValidIndex(List<String> list, int index) {
        return index >= 0 && index <= list.size() - 1;
    }
}

package Objects_and_Classes_LAB;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Objects_and_Classes_LAB
 * Date: July / 2022
 */
public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());


        while (!words.isEmpty()) {
          //  int random = ThreadLocalRandom.current().nextInt(words.size());
          //  Random numeroAleatorio = new Random();
          //  int random = numeroAleatorio.nextInt(words.size());
            int random = new Random().nextInt(words.size());
            String palabra = words.get(random);
            System.out.println(palabra);
            words.remove(random);
        }


    }
}

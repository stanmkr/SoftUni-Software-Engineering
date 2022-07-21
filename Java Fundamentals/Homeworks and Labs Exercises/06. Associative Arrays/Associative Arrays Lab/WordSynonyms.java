package Associative_Arrays_Lab;

import java.util.*;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Associative_Arrays_Lab
 * Date: July / 2022
 *
 * Write a program that keeps a map with synonyms. The key of the map will be the word.
 * The value will be a list of all the synonyms of that word. You will be given a number n.
 * On the next 2 * n lines you will be given a word and a synonym each on a separate line
 */
public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listaSinonimos = new ArrayList<>();
        Map<String, List<String>> palabras = new LinkedHashMap<>();

        int lineas =  Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lineas; i++) {
            String palabra = scanner.nextLine();
            String sinonimo = scanner.nextLine();
            if (!palabras.containsKey(palabra)) {
                palabras.put(palabra, new ArrayList<>());
                palabras.get(palabra).add(sinonimo);
            }else {
                palabras.get(palabra).add(sinonimo);
            }

        }



        for (Map.Entry<String, List<String>> entry : palabras.entrySet()) {
            System.out.printf("%s - %s%n",entry.getKey(),String.join(", ",entry.getValue()));
        }


    }
}

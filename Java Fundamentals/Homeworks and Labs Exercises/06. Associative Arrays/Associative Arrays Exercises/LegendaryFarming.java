package Associative_Arrays_Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Associative_Arrays_Exercises
 * Date: July / 2022
 */
public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> items = new LinkedHashMap<>();
        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);
        Map<String, Integer> itemsJunk = new LinkedHashMap<>();

        boolean win = false;
        while (!win) {
            String[] input = scanner.nextLine().split(" ");
            for (int i = 0; i < input.length - 1; i = i + 2) {
                int cantidad = Integer.parseInt(input[i]);
                String material = input[i + 1].toLowerCase();
                if (items.containsKey(material)) {
                    items.put(material, items.get(material) + cantidad);
                } else {
                    if (!itemsJunk.containsKey(material)) {

                        itemsJunk.put(material, cantidad);
                    } else {
                        itemsJunk.put(material, itemsJunk.get(material) + cantidad);
                    }
                }

                if (items.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    items.put("shards", items.get("shards") - 250);
                    win = true;
                    break;
                } else if (items.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    items.put("fragments", items.get("fragments") - 250);
                    win = true;
                    break;
                } else if (items.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    items.put("motes", items.get("motes") - 250);
                    win = true;
                    break;
                }
            }

        }
        items.entrySet().forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));
        itemsJunk.entrySet().forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));
    }
}

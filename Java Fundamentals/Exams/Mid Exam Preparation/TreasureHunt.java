import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - PACKAGE_NAME
 * Date: June / 2022
 */
public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> loot = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        String comandos = scanner.nextLine();
        while (!comandos.equals("Yohoho!")) {

            String action = comandos.split(" ")[0];

            switch (action) {
                case "Loot":
                    List<String> items = new ArrayList<>(List.of(comandos.split(" ")));
                    items.remove(0);
                    for (String item : items) {
                        if (!loot.contains(item)) {
                            loot.add(0, item);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(comandos.split(" ")[1]);
                    boolean validIndex = index >= 0 && index <= loot.size() - 1;
                    if (validIndex) {
                        String removedLoot = loot.get(index);
                        loot.remove(index);
                        loot.add(removedLoot);
                    }
                    break;
                case "Steal":
                    int quantityLast = Integer.parseInt(comandos.split(" ")[1]);
                    validIndex = quantityLast > 0 ;
                    if (validIndex) {
                        if (quantityLast>loot.size()){
                            quantityLast = loot.size();
                        }
                        List<String> removed = new ArrayList<>();
                        for (int i = 0; i < quantityLast; i++) {
                           removed.add(loot.remove(loot.size() -  1));
                        }
                        Collections.reverse(removed);
                        System.out.println(String.join(", ", removed));
                        //loot.subList(loot.size()-quantityLast,loot.size()).clear();
                    }
                    break;
//
            }



            comandos = scanner.nextLine();
        }
        if (loot.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            double longitudItems = 0;
            for (String item : loot) {
                longitudItems += item.length();
            }
            System.out.printf("Average treasure gain: %.2f pirate credits.", longitudItems / loot.size());
        }
    }
}

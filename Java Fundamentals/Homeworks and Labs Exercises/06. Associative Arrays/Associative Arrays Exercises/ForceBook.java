package Associative_Arrays_Exercises;

import java.util.*;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Associative_Arrays_Exercises
 * Date: July / 2022
 */
public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        // otbor -> spisuk s igrachi
        Map<String, List<String>> map = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {
            if (input.contains("|")) {
                // {force_side} | {force_user}"
                String team = input.split(" \\| ")[0];
                String player = input.split(" \\| ")[1];
                if (!map.containsKey(team)) {
                    map.put(team, new ArrayList<>());
                    map.get(team).add(player);
                } else {
                    // ima takuv otbor -> dobaviame kum otbora igracha ako go nqma
                    List<String> currentPlayers = map.get(team); // tekush spisak s igrachi
                    if (!currentPlayers.contains(player)) {
                        currentPlayers.add(player);
                    }
                    map.put(team, currentPlayers);
                }
            } else if (input.contains("->")) {
                // "{force_user} -> {force_side}"
                String player = input.split(" -> ")[0];
                String team = input.split(" -> ")[1];

                // ako igrach go ima v nqkoi ot otborite -> remove
                map.entrySet().forEach(entry -> entry.getValue().remove(player));

                // dali sashtestvuva tozi otbor
                if (map.containsKey(team)) {
                    List<String> currentPlayers = map.get(team);
                    currentPlayers.add(player);
                    map.put(team, currentPlayers);
                } else {
                    // niama takuv otbor
                    map.put(team, new ArrayList<>());
                    map.get(team).add(player);
                }
                System.out.printf("%s joins the %s side!%n", player, team);
            }
            input = scanner.nextLine();
        }

        map.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().forEach(player -> System.out.println("! " + player));
                });
        ;

    }
}

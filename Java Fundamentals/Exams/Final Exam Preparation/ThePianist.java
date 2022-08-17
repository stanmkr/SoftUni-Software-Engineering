import java.util.*;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - PACKAGE_NAME
 * Date: July / 2022
 */
public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroPiezas = Integer.parseInt(scanner.nextLine());

        String conjuntoPiezas = "";
        String pieza = "";
        String composer = "";
        String clave = "";

        Map<String, List<String>> piezasMap = new LinkedHashMap<>();

        for (int i = 1; i <= numeroPiezas; i++) {
            conjuntoPiezas = scanner.nextLine();
            pieza = conjuntoPiezas.split("\\|")[0];
            composer = conjuntoPiezas.split("\\|")[1];
            clave = conjuntoPiezas.split("\\|")[2];
            List<String> piezasInformacion = new ArrayList<>();
            piezasInformacion.add(composer); // [0]
            piezasInformacion.add(clave); // [1]

            piezasMap.put(pieza, piezasInformacion);
        }

        String comandos = scanner.nextLine();
        while (!comandos.equals("Stop")) {
            if (comandos.contains("Add")) {
                pieza = comandos.split("\\|")[1];
                composer = comandos.split("\\|")[2];
                clave = comandos.split("\\|")[3];
                if (piezasMap.containsKey(pieza)) {
                    System.out.println(pieza + " is already in the collection!");
                } else {
                    List<String> piezasInformacion = new ArrayList<>();
                    piezasInformacion.add(composer);
                    piezasInformacion.add(clave);
                    piezasMap.put(pieza, piezasInformacion);
                    System.out.printf("%s by %s in %s added to the collection!%n", pieza, composer, clave);
                }

            } else if (comandos.contains("Remove")) {
                pieza = comandos.split("\\|")[1];
                if (piezasMap.containsKey(pieza)) {
                    piezasMap.remove(pieza);
                    System.out.println("Successfully removed " + pieza + "!");
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieza);
                }

            } else if (comandos.contains("ChangeKey")) {
                pieza = comandos.split("\\|")[1];
                String claveNueva = comandos.split("\\|")[2];
                if (piezasMap.containsKey(pieza)) {
                    piezasMap.get(pieza).set(1, claveNueva);
                    System.out.printf("Changed the key of %s to %s!%n", pieza, claveNueva);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieza);
                }
            }
            comandos = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> element : piezasMap.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n", element.getKey(), element.getValue().get(0), element.getValue().get(1));
        }


        /*piezasMap.entrySet()
                .forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
*/

    }
}

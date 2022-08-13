import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - PACKAGE_NAME
 * Date: July / 2022
 */
public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();
        StringBuilder activationKeyBuilder = new StringBuilder(activationKey);
        String comando = scanner.nextLine();
        while (!comando.equals("Generate")) {
            if (comando.contains("Contains")) {
                String substring = comando.split(">>>")[1];
                if (activationKeyBuilder.toString().contains(substring)) {
                    System.out.println(activationKeyBuilder + " contains " + substring);
                } else {
                    System.out.println("Substring not found!");
                }
            } else if (comando.contains("Flip")) {
                String transformacion = comando.split(">>>")[1];
                int startIndex = Integer.parseInt(comando.split(">>>")[2]);
                int endIndex = Integer.parseInt(comando.split(">>>")[3]);
                if (transformacion.equals("Upper")) {
                    String fragmento = activationKeyBuilder.substring(startIndex, endIndex);
                    if (isValidIndex(startIndex, activationKeyBuilder) && isValidIndex(endIndex, activationKeyBuilder)) {
                        activationKeyBuilder.replace(startIndex, endIndex, fragmento.toUpperCase());
                        System.out.println(activationKeyBuilder);
                    }
                } else if (transformacion.equals("Lower")) {
                    String fragmento = activationKeyBuilder.substring(startIndex, endIndex);
                    if (isValidIndex(startIndex, activationKeyBuilder) && isValidIndex(endIndex, activationKeyBuilder)) {
                        activationKeyBuilder.replace(startIndex, endIndex, fragmento.toLowerCase());
                        System.out.println(activationKeyBuilder);
                    }
                }
            } else if (comando.contains("Slice")) {
                int startIndex = Integer.parseInt(comando.split(">>>")[1]);
                int endIndex = Integer.parseInt(comando.split(">>>")[2]);
                if (isValidIndex(startIndex, activationKeyBuilder) && isValidIndex(endIndex, activationKeyBuilder)) {
                    activationKeyBuilder.delete(startIndex, endIndex);
                    System.out.println(activationKeyBuilder);
                }
            }
            comando = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + activationKeyBuilder);

    }

    static boolean isValidIndex(int index, StringBuilder input) {
        return index >= 0 && index <= input.length() - 1;
    }
}

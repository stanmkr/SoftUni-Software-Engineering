import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - PACKAGE_NAME
 * Date: August / 2022
 */
public class DecryptingCommands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());

        String comandos = scanner.nextLine();

        while (!comandos.equals("Finish")) {
            String comando = comandos.split(" ")[0];
            switch (comando) {
                case "Replace":
                    String charActual = comandos.split(" ")[1];
                    String charNuevo = comandos.split(" ")[2];
                    input = new StringBuilder(input.toString().replace(charActual, charNuevo));
                    System.out.println(input);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(comandos.split(" ")[1]);
                    int endIndex = Integer.parseInt(comandos.split(" ")[2]);
                    if (isValidIndex(input, startIndex) && isValidIndex(input, endIndex)) {
                        input.replace(startIndex, endIndex+1, "");
                        System.out.println(input);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
                case "Make":
                    String opcion = comandos.split(" ")[1];
                    if (opcion.equals("Upper")) {
                        input = new StringBuilder(input.toString().toUpperCase());
                    } else if (opcion.equals("Lower")) {
                        input = new StringBuilder(input.toString().toLowerCase());
                    }
                    System.out.println(input);
                    break;
                case "Check":
                    String string = comandos.split(" ")[1];
                    if (input.toString().contains(string)) {
                        System.out.println("Message contains " + string);
                    } else {
                        System.out.println("Message doesn't contain " + string);
                    }

                    break;
                case "Sum":
                    startIndex = Integer.parseInt(comandos.split(" ")[1]);
                    endIndex = Integer.parseInt(comandos.split(" ")[2]);
                    if (isValidIndex(input, startIndex) && isValidIndex(input, endIndex)) {
                        String substring = input.substring(startIndex, endIndex+1);
                        int sum = 0;
                        for (int i = 0; i <substring.length() ; i++) {
                            sum+= substring.charAt(i);
                        }
                        System.out.println(sum);

                    } else {
                        System.out.println("Invalid indices!");
                    }

                    break;
            }


            comandos = scanner.nextLine();
        }

    }

    public static boolean isValidIndex(StringBuilder string, int index) {
        return index >= 0 && index <= string.length() - 1;
    }
}

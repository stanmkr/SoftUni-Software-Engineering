package TextProcessing_Exercises;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - TextProcessing_Exercises
 * Date: July / 2022
 */
public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] usuarios = scanner.nextLine().split(", ");
        for (String usuario : usuarios) {
            if (isValidUser(usuario)) {
                System.out.println(usuario);
            }
        }

    }

    static boolean isValidUser(String usuario) {
        if (usuario.length() < 3 || usuario.length() > 16) {
            return false;
        }

        for (char simbolo : usuario.toCharArray()) {
            if (!Character.isLetterOrDigit(simbolo) && simbolo != '-' && simbolo != '_'){
                return false;
            }
        }
        return true;
    }


}

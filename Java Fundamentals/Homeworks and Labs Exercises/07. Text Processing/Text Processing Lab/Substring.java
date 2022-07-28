package TextProcessing_Lab;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - TextProcessing_Lab
 * Date: July / 2022
 */
public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String clave = scanner.nextLine();
        String palabra = scanner.nextLine();

        while (palabra.contains(clave)) {
            palabra = palabra.replace(clave, "");
        }
        System.out.println(palabra);


        // VARIANT 2
//        int index  = palabra.indexOf(clave);
//        while (index!=-1){
//            palabra = palabra.replace(clave, "");
//            index = palabra.indexOf(clave);
//        }
//        System.out.println(palabra);
    }
}

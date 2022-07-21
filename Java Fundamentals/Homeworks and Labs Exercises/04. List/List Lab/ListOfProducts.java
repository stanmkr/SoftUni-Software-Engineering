package List_Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - List_Lab
 * Date: June / 2022
 */
public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> products = new ArrayList<>();
        int cantidad = Integer.parseInt(scanner.nextLine());
        String product;
        for (int i = 1; i <= cantidad; i++) {
            product = scanner.nextLine();
            products.add(product);
        }
        Collections.sort(products);

        for (int i = 0; i < cantidad; i++) {
            System.out.println(i+1 + "." + products.get(i));
        }


    }
}

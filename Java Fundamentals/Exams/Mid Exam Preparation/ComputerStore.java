import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - PACKAGE_NAME
 * Date: June / 2022
 */
public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input ;
        double number;
        double ammount;
        double total = 0;
        double totalWithTax = 0;
        double taxes;

        do {
            input = scanner.next();
            if (!input.equals("special") && !input.equals("regular")){
                number = Double.parseDouble(input);
                if (number < 0) {
                    System.out.println("Invalid price!");
                } else {
                    total += number;
                }
            }
            //ammount = Integer.parseInt(scanner.nextLine());


        } while (!input.equals("special") && !input.equals("regular"));

        totalWithTax += total;
        totalWithTax = totalWithTax * 1.2;
        taxes = totalWithTax - total;

        if (totalWithTax != 0) {
            if (input.equals("special")) {
                totalWithTax = totalWithTax * 0.9;
            }
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", total);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalWithTax);
        } else {
            System.out.println("Invalid order!");
        }


    }
}

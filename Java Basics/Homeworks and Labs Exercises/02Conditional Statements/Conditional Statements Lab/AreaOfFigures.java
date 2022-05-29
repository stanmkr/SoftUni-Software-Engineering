package JAVA.PROGRAMMING_BASICS.Conditional_Statements.Lab;

import com.sun.source.tree.DoWhileLoopTree;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type;
        do {
            type = scanner.nextLine();
        }while (type.equals("square") || type.equals("rectangle") || type.equals("circle") || type.equals("triangle")  );

        if (type.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            double areaSquare = side * side;
            System.out.printf("%.2f",areaSquare);
        }  else if (type.equals("rectangle")) {
            double side = Double.parseDouble(scanner.nextLine());
            double side2 = Double.parseDouble(scanner.nextLine());
            double areaRectangle = side * side2;
            System.out.printf("%.3f",areaRectangle);
        } else if (type.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            double areaCircle = Math.pow(radius,2) * Math.PI;
            System.out.printf("%.3f",areaCircle);
        } else if (type.equals("triangle")) {
            double sideLong = Double.parseDouble(scanner.nextLine());
            double sideHeight = Double.parseDouble(scanner.nextLine());
            double areaTriangle =sideLong * sideHeight / 2;
            System.out.printf("%.3f", areaTriangle);
        }


    }
}

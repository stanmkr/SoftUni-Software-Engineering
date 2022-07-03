package Methods_Exercises;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Methods_Exercises
 * Date: June / 2022
 */
public class NxN_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        printMatrix(num);

    }

    private static void printMatrix (int num){
        for (int i = 0; i <num ; i++) {
            for (int j = 0; j <num ; j++) {
                System.out.print(num+" ");
            }
            System.out.println();
        }

    }

}

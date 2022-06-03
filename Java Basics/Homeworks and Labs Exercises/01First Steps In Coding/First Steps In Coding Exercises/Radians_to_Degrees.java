package JAVA.PROGRAMMING_BASICS.First_Steps_In_Coding.EXCERCISES;

import java.util.Scanner;

public class Radians_to_Degrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radian = Double.parseDouble(sc.nextLine());
        double converter = radian * 180 / Math.PI;
        System.out.println(converter);

    }
}

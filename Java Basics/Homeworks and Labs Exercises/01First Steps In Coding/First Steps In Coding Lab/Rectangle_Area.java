package JAVA.PROGRAMMING_BASICS.First_Steps_In_Coding.LAB;

import java.util.Scanner;

public class Rectangle_Area {
    public static void main(String[] args) {
        Scanner myareascanner = new Scanner(System.in);
        int sideA = Integer.parseInt(myareascanner.nextLine());
        int sideB = Integer.parseInt(myareascanner.nextLine());
        int area =  sideA * sideB;
        System.out.println(area);
    }
}
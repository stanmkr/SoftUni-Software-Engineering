package JAVA.PROGRAMMING_BASICS.First_Steps_In_Coding.LAB;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        int TimePerProject = 3;
        Scanner scanner = new Scanner(System.in);
        String NameOfArchitect = scanner.nextLine();
        int NumberOfProjects = Integer.parseInt(scanner.nextLine());
        int NeededHours = TimePerProject * NumberOfProjects;
        System.out.println("The architect " + NameOfArchitect + " will need " + NeededHours + " hours to complete "+ NumberOfProjects + " project/s."  );
    }
}

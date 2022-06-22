import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - PACKAGE_NAME
 * Date: June / 2022
 */
public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int employee1Efficiency = scanner.nextInt();
        int employee2Efficiency = scanner.nextInt();
        int employee3Efficiency = scanner.nextInt();
        int studentsCount = scanner.nextInt();
        int horasNecesarias = 0;
        int hourEfficiency = employee1Efficiency + employee2Efficiency + employee3Efficiency;
        while (studentsCount > 0) {
            studentsCount -= hourEfficiency;
            horasNecesarias++;
            if (horasNecesarias%4 == 0){
                horasNecesarias++;
            }
        }

        System.out.println("Time needed: "+horasNecesarias+"h.");

    }
}

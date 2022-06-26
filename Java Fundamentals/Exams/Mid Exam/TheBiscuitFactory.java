import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - PACKAGE_NAME
 * Date: June / 2022
 */
public class TheBiscuitFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int galletasDiariasPorTrabajador = scanner.nextInt();
        int cantidadTrabajadores = scanner.nextInt();
        int galletasFabricaCompetencia = scanner.nextInt();
        int cantidadGalletasProducidas = 0;
        int produccionDiaria = cantidadTrabajadores * galletasDiariasPorTrabajador;

        for (int dia = 1; dia <=30; dia++) {
            if (dia % 3 == 0) {
                cantidadGalletasProducidas += produccionDiaria * 0.75;
            }else {
                cantidadGalletasProducidas += produccionDiaria;
            }
        }

        double porcentaje = Math.abs(((cantidadGalletasProducidas * 100.0) / galletasFabricaCompetencia) - 100);
        System.out.printf("You have produced %d biscuits for the past month.%n", cantidadGalletasProducidas);

        if (cantidadGalletasProducidas > galletasFabricaCompetencia) {
            System.out.printf("You produce %.2f percent more biscuits.", porcentaje);
        } else if (cantidadGalletasProducidas < galletasFabricaCompetencia){
            System.out.printf("You produce %.2f percent less biscuits.", porcentaje);
        }


    }
}

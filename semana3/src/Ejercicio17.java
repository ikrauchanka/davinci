import java.util.Scanner;

public class Ejercicio17 {


    public static void main(String[] args) {

    // 17 Escribe un programa que calcule el costo de un viaje en auto, dados los kilómetros recorridos,
    //el costo por litro de combustible y el rendimiento del auto en kilómetros por litro.
    //Pide al usuario que ingrese estos datos.

        double kilometros, costoPorLitro,rendimiento, litrosNecesarios, total ;

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese kilometros recorridos: ");
        costoPorLitro = lector.nextDouble();

        System.out.println("Ingrese el costo por litro de combustible: ");
        kilometros = lector.nextDouble();

        System.out.println("Ingrese el rendimiento del auto en kilometros por litro: ");
        rendimiento = lector.nextDouble();

        litrosNecesarios = kilometros / rendimiento;
        total = litrosNecesarios * costoPorLitro;

        System.out.println("Total del viaje es: $" + total);


    }
}

import java.util.Scanner;

public class Ejercicio13 {


    public static void main(String[] args) {

        //13 Escribe un programa que calcule el área y el perímetro de un círculo utilizando las fórmulas:
        //	área = ? * radio^2 y perímetro = 2 * ? * radio. Pide al usuario que ingrese el radio del círculo.

        double radio;

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el radio del círculo: ");
        while (!lector.hasNextDouble()) {
            System.out.println("Invalid input...");
            lector.next();
        }
        radio = lector.nextDouble();

        System.out.println("El área es: " + (Math.PI * radio * radio));
        System.out.println("El perímetro es: " + (2 * Math.PI * radio));

    }
}

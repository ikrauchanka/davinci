import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
    /* Realiza un programa que permita ingresar
        dos números enteros e indique cuál de ellos es el mayor
     */

        int numero1, numero2;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número entero uno: ");
        numero1 = input.nextInt();

        System.out.println("Ingrese un número entero dos: ");
        numero2 = input.nextInt();


        if (numero1 > numero2) {
            System.out.println("El numero1 (" + numero1 + ") es mayor");
        } else {
            System.out.println("El numero2 (" + numero2 + ") es mayor");
        }

    }
}

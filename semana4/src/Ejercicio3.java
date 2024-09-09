import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
    /* Realiza un programa que permita ingresar
       un número entero e indique si se trata de un número par o impar.
     */

        int numero1, numero2, numero3;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número entero uno: ");
        numero1 = input.nextInt();

        System.out.println("Ingrese un número entero dos: ");
        numero2 = input.nextInt();

        System.out.println("Ingrese un número entero tres: ");
        numero3 = input.nextInt();


        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El numero1 es major");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El numero2 es major");
        } else {
            System.out.println("El numero3 es major");
        }

    }
}

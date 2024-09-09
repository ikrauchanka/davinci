import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
    /* Realiza un programa que permita ingresar
       un número entero e indique si se trata de un número par o impar.
     */

        int numero;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par");
        } else {
            System.out.println("El numero: " + numero + " es impar");
        }

    }
}

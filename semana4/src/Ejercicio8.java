import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        /* Realiza un programa que permita al usuario ingresar
        dos números enteros. La computadora debe indicar si el
        mayor es divisible por el menor.
        (Un número entero a es divisible por un número entero b
        cuando el resto de la división entre a y b es 0.
         */

        int numero1, numero2;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número uno: ");
        numero1 = input.nextInt();

        System.out.println("Ingrese un número dos: ");
        numero2 = input.nextInt();

        if (numero1 % numero2 == 0) {
            System.out.println("numero1 es divisible por un numero2");
        } else if (numero2 % numero1 == 0 ){
            System.out.println("numero2 es divisible por un numero1");
        }else {
            System.out.println("los numeros son no divisible");
        }

    }
}

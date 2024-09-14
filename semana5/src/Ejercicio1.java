import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
    /* Actividad sobre operadores:
        Crear un programa en Java que solicite al usuario dos números enteros y
        realice las siguientes operaciones matemáticas: suma, resta,
        multiplicación, división, módulo y potencia. El programa deberá mostrar
        los resultados de cada operación en pantalla utilizando el método
        System.out.println().
        Objetivo: Practicar el uso de los operadores aritméticos en Java y
        afianzar los conocimientos sobre las operaciones matemáticas básicas.
             */

        int num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número uno: ");
        num1 = input.nextInt();

        System.out.println("Ingrese un número dos: ");
        num2 = input.nextInt();

        if (num2 == 0) {
            System.out.println("Por favor, elige un número para num2 que no sea cero.");
        }
        System.out.println("El suma " + num1 + " y " + num2 + " es " + (num1 + num2));
        System.out.println("El resta " + num1 + " y " + num2 + " es " + (num1 - num2));
        System.out.println("El multi " + num1 + " y " + num2 + " es " + (num1 * num2));
        System.out.println("El divi " + num1 + " y " + num2 + " es " + (num1 / num2));

    }
}

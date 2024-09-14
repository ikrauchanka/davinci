import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
    /* Actividad sobre condicionales anidados:
        Crear un programa en Java que solicite al usuario dos números enteros y
        determine cuál de ellos es el mayor. Si ambos números son iguales, el
        programa deberá mostrar un mensaje indicando que los números son
        iguales.
        Objetivo: Practicar el uso de los condicionales anidados en Java y
        afianzar los conocimientos sobre las comparaciones numéricas.
             */

        int num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número uno: ");
        num1 = input.nextInt();

        System.out.println("Ingrese un número dos: ");
        num2 = input.nextInt();

        if (num1 == num2) {
            System.out.println("los números son iguales.");
        } else if ( num1 > num2) {
            System.out.println("num1 > num2");
        } else {
            System.out.println("num2 > num1");
        }
    }
}

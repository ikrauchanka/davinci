import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // 3 Realiza un programa que permita ingresar un número entero. Debe mostrarse el número ingresado:
        // Multiplicado por 5.
        // Dividido por 2.

        int numeroEntero;

        System.out.println("Que es numero: ");
        Scanner lector = new Scanner(System.in);
        numeroEntero = lector.nextInt();

        System.out.println("Multiplicado por 5: " + (numeroEntero * 5));
        System.out.println("Dividido por 2: " + ((float) numeroEntero / 2));

    }
}
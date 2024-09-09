import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
    /* Realiza un programa que permita ingresar
       un número entero e indique si se trata de un número par o impar.
     */

        int candidadInscriptos, candidadAsientos;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese candidadInscriptos: ");
        candidadInscriptos = input.nextInt();

        System.out.println("Ingrese candidadAsientos: ");
        candidadAsientos = input.nextInt();


        if (candidadAsientos <  candidadInscriptos) {
            System.out.println("Faltan " + (candidadInscriptos -  candidadAsientos) + " asientos.");
        } else
            System.out.println("Habrá asientos suficientes para todos los participantes " + candidadInscriptos);

    }
}

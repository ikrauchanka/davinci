import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
    /* Realiza un programa que permita ingresar
       un número entero e indique si se trata de un número par o impar.
     */
        String nombre;
        int edad;
        float altura;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el nombre: ");
        nombre = input.nextLine();

        System.out.println("Ingrese edad : ");
        edad = input.nextInt();

        System.out.println("Ingrese altura : ");
        altura = input.nextFloat();

        System.out.println("Nombre\t Edad\t Altura\t ¿Entra al juego? (V/F)\t\n");

        if (altura >= 1.5 && edad >= 7) {
            System.out.println(nombre + "\t" + edad + "\t" + altura + "\t" + "V");
        } else {
            System.out.println(nombre + "\t" + edad + "\t" + altura + "\t" + "F");
        }

    }
}

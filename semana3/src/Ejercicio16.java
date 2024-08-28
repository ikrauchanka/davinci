import java.util.Scanner;

public class Ejercicio16 {


    public static void main(String[] args) {

        // 16 Escribe un programa que calcule el promedio de edad de tres personas.
        // Pide al usuario que ingrese la edad de cada persona.

        int edadUno, edadDos, edadTres;

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese edadUno: ");
        edadUno = lector.nextInt();

        System.out.println("Ingrese edadDos: ");
        edadDos = lector.nextInt();

        System.out.println("Ingrese edadTres: ");
        edadTres = lector.nextInt();

        System.out.println("El promedio es: "  + ((float)(edadUno + edadDos + edadTres) / 3));

    }
}

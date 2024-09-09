import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
    /*
        Realizar un algoritmo en el cual el usuario ingrese 2 notas
        de un estudiante, si el promedio es menor a 2, imprimir que reprobó,
        si esta entre 2 y 3, imprimir “posibilidad de recuperatorio”,
        y si es mayor a 3 colocar aprobó.
     */

        int nota1, nota2;
        float promedio;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese nota1: ");
        nota1 = input.nextInt();

        System.out.println("Ingrese nota2 : ");
        nota2 = input.nextInt();

        promedio = (float) (nota1 + nota2) / 2;

        System.out.println("el promedio es: " + promedio);

        if ( promedio > 3) {
            System.out.println("aprobó");
        } else if (promedio >= 2) {
            System.out.println("posibilidad de recuperatorio");
        } else {
            System.out.println("reprobó");
        }
    }
}

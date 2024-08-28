import java.util.Scanner;

public class Ejercicio5 {


    public static void main(String[] args) {

        //5 Realiza un programa que permita ingresar dos números naturales.
        //Debes mostrar los resultados para las 4 operaciones matemáticas básicas con los números ingresados.

        int num1, num2;
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el numero 1 ");
        num1 = lector.nextInt();

        System.out.println("Ingrese el numero 2 ");
        num2 = lector.nextInt();

        System.out.println("La suma es " + (num1 + num2));
        System.out.println("La resta es " + (num1 - num2));
        System.out.println("La multi es " + (num1 * num2));
        System.out.println("La divi es " + (num1 / num2));

    }
}

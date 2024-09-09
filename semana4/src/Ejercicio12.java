import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
    /* Se necesita desarrollar un algoritmo que permita ingresar tres
    temperaturas correspondientes a diferentes momentos de un día y determinar:
    Cuál es el promedio de temperaturas
    Si existe alguna temperatura que sea mayor al promedio.
     */

        float temp1, temp2, temp3, promedio;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese temp1: ");
        temp1 = input.nextFloat();

        System.out.println("Ingrese temp2 : ");
        temp2 = input.nextFloat();

        System.out.println("Ingrese temp3: ");
        temp3 = input.nextFloat();

        promedio = (temp1 + temp2 + temp3)/ 3;

        System.out.println("el promedio es: " + promedio);

        if ( temp1 > promedio) {
            System.out.println("temp1 es mayor al promedio");
        } else if (temp2 > promedio) {
            System.out.println("temp2 es mayor al promedio");
        } else if (temp3 > promedio){
            System.out.println("temp3 es mayor al promedio");
        } else {
            System.out.println("temperaturas son iguales");
        }
    }
}
